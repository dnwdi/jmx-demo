package com.dnwdi.jmx.mxbean;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by max on 17/03/2017.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        Queue<String> queue = new ArrayBlockingQueue<String>(10);
        queue.add("request 1");
        queue.add("request 2");
        queue.add("request 3");
        QueueSampler queueSampler = new QueueSampler(queue);
        ObjectName name = new ObjectName("com.dnwdi.jmx.mxbean:type=QueueSampler");
        mbs.registerMBean(queueSampler, name);

        System.out.println("waiting...");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
