package com.ab.labs.wd1.storage;

import com.ab.labs.wd1.entity.Ball;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> balls;
    private double weight;

    public Basket() {
        balls = new ArrayList<>();
    }

    public double getWeight() {
        return weight;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball b) {
        balls.add(b);
        weight += b.getWeight();
    }

    public void addBalls(Ball... balls) {
        for (Ball b : balls) {
            addBall(b);
        }
    }

    public int countBallsByColor(String color) {
        int count = 0;
        for (Ball b : balls) {
            if (b.getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }
}
