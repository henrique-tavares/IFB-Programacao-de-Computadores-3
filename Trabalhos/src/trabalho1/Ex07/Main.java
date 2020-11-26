package trabalho1.Ex07;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        var set = new HashSet<String>();

        for (int i = 1; i <= 3; i++) {
            set.add("String " + i);
            set.add("String " + i);
        }

        set.forEach(e -> System.out.println(e));
        System.out.println("\nQuantidade de elementos: " + set.size());
    }
}
