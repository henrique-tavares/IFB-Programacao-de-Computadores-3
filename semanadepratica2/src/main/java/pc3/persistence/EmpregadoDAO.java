package pc3.persistence;

import java.util.List;

import pc3.model.Empregado;

public interface EmpregadoDAO {
    void incluir(Empregado empregado);

    void alterar(Empregado empregado);

    void excluir(Empregado empregado);

    List<Empregado> listarTodos();

    Empregado buscarPorCPF(String cpf);
}
