/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bliss.framework.thriftgen.xgame.xgameservice;

import com.bliss.framework.common.LogUtil;
import com.bliss.framework.thriftgen.xgame.tcommon.AdminCommand;
import com.bliss.framework.thriftgen.xgame.tcommon.ServiceStatus;
import com.bliss.framework.thriftgen.xgame.tcommon.TAdminRequest;
import com.bliss.framework.thriftgen.xgame.tcommon.TResponseInfo;
import com.nct.framework.util.ConvertUtils;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.apache.thrift.TException;

/**
 *
 * @author huynxt
 */
public abstract class XGameProcessor implements TXGameService.Iface {

    protected String nameInstance = StringUtils.EMPTY;
    protected ServiceStatus status = ServiceStatus.STARTED;

    protected int timeShutdown;

    public boolean isShutdown() {
        return status != ServiceStatus.STARTED;
    }

    @Override
    public boolean ping() throws TException {
        return true;
    }

    public abstract void onBeginShutdown(int timeShutdown);

    public abstract void onShutdown();

    public abstract void onRestart();

    public abstract void onReload();

    public TResponseInfo onExecute(TAdminRequest req) {
        return null;
    }

    private void shutdown(TAdminRequest shutdownData) {
        if (status == ServiceStatus.STARTED) {
            status = ServiceStatus.SHUTTING_DOWN;

            String data = new String(shutdownData.getMsgData());
            int shutdownTime = ConvertUtils.toInt(data);

            LogUtil.printDebugAll("SHUTDOWN MODULE IN : " + shutdownTime);

            this.timeShutdown = shutdownTime;
            onBeginShutdown(shutdownTime);

            ScheduledExecutorService schedules = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);
            schedules.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    LogUtil.printDebugAll("check shutdown...");
                    if (canShutdown()) {
                        if (status != ServiceStatus.STOPPED) {
                            onShutdown();
                        }
                        status = ServiceStatus.STOPPED;
                        //                    System.exit(0);
                    }
                }
            }, 1, 1, TimeUnit.MINUTES);
        }
    }

    protected int timeoutShutdown = 2;

    public boolean canShutdown() {
        this.timeShutdown--;
        return this.timeShutdown < 0;
    }

    @Override
    public ServiceStatus getStatus() throws TException {
        return ServiceStatus.findByValue(status.ordinal());
    }

    @Override
    public final TResponseInfo perform(AdminCommand cmd, String token, TAdminRequest data) throws TException {
        switch (cmd) {
            case EXECUTE:
                return onExecute(data);
            case RELOAD:
                onReload();
                break;
            case RESTART:
                onRestart();
                break;
            case SHUTDOWN:
                shutdown(data);
                break;
        }
        return null;
    }
}
