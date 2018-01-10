/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bliss.framework.jobqueue;

import com.bliss.framework.gearman.JobEnt;
import com.bliss.framework.jobqueue.gearman.GearmanClient;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author huynxt
 */
public abstract class JobQueueClient {

    final static Map<String, JobQueueClient> instances = new HashMap<>();

    protected String function = "";

    public static JobQueueClient getInstance(String instanceName) {

        JobQueueClient instance = instances.get(instanceName);
        if (instance == null) {
            synchronized (JobQueueClient.class) {
                instance = instances.get(instanceName);
                if (instance == null) {

                    instance = new GearmanClient(instanceName);
                    instances.put(instanceName, instance);
                }
            }
        }
        return instance;
    }

    public abstract boolean push(JobEnt jobIn);

    public abstract boolean push(JobEnt jobIn, String function);

    public abstract Long getTotalErrors();
}
