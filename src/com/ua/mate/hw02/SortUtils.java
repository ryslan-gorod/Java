package com.ua.mate.hw02;

public class SortUtils {

    public static void sortIntBubble(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array = swapElements(array, j, i);
                }
            }
        }
    }

    public static void sortIntСhoice(int[] array) {
        int min, tmp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            array = swapElements(array, min, i);
        }
    }

    public static void sortIntInserts(int[] array) {
        int tmp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                tmp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && tmp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = tmp;
            }
        }
    }

    public static void sortIntQuick(int[] array, int firstElement, int lastElement) {

        int tmp;
        if (array.length == 0) return;
        if (firstElement >= lastElement) return;

        int midleElement = array[firstElement + (lastElement - firstElement) / 2];

        int i = firstElement, j = lastElement;
        while (i <= j) {
            while (array[i] < midleElement) {
                i++;
            }
            while (array[j] > midleElement) {
                j--;
            }
            if (i <= j) {
                array = swapElements(array, i, j);
                i++;
                j--;
            }
        }
        if (firstElement < j)
            sortIntQuick(array, firstElement, j);
        if (lastElement > i)
            sortIntQuick(array, i, lastElement);
    }

    public static int[] sortIntMerge(int[] array) {
        if (array.length < 2) return array;

        int[] leftArray = new int[array.length / 2];
        int[] rightArray = new int[array.length - leftArray.length];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[leftArray.length + i];
        }
        return mergeArray(sortIntMerge(leftArray), sortIntMerge(rightArray));
    }

    private static int[] mergeArray(int[] leftArray, int[] rightArray) {
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

    private static int[] swapElements(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
        return array;
    }
}


