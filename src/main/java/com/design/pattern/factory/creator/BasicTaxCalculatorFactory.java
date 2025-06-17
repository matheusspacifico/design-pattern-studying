package com.design.pattern.factory.creator;

import com.design.pattern.factory.taxes.BasicTaxCalculator;
import com.design.pattern.factory.taxes.TaxCalculator;

public class BasicTaxCalculatorFactory extends TaxCalculatorFactory {
    @Override
    public TaxCalculator createCalculator() {
        return new BasicTaxCalculator();
    }
}
