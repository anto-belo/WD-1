package com.ab.labs.wd1;

import com.ab.labs.wd1.task.LabTask;
import com.ab.labs.wd1.task.Task1;
import com.ab.labs.wd1.task.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LabTask> tasks = new ArrayList<>(Arrays.asList(new Task1(3, 5), new Task2(3, 7)));
        int i = 1;
        for (LabTask task : tasks) {
            System.out.print(i++ + ". ");
            task.execute();
            System.out.println();
        }
    }
}
