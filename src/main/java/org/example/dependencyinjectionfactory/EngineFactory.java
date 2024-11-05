package org.example.dependencyinjectionfactory;

import java.security.InvalidParameterException;

public class EngineFactory {



    public Engine createEngine(String orderNumber){

        return switch (orderNumber.charAt(0)){
            case 'd' -> new DieselEngine();
            case 'g' -> new GasEngine();
            case 'e' -> new ElectricEngine();
            default -> throw new InvalidParameterException("Invalid order number");
        };

    }


}
