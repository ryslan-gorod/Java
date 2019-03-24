package calcconsole.hw01;

public class MySort {
    public void sortIntBubble(int[] array){
        int tmp;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] > array[j]){ // тут якщо поміняти < на  > то сортуємо по спаданню
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    public static void sortIntVyborom (int[] array){
        int min, tmp;
        for (int i = 0; i < array.length-1; i++){
            min = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[min])
                    min = j;
            }
            tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
        }
    }

    public void sortIntVstavky(int[] array) {
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

    public void sortIntQuick(int[] array, int firstElement, int lastElement) {

        int tmp;
        if (array.length == 0) return;
        if (firstElement >= lastElement) return;

        int midleElement = array[firstElement + (lastElement - firstElement) / 2];

        int i = firstElement, j = lastElement;
        while (i <= j) {
            while (array[i] < midleElement){
                i++;
            }
            while (array[j] > midleElement){
                j--;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if (firstElement < j)
            sortIntQuick(array, firstElement, j);
        if (lastElement > i)
            sortIntQuick(array, i, lastElement);
    }

    public int[] sortIntMerge(int[] array){
        if (array.length < 2) return array;

        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - left.length];

        for (int i = 0; i < left.length; i++){
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++){
            right[i] = array[left.length + i];
        }
        return merge(sortIntMerge(left), sortIntMerge(right));
    }
    public int[] merge(int[] left, int[] right){
        int l = 0, r = 0;
        int[] result = new int[left.length + right.length];

        for (int i = 0; i < (left.length + right.length); i++){
            if (r < right.length && l < left.length){
                if (left[l] > right[r]){
                    result[i] = right[r];
                    r++;
                }
                else {
                    result[i] = left[l];
                    l++;
                }
            } else if (r < right.length){
                result[i] = right[r];
                r++;
            } else {
                result[i] = left[l];
                l++;
            }
        }
        return result;
    }
 }
