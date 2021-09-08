package com.ab.labs.wd1.task;

import java.util.Arrays;

public class Task4 implements LabTask {

    private final int[] a;

    public Task4(int... a) {
        this.a = a;
    }

    @Override
    public void execute() {
        System.out.print("In " + Arrays.toString(a)
                + " primary numbers are under indexes: ");
        boolean isAnyPrimary = false;
        for (int i = 0; i < a.length; i++) {
            if (isPrimary(a[i])) {
                System.out.print(i + " ");
                isAnyPrimary = true;
            }
        }
        if (!isAnyPrimary) {
            System.out.print("[no primary]");
        }
    }

    private boolean isPrimary(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
