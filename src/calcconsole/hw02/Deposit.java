package calcconsole.hw02;

public class Deposit {
    private String currency;
    private int countMonth;
    private double rate;
    private double sum;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCountMonth(int countMonth) {
        this.countMonth = countMonth;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getCurrency() {
        return currency;
    }

    public int getCountMonth() {
        return countMonth;
    }

    public double getRate() {
        return rate;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "currency='" + currency + '\'' +
                ", countMonth=" + countMonth +
                ", rate=" + rate +
                ", sum=" + sum +
                '}';
    }
}
