package org.example.AdapterProxy;

public class SalesDepartment {


    public void makeQuote(String countryCode){

        CostCalculator calc = null;

        switch (countryCode){

            case "NL":
                calc = new DutchCostCalculator();
                break;

            case "DE":
                calc = new GermanCostCalculator();
                break;

            case "GB":
                calc = new BritishCalcWrapper();
                break;

            default:
                throw new IllegalArgumentException("unsupported country code: " + countryCode);
        }



        calc = new CalculatorLoggerProxy(calc);

        if("keuze" == "") {
            calc = new CalculatorLoggerProxy(calc);
        }


        calc = new CalculatorLoggerProxy(calc);
        calc = new CalculatorLoggerProxy(calc);
        calc = new CalculatorLoggerProxy(calc);
        calc = new CalculatorLoggerProxy(calc);
        calc = new CalculatorLoggerProxy(calc);
        calc = new CalculatorLoggerProxy(calc);
        calc = new CalculatorLoggerProxy(calc);
        calc = new CalculatorLoggerProxy(calc);
        calc = new CalculatorLoggerProxy(calc);


        int price = calc.calculateRailCost(20000);

    }


}
