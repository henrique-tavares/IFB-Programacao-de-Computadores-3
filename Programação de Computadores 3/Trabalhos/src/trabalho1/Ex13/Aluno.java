package trabalho1.Ex13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String nome;
    private String rg;
    private Date dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Aluno(String nome, String rg, Date dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Aluno && ((Aluno) obj).rg.equals(this.rg));
    }

    @Override
    public String toString() {
        var dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "Aluno [dataNascimento=" + dateFormat.format(dataNascimento) + ", nome=" + nome + ", rg=" + rg + "]";
    }
}
