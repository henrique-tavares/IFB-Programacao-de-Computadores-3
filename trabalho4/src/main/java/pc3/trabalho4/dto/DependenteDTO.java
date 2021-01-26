package pc3.trabalho4.dto;

import java.io.Serializable;
import java.time.LocalDate;

import pc3.trabalho4.domain.Dependente;
import pc3.trabalho4.domain.Empregado;

public class DependenteDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer codigo;
    private String nome;
    private String grauParentesco;
    private LocalDate dataNascimento;
    private Empregado empregado;

    public DependenteDTO() {
    }

    public DependenteDTO(Integer codigo, String nome, String grauParentesco, LocalDate dataNascimento,
            Empregado empregado) {
        this.codigo = codigo;
        this.nome = nome;
        this.grauParentesco = grauParentesco;
        this.dataNascimento = dataNascimento;
        this.empregado = empregado;
    }

    public DependenteDTO(Dependente entity) {
        codigo = entity.getCodigo();
        nome = entity.getNome();
        grauParentesco = entity.getGrauParentesco();
        dataNascimento = entity.getDataNascimento();
        empregado = entity.getEmpregado();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

}
