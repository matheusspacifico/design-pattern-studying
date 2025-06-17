package com.design.pattern.factory.creator;

import com.design.pattern.factory.taxes.PremiumTaxCalculator;
import com.design.pattern.factory.taxes.TaxCalculator;

public class PremiumTaxCalculatorFactory extends TaxCalculatorFactory {
    @Override
    public TaxCalculator createCalculator() {
        return new PremiumTaxCalculator();
    }
}
