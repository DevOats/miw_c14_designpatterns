package org.example.singleton;

/*
There can be only one!
 */
public class King {

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;



    private static King theOneAndOnlyInstance;

    public static King getInstance(){

        if(theOneAndOnlyInstance == null){
            theOneAndOnlyInstance = new King();
        }
        return theOneAndOnlyInstance;
    }

    private King(){

    }

}
