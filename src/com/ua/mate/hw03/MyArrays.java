package com.ua.mate.hw03;

public class MyArrays {
    public static int[] mergeArray(int[] leftArray, int[] rightArray) {
        int leftPosition = 0, rightPosition = 0;
        int[] result = new int[leftArray.length + rightArray.length];

        for (int i = 0; i < (leftArray.length + rightArray.length); i++) {
            if (rightPosition < rightArray.length && leftPosition < leftArray.length) {
                if (leftArray[leftPosition] > rightArray[rightPosition]) {
                    result[i] = rightArray[rightPosition];
                    rightPosition++;
                } else {
                    result[i] = leftArray[leftPosition];
                    leftPosition++;
                }
            } else if (rightPosition < rightArray.length) {
                result[i] = rightArray[rightPosition];
                rightPosition++;
            } else {
                result[i] = leftArray[leftPosition];
                leftPosition++;
            }
        }
        return result;
    }
}
