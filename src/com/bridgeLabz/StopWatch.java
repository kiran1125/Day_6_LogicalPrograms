package com.bridgeLabz;

public class StopWatch {
    long start = 0;
    long stop = 0;
    long diff = 0;
    public void start(){
        start = System.currentTimeMillis();
        System.out.println("Start time is : " + start);
    }
    public void stop (){
        stop = System.currentTimeMillis();
        System.out.println("Stop time is : " + stop);
    }
    public void diff(){
        System.out.println("time taken : " + (stop - start));
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        stopWatch.diff();

    }
}
