package com.design.pattern.factory.taxes;

public class PremiumTaxCalculator implements TaxCalculator {
    @Override
    public double calculate(double value) {
        return value * 0.02;
    }
}
