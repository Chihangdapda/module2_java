package numInFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddFile {
    public static void main(String[] args) {
        File number = new File("D:\\module2_java\\SumTheNumbersInFile\\numbers.txt");
       try {
           FileWriter writer = new FileWriter(number);
           writer.write("3,4,5,6,7,1,2,8,9");
           writer.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
