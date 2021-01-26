package pc3.trabalho4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pc3.trabalho4.domain.Dependente;

public interface DependenteRepository extends JpaRepository<Dependente, Integer> {

    @Query("SELECT DISTINCT d FROM Dependente d WHERE d.empregado.cpf = :cpf")
    List<Dependente> findByCpfEmpregado(@Param("cpf") String cpf);
}
