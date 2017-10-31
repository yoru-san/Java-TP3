package com.ynov.threading;

public class SampleThreadOne implements Runnable {
    private String sentence;
    private int iterations = 10_000;

    public SampleThreadOne(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterations; i++) {
            System.out.println(i + " " + sentence);
        }
    }
}
