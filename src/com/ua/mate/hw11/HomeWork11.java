package com.ua.mate.hw11;

import java.util.*;
import java.util.stream.Collectors;


public class HomeWork11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine().toLowerCase();
        String result = str.replaceAll("\\W", "_").replace("__", "_");
        String[] strings = result.split("_");
        Arrays.stream(strings)
                .map(x -> new MyString(x))// Create object for method collect
                .collect(Collectors.groupingBy(MyString::getStr, Collectors.counting())) // counting unic words
                .entrySet()
                .stream()
                .sorted((o1, o2) -> (int) (o2.getValue() - o1.getValue()))
                .map(x -> x.getKey())//back from object to String
                .limit(10)
                .forEach(x -> System.out.println(x));
    }

    static class MyString {
        private String str;

        public MyString(String str) {
            this.str = str;
        }

        public String getStr() {
            return str;
        }
    }
}
