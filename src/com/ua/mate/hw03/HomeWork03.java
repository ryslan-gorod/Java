package com.ua.mate.hw03;

import java.util.Arrays;

public class HomeWork03 {
    public static void main(String[] args) {
        //Task from https://stepik.org/lesson/12762/step/9?unit=3110

        int[] firstArray = new int[]{0, 2, 2, 5, 8, 15};
        int[] secondArray = new int[]{1, 3, 3, 5, 6, 9};
        int[] result = MyArrays.mergeArray(firstArray, secondArray);
        System.out.println(Arrays.toString(result));

        //Task from https://stepik.org/lesson/12762/step/10?unit=3110
        Role role = new Role();
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(role.printTextPerRole(roles, textLines));
    }
}
