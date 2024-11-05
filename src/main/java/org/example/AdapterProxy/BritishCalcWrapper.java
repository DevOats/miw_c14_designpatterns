package org.example.AdapterProxy;

public class BritishCalcWrapper implements CostCalculator
{

    private BritishCostCalculator calculator = new BritishCostCalculator();

    @Override
    public int calculateRailCost(int lengthM) {

        int furlong = lengthM / 201;
        int costP = calculator.calculateRailCost(furlong);
        int costE = costP * 2;
        return costE;
    }

}
