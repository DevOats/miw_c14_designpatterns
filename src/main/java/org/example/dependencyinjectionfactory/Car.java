package org.example.dependencyinjectionfactory;

import java.security.InvalidParameterException;

public class Car {

    private Engine engine;

    public Car(Engine theEngine) {
        this.engine = theEngine;
    }

    public void beginDrive(){
            engine.start();
    }

    public void stopDrive(){
            engine.stop();
    }

}
