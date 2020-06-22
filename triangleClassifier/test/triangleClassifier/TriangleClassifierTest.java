package triangleClassifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    @DisplayName("case 2,2,2")
    void triAnglea2b2c2Test() {
        double aTest = 2;
        double bTest = 2;
        double cTest = 2;
        String result = TriangleClassifier.classifier(aTest, bTest, cTest);
        String expected = "Tam Giac Deu";
        assertEquals(expected, result);

    }
    @Test
    @DisplayName("case 2,2,3")
    void triAnglea2b2c3Test() {
        double aTest = 2;
        double bTest = 2;
        double cTest = 3;
        String result = TriangleClassifier.classifier(aTest, bTest, cTest);
        String expected = "Tam Giac Can";
        assertEquals(expected, result);

    }
    @Test
    @DisplayName("case 3,4,5")
    void triAnglea3b4c5Test() {
        double aTest = 3;
        double bTest = 4;
        double cTest = 5;
        String result = TriangleClassifier.classifier(aTest, bTest, cTest);
        String expected = "Tam Giac Thuong";
        assertEquals(expected, result);

    }
    @Test
    @DisplayName("case -1,2,1")
    void triAnglea1b2c1Test() {
        double aTest = -1;
        double bTest = 2;
        double cTest = 1;
        String result = TriangleClassifier.classifier(aTest, bTest, cTest);
        String expected = "Khong Phai Tam Giac";
        assertEquals(expected, result);

    }
    @Test
    @DisplayName("case 8,2,3")
    void triAnglea8b2c3Test() {
        double aTest = 8;
        double bTest = 2;
        double cTest = 3;
        String result = TriangleClassifier.classifier(aTest, bTest, cTest);
        String expected = "Khong Phai Tam Giac";
        assertEquals(expected, result);

    }
}