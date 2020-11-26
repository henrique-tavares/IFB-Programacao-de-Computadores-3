package trabalho1.Ex10;

import java.util.Iterator;
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

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nMédia: " + list.stream().reduce(0, (a, b) -> a + b) / list.size());
    }
}
