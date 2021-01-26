package pc3.trabalho4.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pc3.trabalho4.domain.Empregado;

public class EmpregadoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cpf;
    private String nome;
    private Integer idade;
    private Double salario;

    private List<DependenteDTO> dependentes = new ArrayList<>();

    public EmpregadoDTO() {
    }

    public EmpregadoDTO(String cpf, String nome, Integer idade, Double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public EmpregadoDTO(Empregado entity) {
        cpf = entity.getCpf();
        nome = entity.getNome();
        idade = entity.getIdade();
        salario = entity.getSalario();
        dependentes = entity.getDependentes().stream().map(dependente -> new DependenteDTO(dependente))
                .collect(Collectors.toList());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<DependenteDTO> getDependentes() {
        return dependentes;
    }

}
