package com.ab.labs.wd1.task;

public class Task6 implements LabTask {
    private final int[] a;

    public Task6(int... a) {
        this.a = a;
    }

    @Override
    public void execute() {
        int[][] b = createMatrix();
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%2d ", b[i][j]);
            }
        }
    }

    private int[][] createMatrix() {
        int[][] b = new int[a.length][a.length];
        int temp;
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a, 0, b[i], 0, a.length);
            temp = a[0];
            System.arraycopy(a, 1, a, 0, a.length - 1);
            a[a.length - 1] = temp;
        }
        return b;
    }
}
