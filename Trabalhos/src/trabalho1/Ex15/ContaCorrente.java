package trabalho1.Ex15;

public class ContaCorrente {
    private Integer numero;
    private Integer agencia;
    private String nome;
    private String cpf;
    private Double saldo;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(Integer numero, Integer agencia, String nome, String cpf, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof ContaCorrente && ((ContaCorrente) obj).numero.equals(this.numero));
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "ContaCorrente [agencia=" + agencia + ", cpf=" + cpf + ", nome=" + nome + ", numero=" + numero
                + ", saldo=" + saldo + "]";
    }
}
