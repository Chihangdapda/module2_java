package numInFile;

import java.io.*;
import java.util.Arrays;

public class ReadFileText {
   public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br =new BufferedReader(new FileReader(file));
            int sum =0;
            String str ="";
            while ((str = br.readLine())!=null){
               String[] number = str.split(",");
                for (int i=0;i<number.length;i++){
                    System.out.print(number[i]+" ");
                    sum += Integer.parseInt(number[i]);
                }

            }
            br.close();

            System.out.println("tong: "+ sum);

        }catch (IOException e){
            e.printStackTrace();
        }
   }


}
