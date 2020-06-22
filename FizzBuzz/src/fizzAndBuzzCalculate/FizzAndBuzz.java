package fizzAndBuzzCalculate;

import java.lang.reflect.Array;

public class FizzAndBuzz {

    public static String fizzAndBuzz(int number) {
        String fizzBuzzTest = "";
        if (number % 3 == 0 && number % 5 != 0) {
            fizzBuzzTest = "Fizz";
        } else if (number % 5 ==0 && number % 3 != 0) {
            fizzBuzzTest = "Buzz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            fizzBuzzTest = "FizzBuzz";
        } else
            return fizzBuzzTest="so" + number;
        return fizzBuzzTest;
    }



}
