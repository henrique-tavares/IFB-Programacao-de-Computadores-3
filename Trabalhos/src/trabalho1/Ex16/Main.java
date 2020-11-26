package trabalho1.Ex16;

import java.util.HashSet;

import trabalho1.Ex15.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        var set = new HashSet<ContaCorrente>();

        set.add(new ContaCorrente(40, 156, "Jorge 9", "7483923857", 343.0));
        set.add(new ContaCorrente(10, 235, "Jorge 45", "456879438", 7358.0));
        set.add(new ContaCorrente(4565, 1202, "Jorge 7", "673128842", 235789.0));
        set.add(new ContaCorrente(2, 497, "Jorge 1", "32757329", 5408.0));
        set.add(new ContaCorrente(79, 687, "Jorge ORIGINAL", "428971923", 789.0));

        set.forEach(e -> System.out.println(e));
    }
}
