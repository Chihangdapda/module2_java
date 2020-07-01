package copyFile;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
           /* File tuyen = new File("D:\\module2_java\\CopyFile\\nghia.txt");
            fw = new FileWriter(tuyen.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write("\nlong lon an chim nuong that");
            bw.close();
            System.out.println("Xong");*/
            FileInputStream t = new FileInputStream("D:\\module2_java\\CopyFile\\tung.txt");
            int i= 0;
            String str ="";
            while ((i = t.read())!=-1){
                str+= ((char)i + "");
            }
            System.out.println(str);
            File tuyen = new File("D:\\module2_java\\CopyFile\\nghia.txt");
            fw = new FileWriter(tuyen.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
            System.out.println("Xong");

            /*File t = new File("D:\\module2_java\\CopyFile\\nghia.txt");
            FileReader fileReader = new FileReader(t);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
