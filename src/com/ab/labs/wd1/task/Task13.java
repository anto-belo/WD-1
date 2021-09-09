package com.ab.labs.wd1.task;

import com.ab.labs.wd1.entity.Book;
import com.ab.labs.wd1.entity.ProgrammerBook;

public class Task13 implements LabTask {
    @Override
    public void execute() {
        Book b1 = new ProgrammerBook("A", "A.B.", 120, "0-0000-0000-0", "J+#", 1);
        ProgrammerBook b2 = new ProgrammerBook("A", "A.B.", 120, "0-0000-0000-0", "J+#", 1);
        ProgrammerBook b3 = new ProgrammerBook("B", "A.B.", 100, "0-0000-0000-0", "J+#", 1);

        System.out.println("\n1. " + b1 + " (hash:" + b1.hashCode() + ")");
        System.out.println("2. " + b2 + " (hash:" + b2.hashCode() + ")");
        System.out.println("3. " + b3 + " (hash:" + b3.hashCode() + ")");

        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1.equals(b2): " + b1.equals(b2));
        System.out.println("b1.equals(b3): " + b1.equals(b3));
    }
}
