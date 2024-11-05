package org.example.fizzbuzz;

public class FizzBuzzNumber extends Number {

    public FizzBuzzNumber(int number){
        super(number);
    }

    @Override
    public void print() {
        System.out.println("FizzBuzz");
    }
}
