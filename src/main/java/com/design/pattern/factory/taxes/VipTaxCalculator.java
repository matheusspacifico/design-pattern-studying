package com.design.pattern.factory.taxes;

public class VipTaxCalculator implements TaxCalculator {
    @Override
    public double calculate(double value) {
        return value * 0.01;
    }
}
