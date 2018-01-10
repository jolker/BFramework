/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bliss.framework.util;

import com.bliss.framework.annotation.LogIndex;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.log4j.Logger;
import org.cliffc.high_scale_lib.NonBlockingHashMap;

/**
 *
 * @author anhtst
 */
public class LogTabUtils {
    private static final String COMMA_DELIMITER = "|";
    private static final String BLANK = "-";
    private static Map<String, LogTabUtils> instances = new NonBlockingHashMap();
    private static final Lock createLock = new ReentrantLock();
    private String tableLogger;

    private LogTabUtils(final String tableLogger) {
        this.tableLogger = tableLogger;
    }

    public static LogTabUtils getInstance(final String tableLogger) {
        if (!instances.containsKey(tableLogger)) {
            try {
                createLock.lock();
                if (!instances.containsKey(tableLogger)) {
                    instances.put(tableLogger, new LogTabUtils(tableLogger));
                }
            } finally {
                createLock.unlock();
            }
        }
        return instances.get(tableLogger);
    }

    public void writeLog(final List<Object> args) {
        StringBuffer messLog = new StringBuffer();
        for (Object ob : args) {
            messLog.append(ObjectUtils.toString(ob, BLANK)).append(COMMA_DELIMITER);
        }
        Logger.getLogger(tableLogger).error(messLog);
    }

    public void writeLog(final Object object) throws IllegalAccessException {
        StringBuffer messLog = new StringBuffer();
        for(int i = 0; i < object.getClass().getDeclaredFields().length; i++) {
            for (Field field : object.getClass().getDeclaredFields()) {
                Annotation[] annotations = field.getDeclaredAnnotations();
                int index = -1;
                for (Annotation annotation : annotations) {
                    if (annotation instanceof LogIndex) {
                        index = ((LogIndex) annotation).index();
                    }
                }
                if (index == i) {
                    messLog.append(ObjectUtils.toString(field.get(object), BLANK)).append(COMMA_DELIMITER);
                    break;
                }
            }
        }

        System.out.println("table Looger >> " + tableLogger);
        Logger.getLogger(tableLogger).info(messLog);
    }
}
