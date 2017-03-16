package com.dnwdi.jmx.mbean;

/**
 * Created by max on 17/03/2017.
 */
public interface HelloMBean {

    void sayHello();
    int add(int x, int y);

    String getName();
    int getCache();
    void setCache(int cache);

}
