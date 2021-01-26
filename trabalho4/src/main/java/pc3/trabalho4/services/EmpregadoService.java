package pc3.trabalho4.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pc3.trabalho4.domain.Dependente;
import pc3.trabalho4.domain.Empregado;
import pc3.trabalho4.dto.DependenteDTO;
import pc3.trabalho4.dto.EmpregadoDTO;
import pc3.trabalho4.repository.DependenteRepository;
import pc3.trabalho4.repository.EmpregadoRepository;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository empregadoRepository;

    @Autowired
    private DependenteRepository dependenteRepository;

    @Transactional(readOnly = true)
    public List<EmpregadoDTO> findAll() {
        List<Empregado> list = empregadoRepository.findEmpregadosWithDependentes();

        return list.stream().map(empregado -> new EmpregadoDTO(empregado)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public EmpregadoDTO findByCpf(String cpf) {
        Empregado empregado = empregadoRepository.findEmpregadoWithDependentes(cpf);

        return new EmpregadoDTO(empregado);
    }

    @Transactional
    public EmpregadoDTO insert(EmpregadoDTO dto) {
        Empregado empregado = new Empregado(dto.getCpf(), dto.getNome(), dto.getIdade(), dto.getSalario());

        for (DependenteDTO d : dto.getDependentes()) {
            Dependente dependente = dependenteRepository.findById(d.getCodigo()).get();
            empregado.getDependentes().add(dependente);
        }

        empregado = empregadoRepository.save(empregado);
        return new EmpregadoDTO(empregado);
    }

    @Transactional
    public EmpregadoDTO update(String cpf, EmpregadoDTO dto) {
        Empregado empregado = empregadoRepository.findById(cpf).get();

        empregado.setIdade(dto.getIdade());
        empregado.setNome(dto.getNome());
        empregado.setSalario(dto.getSalario());

        empregado = empregadoRepository.save(empregado);
        return new EmpregadoDTO(empregado);
    }

    @Transactional
    public void delete(String cpf) {
        empregadoRepository.deleteById(cpf);
    }

}
