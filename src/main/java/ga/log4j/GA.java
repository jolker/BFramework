package ga.log4j;

import java.io.File;
import java.util.Enumeration;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PropertyConfigurator;

public class GA {

    public static Logger app;
    public static Logger agent;
    public static Logger service;
    public static Logger jdbc;
    public static Logger audit;
    public static Logger pool;
    public static Logger config;
    public static Logger monitor;
    public static Logger monitor_stats;
    public static Logger sysmessage;
    public static Logger timer;
    public static Logger misc;
    public static Logger gm;
    public static Logger crypto;
    public static Logger billing;
    public static Logger plugin;
    public static Logger licence;
    public static Logger resource;
    public static Logger snmp;
    public static final String CONFIG_HOME = "conf";
    public static final String CONFIG_FILE = "log4j.ini";
    private static String HOME_PATH = ".";
    private static String APP_ENV = "development";

    static {
        HOME_PATH = System.getProperty("apppath");
        APP_ENV = System.getProperty("appenv");
        if (APP_ENV == null) {
            APP_ENV = "";
        }
        if (!APP_ENV.equals("")) {
            APP_ENV += ".";
        }
        String configFile = HOME_PATH + File.separator + "conf" + File.separator + APP_ENV + "log4j.ini";
        configure(configFile);
    }

    public static void setTrans(int trans) {
        MDC.put("trans", Integer.valueOf(trans));
    }

    public static void setTrans(long trans) {
        MDC.put("trans", Long.valueOf(trans));
    }

    public static void clearTrans() {
        MDC.remove("trans");
    }

    public static void setType(String type) {
        if (type == null) {
            MDC.remove("type");
        } else {
            MDC.put("type", type);
        }
    }

    public static void clearType() {
        MDC.remove("type");
    }

    public static int count(Enumeration e) {
        int count = 0;
        while (e.hasMoreElements()) {
            count++;
            e.nextElement();
        }
        return count;
    }

    public static synchronized void configure(String logPath) {
        try {
            System.out.println("configuring logPath: " + logPath);
            PropertyConfigurator.configure(logPath);
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        app = LogManager.getLogger("ga.app");

        agent = LogManager.getLogger("ga.agent");

        service = LogManager.getLogger("ga.service");

        jdbc = LogManager.getLogger("ga.jdbc");

        audit = LogManager.getLogger("ga.audit");

        pool = LogManager.getLogger("ga.pool");

        config = LogManager.getLogger("ga.config");

        monitor = LogManager.getLogger("ga.monitor");

        monitor_stats = LogManager.getLogger("ga.monitor.stats");

        sysmessage = LogManager.getLogger("ga.sysmessage");

        timer = LogManager.getLogger("ga.timer");

        misc = LogManager.getLogger("ga.misc");

        gm = LogManager.getLogger("ga.gm");

        crypto = LogManager.getLogger("ga.crypto");

        billing = LogManager.getLogger("ga.billing");

        plugin = LogManager.getLogger("ga.plugin");

        licence = LogManager.getLogger("ga.licence");

        resource = LogManager.getLogger("ga.resource");

        snmp = LogManager.getLogger("ga.snmp");

        audit.setAdditivity(false);
        monitor_stats.setAdditivity(false);
        monitor_stats.setLevel(Level.DEBUG);
    }
}
