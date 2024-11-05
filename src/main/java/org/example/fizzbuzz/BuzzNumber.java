package org.example.fizzbuzz;

public class BuzzNumber extends Number {

    public BuzzNumber(int number){
        super(number);
    }

    @Override
    public void print() {
        System.out.println("Buzz");
    }
}
