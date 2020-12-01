package trabalho1.Ex14;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import trabalho1.Ex13.Aluno;

public class Main {
    public static void main(String[] args) {
        var map = new HashMap<Integer, Aluno>();
        var set = new HashSet<Aluno>();

        for (int i = 0; i <= 100_000; i++) {
            var aluno = new Aluno("Aluno #" + i, Integer.toString(i), new Date());

            map.put(i, aluno);
            set.add(aluno);
        }

        var key = (int) (Math.random() * 100_000);

        System.out.println("\nProcurando pelo aluno de RG: " + key);
        var aluno = new Aluno("Aluno #" + key, Integer.toString(key), new Date());

        var startMap = Instant.now().getNano();
        map.containsKey(key);
        var finisedMap = Instant.now().getNano();
        System.out.println("\nHashMap encontrou em " + ((finisedMap - startMap) / 1_000) + "µs");

        var startSet = Instant.now().getNano();
        set.contains(aluno);
        var finishedSet = Instant.now().getNano();
        System.out.println("\nHashSet encontrou em " + ((finishedSet - startSet) / 1_000) + "µs");
    }
}
