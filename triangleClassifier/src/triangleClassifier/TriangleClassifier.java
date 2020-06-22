package triangleClassifier;

public class TriangleClassifier {

    public static String classifier(double a, double b, double c) {
        String triangleTest = "";
        if (isTriangle(a, b, c)) {
            if (a == b && a == c) {
                triangleTest = "Tam Giac Deu";
            } else if (a == b || b == c || a == c) {
                triangleTest = "Tam Giac Can";
            } else triangleTest = "Tam Giac Thuong";

        } else {
            triangleTest = "Khong Phai Tam Giac";
        }
        return triangleTest;
    }


    private static boolean isTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;
    }

}
