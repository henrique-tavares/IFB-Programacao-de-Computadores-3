package pc3.controller;

import pc3.model.Empregado;

public class Teste {
    public static void main(String[] args) {
        // HibernateUtil.getSessionFactory();

        Empregado empregado = new Empregado();
        empregado.setCpf("123.456.789-00");
        // empregado.setIdade(22);
        // empregado.setNome("Jorge II");
        // empregado.setSalario(2357.0);

        // var e = new EmpregadoController().buscarPorCPF("123.456.789-05");
        // if (e != null) {
        // System.out.println(e.getNome());
        // }

        var lista = new DependenteController().buscarPorEmpregado(empregado);
        for (var e : lista) {
            System.out.println("Nome: " + e.getNome());
        }

    }
}
