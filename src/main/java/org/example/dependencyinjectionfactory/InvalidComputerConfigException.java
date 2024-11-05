package org.example.dependencyinjectionfactory;

public class InvalidComputerConfigException extends RuntimeException {

    public String getAffectedComponent() {
        return affectedComponent;
    }

    public void setAffectedComponent(String affectedComponent) {
        this.affectedComponent = affectedComponent;
    }

    private String affectedComponent;

    public InvalidComputerConfigException(String message, String affectedComponent){
        super(message);
        this.affectedComponent = affectedComponent;
    }


}
