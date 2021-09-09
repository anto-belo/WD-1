package com.ab.labs.wd1.task;

import java.util.Arrays;

public class Task5 implements LabTask {
    private final int[] a;

    public Task5(int... a) {
        this.a = a;
    }

    @Override
    public void execute() {
        System.out.println("--- 5 ---");
        System.out.println("For " + Arrays.toString(a) + " K = "
                + countEqualOrLessThenPrevElements());
    }

    private int countEqualOrLessThenPrevElements() {
        int min = a[0];
        int k = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > min) {
                min = a[i];
            } else {
                k++;
            }
        }
        return k;
    }
}
