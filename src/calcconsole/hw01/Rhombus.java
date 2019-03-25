package calcconsole.hw01;

public class Rhombus {
    public void printRhombus(int countStar) {
        if (countStar < 3) countStar = 3;
        if (countStar % 2 == 0) countStar++;
        int center = countStar / 2;
        for (int i = 0; i < countStar; i++) {
            for (int j = 0; j < countStar; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    if (j >= center + i - countStar + 1 && j <= center - i + countStar - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
