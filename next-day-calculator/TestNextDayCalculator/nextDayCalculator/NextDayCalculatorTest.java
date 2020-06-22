package nextDayCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2018")
    void testDay1Mouth1Year2018() {
        int dayTest = 1;
        int mouthTest = 1;
        int yearTest = 2018;
        String result = NextDayCalculator.nextDayCalculator(dayTest, mouthTest, yearTest);
        String expected = "2/1/2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case 30/4/2018")
    void testDay30Mouth4Year2018() {
        int dayTest = 30;
        int mouthTest = 4;
        int yearTest = 2018;
        String result = NextDayCalculator.nextDayCalculator(dayTest, mouthTest, yearTest);
        String expected = "1/5/2018";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 28/2/2020")
    void testDay28Mouth2Year2020() {
        int dayTest = 28;
        int mouthTest = 2;
        int yearTest = 2020;
        String result = NextDayCalculator.nextDayCalculator(dayTest, mouthTest, yearTest);
        String expected = "29/2/2020";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 29/2/2020")
    void testDay29Mouth2Year2020() {
        int dayTest = 29;
        int mouthTest = 2;
        int yearTest = 2020;
        String result = NextDayCalculator.nextDayCalculator(dayTest, mouthTest, yearTest);
        String expected = "1/3/2020";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/12/2018")
    void testDay31Mouth12Year2018() {
        int dayTest = 31;
        int mouthTest = 12;
        int yearTest = 2018;
        String result = NextDayCalculator.nextDayCalculator(dayTest, mouthTest, yearTest);
        String expected = "1/1/2019";
        assertEquals(expected, result);
    }
}