package trabalho1.Ex01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<String>();

        for (int i = 0; i < 200; i++) {
            list.add("string " + i);
        }

        list.forEach(str -> System.out.println(str));
    }
}
