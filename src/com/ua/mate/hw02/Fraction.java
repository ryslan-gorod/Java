package com.ua.mate.hw02;

public final class Fraction {
    private final int numerator;
    private final int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction) {
        int newNumerator = numerator * fraction.getDenominator() + denominator * fraction.getNumerator();
        int newDenominator = denominator * fraction.getDenominator();
        int divider = largestDivider(newNumerator, newDenominator);
        return new Fraction(newNumerator / divider, newDenominator / divider);
    }

    private int largestDivider(int firstNumber, int secondNumber) {
        return secondNumber == 0 ? firstNumber : largestDivider(secondNumber, firstNumber % secondNumber);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
