package readFile;

import java.io.*;
import java.util.Arrays;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        File newCsvFile = new File("D:\\module2_java\\ReadFile\\coutry1.csv");
        try {
            FileWriter writer = new FileWriter(newCsvFile);
            writer.write("\"1.0.0.0\",\"1.0.0.255\",\"16777216\",\"16777471\",\"AU\",\"Australia,\"\n" +
                    "\"1.0.1.0\",\"1.0.3.255\",\"16777472\",\"16778239\",\"CN\",\"China,\"\n" +
                    "\"1.0.4.0\",\"1.0.7.255\",\"16778240\",\"16779263\",\"AU\",\"Australia,\"\n" +
                    "\"1.0.8.0\",\"1.0.15.255\",\"16779264\",\"16781311\",\"CN\",\"China,\"\n" +
                    "\"1.0.16.0\",\"1.0.31.255\",\"16781312\",\"16785407\",\"JP\",\"Japan,\"\n" +
                    "\"1.0.32.0\",\"1.0.63.255\",\"16785408\",\"16793599\",\"CN\",\"China,\"\n" +
                    "\"1.0.64.0\",\"1.0.127.255\",\"16793600\",\"16809983\",\"JP\",\"Japan,\"\n" +
                    "\"1.0.128.0\",\"1.0.255.255\",\"16809984\",\"16842751\",\"TH\",\"Thailand,\"");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String csvFile = "D:\\module2_java\\ReadFile\\coutry1.csv";
            String strings = "";
            BufferedReader str = null;
            str = new BufferedReader(new FileReader(csvFile));

            while ((strings = str.readLine()) != null) {
                String[] country = strings.split(",");
                System.out.println("country code: " + country[4] + " country:" + country[5]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

