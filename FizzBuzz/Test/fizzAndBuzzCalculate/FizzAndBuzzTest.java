package fizzAndBuzzCalculate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzAndBuzzTest {
    @Test
    @DisplayName("case 15")
    void fizzAndBuzzTest15() {
        int numberTest = 15;
        String result = FizzAndBuzz.fizzAndBuzz(numberTest);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 10")
    void fizzAndBuzzTest10() {
        int numberTest = 10;
        String result = FizzAndBuzz.fizzAndBuzz(numberTest);
        String expected = "Buzz";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 9")
    void fizzAndBuzzTest9() {
        int numberTest = 9;
        String result = FizzAndBuzz.fizzAndBuzz(numberTest);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 11")
    void fizzAndBuzzTest11() {
        int numberTest =11;
        String result = FizzAndBuzz.fizzAndBuzz(numberTest);
        String expected ="so"+numberTest;
        assertEquals(expected, result);
    }
}