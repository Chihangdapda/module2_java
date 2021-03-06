package absoluteNumberCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsoluteNumberCalculatorTest {


    @Test
    public void testFindAbsolute(){
        int number = 0;
        int expected =0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,number);
    }
    @Test
    public void testFindAbsolute1(){
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,number);
    }
    @Test
    public void testAbsolute2(){
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,number);
    }
}