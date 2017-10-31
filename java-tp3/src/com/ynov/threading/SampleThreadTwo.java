package com.ynov.threading;

public class SampleThreadTwo extends Thread {
    private String sentence;
    private int timeToWait;

    public SampleThreadTwo(String sentence, int timeToWait) {
        this.sentence = sentence;
        this.timeToWait = timeToWait;
    }

    @Override
    public void run() {
        try {
            sleep(timeToWait);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sentence);
    }
}
