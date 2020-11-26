package trabalho1.Ex06;

public class Servico implements Comparable<Servico> {
    private Integer codigo;
    private String descricao;
    private Double precoHora;
    private Integer qtdHora;
    private Double valor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Integer getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(Integer qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValor() {
        return valor;
    }

    public Servico(Integer codigo, String descricao, Double precoHora, Integer qtdHora) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoHora = precoHora;
        this.qtdHora = qtdHora;
        valor = precoHora * qtdHora;
    }

    @Override
    public int compareTo(Servico o) {
        return this.descricao.compareTo(o.descricao);
    }

    @Override
    public String toString() {
        return "Servico [" + "\ncodigo: " + codigo + "\ndescricao: " + descricao + "\nprecoHora: " + precoHora
                + "\nqtdHora: " + qtdHora + "\nvalor: " + valor + "\n]";
    }

}
