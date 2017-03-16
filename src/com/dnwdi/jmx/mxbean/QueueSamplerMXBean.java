package com.dnwdi.jmx.mxbean;

/**
 * Created by max on 17/03/2017.
 */
public interface QueueSamplerMXBean {
    QueueSample getQueueSample();
    void clearQueue();

}
