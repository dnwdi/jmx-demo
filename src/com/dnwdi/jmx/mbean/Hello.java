package com.dnwdi.jmx.mbean;

/**
 * Created by max on 17/03/2017.
 */
public class Hello implements HelloMBean {

    private final String name = "dnwdi";
    private int cache = 200;

    @Override
    public void sayHello() {
        System.out.println("hello, I'm dnwdi!");
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCache() {
        return this.cache;
    }

    @Override
    public void setCache(int cacheSize) {
        this.cache = cacheSize;
        System.out.println("cache size now is " + cache);
    }
}
