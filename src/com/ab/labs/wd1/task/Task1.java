package com.ab.labs.wd1.task;

import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.abs;

public class Task1 implements LabTask {
    private final int x;
    private final int y;

    public Task1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        System.out.println("--- 1 ---");
        System.out.printf("f(%d, %d) = %f\n", x, y, solveExpression());
    }

    private double solveExpression() {
        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - 2 * x / (1 + x * x * y * y));
        return numerator / denominator + x;
    }
}
