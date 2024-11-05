package org.example.AdapterProxy;

public class DutchCostCalculator implements CostCalculator{

    @Override
    public int calculateRailCost(int lengthM) {
        return 600 * lengthM;
    }
}
