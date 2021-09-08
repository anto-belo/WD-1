package com.ab.labs.wd1;

import com.ab.labs.wd1.task.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LabTask> tasks = new ArrayList<>(Arrays.asList(new Task1(3, 5)
                , new Task2(3, 7)
                , new Task3(5, 6.1, 0.2)
                , new Task4(1, 0, 3, 6, 5, 14)
                , new Task5(1, 3, 2, 2, 3, 4, 2, 5, 4)
                , new Task6(1, 2, 3, 4, 5, 6, 7, 8)
                , new Task7(4, 8, 2, 7, 6, 4, -1, 10)
                , new Task8(new int[]{1, 3, 6, 12, 14, 26, 27, 39}, 2, 4, 4, 6, 18, 19, 21, 26)));
        int i = 1;
        for (LabTask task : tasks) {
            System.out.print(i++ + ". ");
            task.execute();
            System.out.println();
        }
    }
}
