package org.example.AdapterProxy;

public class CalculatorLoggerProxy implements CostCalculator {

    private CostCalculator calculator;


    public CalculatorLoggerProxy(CostCalculator calc){
        calculator = calc;
    }


    @Override
    public int calculateRailCost(int lengthM) {

        System.out.println("Length: " + lengthM);

        int cost = calculator.calculateRailCost(lengthM);

        System.out.println("Cost: " + cost);

        return cost;
    }


}
