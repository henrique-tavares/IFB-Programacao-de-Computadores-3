package pc3.controller;

import java.util.List;

import pc3.model.Dependente;
import pc3.model.Empregado;
import pc3.persistence.DependenteDAOImp;

public class DependenteController {
    public void incluir(Dependente dependente) {
        new DependenteDAOImp().incluir(dependente);
    }

    public void alterar(Dependente dependente) {
        new DependenteDAOImp().alterar(dependente);
    }

    public void excluir(Dependente dependente) {
        new DependenteDAOImp().excluir(dependente);
    }

    public List<Dependente> listarTodos() {
        return new DependenteDAOImp().listarTodos();
    }

    public Dependente buscarPorCodigo(Integer codigo) {
        return new DependenteDAOImp().buscarPorCodigo(codigo);
    }

    public List<Dependente> buscarPorEmpregado(Empregado empregado) {
        return new DependenteDAOImp().buscarPorEmpregado(empregado);
    }
}
