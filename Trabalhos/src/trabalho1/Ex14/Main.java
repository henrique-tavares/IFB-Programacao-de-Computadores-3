package trabalho1.Ex14;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import trabalho1.Ex13.Aluno;

public class Main {
    public static void main(String[] args) {
        var map = new HashMap<Integer, Aluno>();
        var set = new HashSet<Aluno>();

        for (int i = 1; i <= 100_000; i++) {
            var aluno = new Aluno("Aluno #" + i, Integer.toString(i), new Date());

            map.put(i, aluno);
            set.add(aluno);
        }

        var key = (int) (Math.random() * 100_000);

        System.out.println("\nProcurando pelo aluno de RG: " + key);
        var aluno = new Aluno("Aluno #" + key, Integer.toString(key), new Date());

        var startMap = Calendar.getInstance().getTimeInMillis();
        map.containsValue(aluno);
        var finisedMap = Calendar.getInstance().getTimeInMillis();
        System.out.println("\nHashMap encontrou em " + (finisedMap - startMap) + "ms");

        var startSet = Calendar.getInstance().getTimeInMillis();
        set.contains(aluno);
        var finishedSet = Calendar.getInstance().getTimeInMillis();
        System.out.println("\nHashSet encontrou em " + (finishedSet - startSet) + "ms");
    }
}
