package com.design.pattern.factory;

import com.design.pattern.factory.creator.BasicTaxCalculatorFactory;
import com.design.pattern.factory.creator.PremiumTaxCalculatorFactory;
import com.design.pattern.factory.creator.TaxCalculatorFactory;
import com.design.pattern.factory.creator.VipTaxCalculatorFactory;

public class Main {
    public static void main(String[] args) {
        double value = 1000.0;

        TaxCalculatorFactory basic = new BasicTaxCalculatorFactory();
        double basicValue = basic.calculate(value);
        System.out.println("Basic value: " + basicValue);

        TaxCalculatorFactory premium = new PremiumTaxCalculatorFactory();
        double premiumValue = premium.calculate(value);
        System.out.println("Premium value: " + premiumValue);

        TaxCalculatorFactory vip = new VipTaxCalculatorFactory();
        double vipValue = vip.calculate(value);
        System.out.println("Vip value: " + vipValue);
    }
}
