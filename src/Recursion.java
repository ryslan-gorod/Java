public class Recursion {
    public int fibonachi (int number){
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        else{
            return fibonachi(number - 1) + fibonachi(number - 2);
        }
    }
    public double factorial(double number){
        if (number == 0) return 1;
        return number * factorial(number-1);
    }

    public double teylorSeries(double number, double count){
        if (count == 0 ){
            return 1;
        }
        else if (count == 1 ){
            return number;
        }
        else{
            return teylorSeries(Math.pow(number, count)/factorial(count),count-1) +
                    teylorSeries(Math.pow(number, count-1)/factorial(count-1),count-2);
        }
    }

}
