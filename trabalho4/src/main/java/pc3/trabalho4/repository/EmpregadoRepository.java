package pc3.trabalho4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pc3.trabalho4.domain.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, String> {

    @Query("SELECT DISTINCT e FROM Empregado e LEFT JOIN FETCH e.dependentes")
    List<Empregado> findEmpregadosWithDependentes();

    @Query("SELECT e FROM Empregado e LEFT JOIN FETCH e.dependentes WHERE e.cpf = :cpf")
    Empregado findEmpregadoWithDependentes(@Param("cpf") String cpf);

}
