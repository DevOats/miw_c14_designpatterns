package org.example.fizzbuzz;

public class NumberFactory {

    private static final int fizzValue = 3;
    private static final int buzzValue = 5;

    public Number createNumber(int number){

        boolean isFizz = number % fizzValue == 0;
        boolean isBuzz = number % buzzValue == 0;
        boolean isFizzBuzz = isFizz && isBuzz;

        if(isFizzBuzz){
            return new FizzBuzzNumber(number);
        }

        if(isFizz){
            return new FizzNumber(number);
        }

        if(isBuzz){
            return new BuzzNumber(number);
        }

        return new Number(number);
    }

}
