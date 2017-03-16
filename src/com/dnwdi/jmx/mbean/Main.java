package com.dnwdi.jmx.mbean;

import com.dnwdi.jmx.mbean.Hello;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by max on 17/03/2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.dnwdi.jmx.mbean:type=Hello");
        Hello hello = new Hello();
        mbs.registerMBean(hello, name);
        System.out.println("waiting...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
