package semana1.Ex02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<String>();

        list.add("Vermelho");
        list.add("Laranja");
        list.add("Amarelo");
        list.add("Verde");
        list.add("Ciano");
        list.add("Azul");
        list.add("Violeta");

        list.forEach(e -> System.out.println(e));

        // a)
        list.add(0, "Vermelho escuro");

        System.out.println("\na)");
        list.forEach(e -> System.out.println(e));

        // b)
        list.remove(2);

        System.out.println("\nb)");
        list.forEach(e -> System.out.println(e));

        // c)
        var listCopy = new ArrayList<String>(list);

        System.out.println("\nc)");
        listCopy.forEach(e -> System.out.println(e));

        // d)
        Collections.sort(list);

        System.out.println("\nd)");
        list.forEach(e -> System.out.println(e));
    }
}
