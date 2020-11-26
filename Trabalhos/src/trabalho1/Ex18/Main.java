package trabalho1.Ex18;

import java.util.Date;
import java.util.HashMap;

import trabalho1.Ex13.Aluno;

public class Main {
    public static void main(String[] args) {
        var alunos = new HashMap<String, Aluno>();

        alunos.put("73281990", new Aluno("Jorge -9", "73281990", new Date()));
        alunos.put("73281990", new Aluno("Jorge 0", "73281990", new Date()));
        alunos.put("73281990", new Aluno("Jorge FAKE", "73281990", new Date()));
        alunos.put("73281990", new Aluno("Jorge 4", "73281990", new Date()));

        alunos.forEach((key, value) -> System.out.println(key + " => " + value));

        // Sim, eles possuem o mesmo código ou chave
    }
}
