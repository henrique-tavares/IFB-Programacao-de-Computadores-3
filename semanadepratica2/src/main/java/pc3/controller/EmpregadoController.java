package pc3.controller;

import java.util.List;

import pc3.model.Empregado;
import pc3.persistence.EmpregadoDAOImp;

public class EmpregadoController {
    public void incluir(Empregado empregado) {
        new EmpregadoDAOImp().incluir(empregado);
    }

    public void alterar(Empregado empregado) {
        new EmpregadoDAOImp().alterar(empregado);
    }

    public void excluir(Empregado empregado) {
        new EmpregadoDAOImp().excluir(empregado);
    }

    public List<Empregado> listarTodos() {
        return new EmpregadoDAOImp().listarTodos();
    }

    public Empregado buscarPorCPF(String cpf) {
        return new EmpregadoDAOImp().buscarPorCPF(cpf);
    }
}
