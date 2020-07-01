package countWord;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String str = "Trăm năm trong cõi người ta " +
                "Ai ai cũng phải thở ra hít vào " +
                "Trăm năm trong cõi người nào " +
                "Ai ai cũng phải hít vào thở ra " +
                "Xa xa như nước Cu-Ba " +
                "Người ta còn phải thở ra hít vào " +
                "Gần gần như cái nước Lào " +
                "Người ta cũng phải hít vào thở ra " +
                "Nói chung trong cõi người ta " +
                "Bắt buộc là phải thở ra hít vào ";


        String[] strings = str.toUpperCase().split(" ");
        System.out.println(Arrays.toString(strings));

        String key = "";
        Integer value;
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {
            key = strings[i];
            if (!map.containsKey(key)) {
                map.put(key,1);
            } else {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            }
        }
        map.forEach((key1, value1) -> {
            System.out.println("tu: " + key1 + " xuat hien: " + value1);
        });
    }
}
