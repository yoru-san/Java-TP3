package com.ynov;

import com.ynov.threading.SampleThreadOne;

public class Exercise1 {
    public static void main(String[] args) {

        Thread s1 = new Thread(new SampleThreadOne("Hello "));
        Thread s2 = new Thread(new SampleThreadOne("World "));
        Thread s3 = new Thread(new SampleThreadOne("Everybody "));

        s1.start();
        s2.start();
        s3.start();
    }
}
