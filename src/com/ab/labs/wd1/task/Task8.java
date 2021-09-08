package com.ab.labs.wd1.task;

import java.util.Arrays;

public class Task8 implements LabTask {
    private final int[] a;
    private final int[] b;

    public Task8(int[] a, int... b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.print("Places to insert b in a: ");
        int[] positions = findPlacesToInsert();
        for (int i = 0; i < positions.length; i++) {
            System.out.printf("\nb[%d] = %d after %d", i, b[i], positions[i]);
        }
    }

    private int[] findPlacesToInsert() {
        int p = 0;
        int[] positions = new int[b.length];
        for (int i = 1; i < a.length; i++) {
            while (p < b.length && b[p] < a[i]) {
                positions[p++] = i - 1;
            }
        }
        return positions;
    }
}