package com.design.pattern.factory.creator;

import com.design.pattern.factory.taxes.TaxCalculator;

public abstract class TaxCalculatorFactory {
    public double calculate(double value) {
        TaxCalculator calculator = createCalculator();
        double tax = calculator.calculate(value);
        return value + tax;
    }

    public abstract TaxCalculator createCalculator();
}
