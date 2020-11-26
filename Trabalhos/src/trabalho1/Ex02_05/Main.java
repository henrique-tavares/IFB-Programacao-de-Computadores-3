package trabalho1.Ex02_05;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<String>();

        // ---------------------------------------|Exercício_02|---------------------------------------//
        for (int i = 1; i <= 3; i++) {
            list.add("String " + i);
            list.add("String " + i);
        }

        System.out.println("02:");
        list.forEach(str -> System.out.println(str));
        System.out.println("\nQtd de elementos: " + list.size());

        // ---------------------------------------|Exercício_03|---------------------------------------//
        Collections.shuffle(list);

        System.out.println("\n03:");
        list.forEach(str -> System.out.println(str));

        // ---------------------------------------|Exercício_04|---------------------------------------//
        System.out.println("\n04:");
        System.out.println("String 2 => " + Collections.binarySearch(list, "String 2"));

        // ---------------------------------------|Exercício_05|---------------------------------------//
        Collections.sort(list);

        System.out.println("\n05:");
        list.forEach(str -> System.out.println(str));
    }
}
