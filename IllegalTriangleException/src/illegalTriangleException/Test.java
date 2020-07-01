package illegalTriangleException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh thu 1:");
        double edge1 = sc.nextDouble();
        System.out.println("nhap canh thu 2:");
        double edge2 = sc.nextDouble();
        System.out.println("nhap canh thu 3:");
        double edge3 = sc.nextDouble();

        try {
            isTriangle(edge1, edge2, edge3);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
        System.out.println("sdsdvsv");

    }

    public static boolean isTriangle(double edge1, double edge2, double edge3) throws IllegalTriangleException {
        if (edge1 < 0 || edge2 < 0 || edge3 < 0 ||
                edge1 + edge2 <= edge3 || edge1 + edge3 <= edge2 || edge2 + edge3 <= edge1) {
            throw new IllegalTriangleException("khong la tam giac");
        }
        return true;
    }

}
