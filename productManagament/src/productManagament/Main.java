package productManagament;

import java.io.*;;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws Exception {
        File manage = new File("D:\\module2_java\\productManagament\\managa.txt");
//       Scanner sc =new Scanner(System.in);
//        System.out.println("nhap duong dan file product:");
//        String productPath = sc.nextLine();
//        File managa =new File(productPath);
//        addProduct(manage);
        displayProduct(manage);
        //displayAllProduct(manage);
    }

    public static void addProduct(File manage) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap ma san pham:");
        int productCode = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten san pham:");
        String productName = sc.nextLine();
        System.out.println("nhap hang san xuat:");
        String producer = sc.nextLine();
        List<Product> namesList = new ArrayList<Product>();
        Product product = new Product(productCode,productName,producer);
        BufferedOutputStream bff = new BufferedOutputStream(new FileOutputStream(manage, true));
        ObjectOutputStream obj =new ObjectOutputStream(bff);
        namesList.add(product);
        obj.writeObject(product);
        obj.close();

    }

    public static void displayProduct(File manage) throws Exception, ClassNotFoundException {
//        FileInputStream fileIn = new FileInputStream(manage);
      // BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(manage));
        /*DataInputStream dat = new DataInputStream(fileIn);
        String name = dat.readUTF();
        System.out.println("name " + name);*/



         Product list = new Product();
        ObjectInputStream io = new ObjectInputStream(new FileInputStream(manage));
        while ((list = (Product) io.readObject()) != null){
            List<Product> namesList = new ArrayList<Product>();
            namesList.add((Product)io.readObject());
            System.out.println(namesList);

       }


    }
    /*public static void displayAllProduct(File manage) throws IOException {
        FileReader fileReader = new FileReader(manage);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.re

    }*/
}
