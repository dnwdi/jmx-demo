package com.dnwdi.jmx.mxbean;

import java.util.Date;
import java.util.Queue;

/**
 * Created by max on 17/03/2017.
 */
public class QueueSampler implements QueueSamplerMXBean{

    private Queue<String> queue;

    public QueueSampler(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public QueueSample getQueueSample() {
        synchronized (queue){
            return new QueueSample(new Date(), queue.size(), queue.peek());
        }
    }

    @Override
    public void clearQueue() {
        synchronized (queue){
            queue.clear();
        }
    }
}
