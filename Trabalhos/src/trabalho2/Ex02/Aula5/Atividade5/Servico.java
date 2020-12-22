package trabalho2.Ex02.Aula5.Atividade5;

public enum Servico {
    CAR("Carga de cartucho", 30.0), IMP("Conserto de impressora", 70.0), CPC("Conserto de computador", 110.0),
    FPC("Formatação de computador", 35.0), CEL("Conserto de celular", 80.0);

    private String descricao;
    private Double valor;

    private Servico(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

}
