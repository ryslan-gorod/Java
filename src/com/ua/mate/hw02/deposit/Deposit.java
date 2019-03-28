package com.ua.mate.hw02.deposit;

public class Deposit {
    private String currency;
    private int countMonth;
    private double rate;
    private double sum;

    public Deposit(String currency, double sum) {
        this.sum = sum;
        this.currency = currency;
    }

    public static class DepositCreater {

        protected Deposit deposit;

        public DepositCreater(String currency, double sum) {
            this.deposit = new Deposit(currency, sum);
        }

        public DepositCreater setCountMonth(int countMonth) {
            this.deposit.countMonth = countMonth;
            return this;
        }

        public DepositCreater setRate(double rate) {
            this.deposit.rate = rate;
            return this;
        }

        public Deposit create() {
            return deposit;
        }
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
