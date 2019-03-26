package com.ua.mate.hw01;

public class MyMath {
    public int setToPow2(int number) {
        return number * number;
    }

    public int setToPow3(int number) {
        return number * number * number;
    }

    public int setToPowN(int number, int pow) {
        int result = 1;
        if (pow < 1) throw new Error("Pow < 1");
        for (int i = 0; i < pow; i++) {
            result *= number;
        }
        return result;
    }
}
