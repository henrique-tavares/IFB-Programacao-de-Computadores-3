package pc3.persistence;

import java.util.List;

import pc3.model.Dependente;
import pc3.model.Empregado;

public interface DependenteDAO {
    void incluir(Dependente dependente);

    void alterar(Dependente dependente);

    void excluir(Dependente dependente);

    List<Dependente> listarTodos();

    Dependente buscarPorCodigo(Integer codigo);

    List<Dependente> buscarPorEmpregado(Empregado empregado);
}
