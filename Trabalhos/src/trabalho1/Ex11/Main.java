package trabalho1.Ex11;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();

        list.add(100);
        list.add(20);
        list.add(200);
        list.add(30);
        list.add(80);
        list.add(40);
        list.add(100);
        list.add(200);

        for (var num : list) {
            System.out.println(num);
        }

        System.out.println("\nMédia: " + list.stream().reduce(0, (a, b) -> a + b) / list.size());
    }
}
