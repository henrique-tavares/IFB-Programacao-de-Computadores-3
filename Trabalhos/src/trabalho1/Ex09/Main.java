package trabalho1.Ex09;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

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
