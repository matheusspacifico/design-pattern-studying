package com.design.pattern.factory.creator;

import com.design.pattern.factory.taxes.TaxCalculator;
import com.design.pattern.factory.taxes.VipTaxCalculator;

public class VipTaxCalculatorFactory extends TaxCalculatorFactory {
    @Override
    public TaxCalculator createCalculator() {
        return new VipTaxCalculator();
    }
}
