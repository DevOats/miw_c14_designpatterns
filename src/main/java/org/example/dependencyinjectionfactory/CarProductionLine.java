package org.example.dependencyinjectionfactory;

public class CarProductionLine {

    private EngineFactory engineFactory = new EngineFactory();


    public Car buildCar(String orderNumber){

        Engine engine = engineFactory.createEngine(orderNumber);
        Car aCar = new Car(engine);
        return aCar;

    }


}
