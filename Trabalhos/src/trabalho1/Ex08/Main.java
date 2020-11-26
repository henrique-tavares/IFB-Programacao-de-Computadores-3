package trabalho1.Ex08;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();

        for (int i = 1; i <= 3; i++) {
            map.put(i, "String " + i);
            map.put(i, "String " + i);
        }

        map.forEach((key, value) -> System.out.println(key + " => " + value));

        System.out.println("\nQuantidade de elementos: " + map.size());
    }
}
