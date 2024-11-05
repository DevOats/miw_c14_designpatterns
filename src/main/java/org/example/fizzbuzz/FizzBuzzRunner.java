package org.example.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRunner {

    private static final int firstNumber = 1;
    private static final int lastNumber = 100;

    public void run(){

        List<Number> numbers = createNumbers();
        printNumbers(numbers);
    }


    private List<Number> createNumbers(){
        NumberFactory numberFactory = new NumberFactory();
        List<Number> numbers = new ArrayList<>();

        for(int i = firstNumber; i <= lastNumber; i++){
            Number number = numberFactory.createNumber(i);
            numbers.add(number);
        }

        return numbers;
    }


    private void printNumbers(List<Number> numbers){

        for(Number number : numbers){
            number.print();
        }
    }

}
