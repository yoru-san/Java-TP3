package com.ynov;

import com.ynov.threading.SampleThreadTwo;

public class Exercise2 {
    public static void main(String[] args) {
        SampleThreadTwo s1 = new SampleThreadTwo("Hello ", 10);
        SampleThreadTwo s2 = new SampleThreadTwo("World ", 500);
        SampleThreadTwo s3 = new SampleThreadTwo("Everybody ", 500);

        s1.start();
        s2.start();
        s3.start();

        try {
            s1.join();
            s2.join();
            s3.join();
        } catch (Exception e) {
            e.getMessage();
        }

        System.exit(0);
    }
}
