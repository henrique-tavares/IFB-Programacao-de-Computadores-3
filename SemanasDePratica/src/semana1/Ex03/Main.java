package semana1.Ex03;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();

        for (int i = 1; i <= 20; i++) {
            map.put(i, "agua nº" + i);
        }

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
