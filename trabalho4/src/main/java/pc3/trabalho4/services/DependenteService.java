package pc3.trabalho4.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pc3.trabalho4.domain.Dependente;
import pc3.trabalho4.dto.DependenteDTO;
import pc3.trabalho4.repository.DependenteRepository;

@Service
public class DependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    @Transactional(readOnly = true)
    public List<DependenteDTO> findAll() {
        List<Dependente> list = dependenteRepository.findAll();

        return list.stream().map(dependente -> new DependenteDTO(dependente)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<DependenteDTO> findByEmpregado(String cpf) {
        List<Dependente> list = dependenteRepository.findByCpfEmpregado(cpf);

        return list.stream().map(dependente -> new DependenteDTO(dependente)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public DependenteDTO findByCodigo(Integer codigo) {
        Dependente dependente = dependenteRepository.findById(codigo).get();

        return new DependenteDTO(dependente);
    }

    @Transactional
    public DependenteDTO insert(DependenteDTO dto) {
        Dependente dependente = new Dependente(null, dto.getNome(), dto.getGrauParentesco(), dto.getDataNascimento(),
                dto.getEmpregado());

        dependente = dependenteRepository.save(dependente);
        return new DependenteDTO(dependente);
    }

    @Transactional
    public DependenteDTO update(Integer codigo, DependenteDTO dto) {
        Dependente dependente = dependenteRepository.findById(codigo).get();

        dependente.setNome(dto.getNome());
        dependente.setGrauParentesco(dto.getGrauParentesco());
        dependente.setDataNascimento(dto.getDataNascimento());
        dependente.setEmpregado(dto.getEmpregado());

        dependente = dependenteRepository.save(dependente);
        return new DependenteDTO(dependente);
    }

    @Transactional
    public void delete(Integer codigo) {
        dependenteRepository.deleteById(codigo);
    }
}
