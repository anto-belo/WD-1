package com.ab.labs.wd1.task;

import java.util.Arrays;

public class Task7 implements LabTask {
    private final int[] a;

    public Task7(int... a) {
        this.a = a;
    }

    @Override
    public void execute() {
        System.out.println("--- 7 ---");
        System.out.print(Arrays.toString(a) + " -> ");
        sortArray();
        System.out.println(Arrays.toString(a));
    }

    private void sortArray() {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = (i > 0) ? i - 2 : 0;
            }
        }
    }
}
