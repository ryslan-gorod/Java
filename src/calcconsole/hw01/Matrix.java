package calcconsole.hw01;

import java.util.Arrays;

public class Matrix {
    int [][] matrix;
    public enum SizeElement {MIN,MAX};

    public void initMatrix(int x, int y){
        if (x < 1) x = 1;
        if (y < 1) y = 1;
        matrix = new int[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0 ; j < y ;j++){
                matrix[i][j] = (int)(Math.random()*1000);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public  int getElememt (SizeElement sizeElement){
        int element = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length ;j++){
                if (sizeElement == SizeElement.MAX){
                    if (element <= matrix[i][j]){
                        element = matrix[i][j];
                    }
                }
                if (sizeElement == SizeElement.MIN){
                    if (element >= matrix[i][j]){
                        element = matrix[i][j];
                    }
                }
            }
        }
        return element;
    }

}
