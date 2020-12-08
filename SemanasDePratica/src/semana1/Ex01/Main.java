package semana1.Ex01;

import java.util.ArrayList;

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
    }
}
