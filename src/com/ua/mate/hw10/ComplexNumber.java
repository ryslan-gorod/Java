package com.ua.mate.hw10;

import java.util.Objects;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return this.re == that.re & this.im == that.im;
    }

    @Override
    public int hashCode() {
        String tmpRe = String.valueOf(re).replace(".", "");
        String tmpIm = String.valueOf(im).replace(".", "");
        Integer tmpReInt = Integer.parseInt(tmpRe);
        Integer tmpImInt = Integer.parseInt(tmpIm);
        return tmpReInt * 2 + tmpImInt * 3;
    }
}
