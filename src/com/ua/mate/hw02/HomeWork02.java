package com.ua.mate.hw02;

import com.ua.mate.hw02.deposit.Deposit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HomeWork02 {
    public static void main(String[] args) {

        // Task 2.1
        Deposit deposit = new Deposit.DepositCreater("USD", 20000.0).create();
        System.out.println(deposit);
        Deposit deposit1 = new Deposit.DepositCreater("UAH", 10000).setCountMonth(5).setRate(18.5).create();
        System.out.println(deposit1);

        //Task 2.2
        //Anonymous class - Comparator
        Integer[] array = new Integer[]{5, 3, 6, 4, 8, 2, 7, 1, 9};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        Collections.sort(list);
        System.out.println(list.toString());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                int first = ((Integer) o1).intValue();
                int second = ((Integer) o2).intValue();
                return first < second ? 1 : first == second ? 0 : -1;
            }
        });
        System.out.println(list.toString());
        // attachment class, static embedded class, local class
        FootballTeam footballTeam = new FootballTeam();
        FootballTeam.Player player = footballTeam.new Player();//attachment class
        FootballTeam.Federation federation = new FootballTeam.Federation();//static embedded class
        footballTeam.play("Lviv", "Ukraine");//local class
        System.out.println(footballTeam.getPlaceOfGame());

        //Task 2.3
        int[] arr = new int[]{5, 3, 6, 4, 1, 2, 8, 5, 4, 7, 9, 6, 3, 1, 2, 5, 4, 5, 23, 9, 2, 1, 4, 5};
        //SortUtils.sortIntBubble(arr);
        SortUtils.sortIntСhoice(arr);
        System.out.println(Arrays.toString(SortUtils.sortIntMerge(arr)));

        //Task 2.4
        Fraction fraction = new Fraction(1, 6);
        System.out.println(fraction);
        Fraction fraction1 = new Fraction(1, 6);
        System.out.println(fraction1);
        System.out.println(fraction.add(fraction1));
    }
}
