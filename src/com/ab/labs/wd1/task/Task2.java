package com.ab.labs.wd1.task;

public class Task2 implements LabTask {
    private final int x;
    private final int y;

    public Task2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        System.out.println("--- 2 ---");

        final int x1 = -4;
        final int y1 = 0;
        final int w1 = 8;
        final int h1 = 5;

        final int x2 = -6;
        final int y2 = -3;
        final int w2 = 12;
        final int h2 = 3;

        boolean result = inRectangle(x1, y1, w1, h1) || inRectangle(x2, y2, w2, h2);
        System.out.printf("Point (%d, %d) is in the specified area: %s\n", x, y, result);
    }

    private boolean inRectangle(int rectStartX, int rectStartY,
                                int rectWidth, int rectHeight) {
        return rectStartX <= x && x <= rectStartX + rectWidth
                && rectStartY <= y && y <= rectStartY + rectHeight;
    }
}
