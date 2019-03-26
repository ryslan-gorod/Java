package com.ua.mate.hw01;

public class HomeWork01 {

    public static void main(String[] args) throws Exception {

        // Task 1.1

        Footbol f = new Footbol();
        System.out.println(f.getResultOfBettings(3, 1, 3, 1));
        System.out.println(f.getResultOfBettings(3, 5, 1, 4));
        System.out.println(f.getResultOfBettings(3, 1, 0, 1));
        System.out.println(f.getResultOfBettings(5, 4, 0, 3));

        // Task 1.2

        Rhombus r = new Rhombus();
        r.printRhombus(12);

        // Task 1.3

        MyMath m = new MyMath();
        System.out.println(m.setToPow2(25));
        System.out.println(m.setToPow3(25));
        System.out.println(m.setToPowN(25, 5));

        // Task 1.4

        Recursion recursion = new Recursion();
        System.out.println(recursion.fibonachi(10));
        System.out.println(recursion.factorial(10));
        System.out.println("teilor - " + recursion.teylorSeries(5, 4));

        // Task 1.5

        MySort ms = new MySort();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        //System.out.println(Arrays.toString(array));
        long t = System.currentTimeMillis();
        //ms.sortIntBubble(array);// 17 min.
        //ms.sortIntChoise(array); // 8 min.
        //ms.sortIntInserts(array); // 1 min.
        //int[] tmp = ms.sortIntMerge(array); //297 mc.
        ms.sortIntQuick(array, 0, array.length - 1);// 110 mc.
        System.out.println("Sorting time (mc.) - " + (System.currentTimeMillis() - t));
        System.out.println("Sorting time (min.) - " + ((System.currentTimeMillis() - t)) / 60000);

        // Task 1.6

        Matrix matrix = new Matrix();
        matrix.initMatrix(5, 7);
        matrix.printMatrix();
        System.out.println("Min element - " + matrix.getElememt(Matrix.SizeElement.MIN));
        System.out.println("Max element - " + matrix.getElememt(Matrix.SizeElement.MAX));

        // Task 1.7

        Book[] books = new Book[]{
                new Book("Aelita", "Tolstoy", 257),
                new Book("My Life and work", "Ford", 178)
        };
        Person p1 = new Person("Ivan", "Ivanov", 25, books);
        Person p2 = new Person("Ivan", "Ivanov", 25);
        //System.out.println(p1.hashCode());
        //System.out.println(p2.hashCode());
        //System.out.println(p1.equals(p2));
        Person p3 = (Person) p1.clone();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}