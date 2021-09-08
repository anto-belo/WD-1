package com.ab.labs.wd1.task;

public class Task3 implements LabTask {
    private final double a;
    private final double b;
    private final double h;

    public Task3(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public void execute() {
        System.out.print(createTable());
    }

    private String createTable() {
        StringBuilder table = new StringBuilder("\n x | tan \n");
        table.append("---------");
        double step = a;
        double iterationsCount = Math.floor((b - a) / h);
        for (int i = 0; i <= iterationsCount; i++) {
            table.append(String.format("\n| %.3f | %.3f", step, Math.tan(step)));
            step += h;
        }
        return table.toString();
    }
}
