package com.ab.labs.wd1.task;

import com.ab.labs.wd1.entity.Ball;
import com.ab.labs.wd1.storage.Basket;

public class Task9 implements LabTask {
    @Override
    public void execute() {
        System.out.println("--- 9 ---");

        Basket b = new Basket();
        b.addBalls(
                new Ball("blue", 120),
                new Ball("green", 230),
                new Ball("yellow", 200),
                new Ball("blue", 180)
        );
        System.out.println("Basket weight: " + b.getWeight());
        System.out.println("Quantity of blue balls: " + b.countBallsByColor("blue"));
    }
}
