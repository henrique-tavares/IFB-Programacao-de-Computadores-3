package trabalho2.Ex01;

public class Venda extends Thread {
    private Produto produto;
    private Integer quantidade;
    private Integer repeticoes;
    private Integer espera;

    public Venda(Produto produto, Integer quantidade, Integer repeticoes, Integer espera) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.repeticoes = repeticoes;
        this.espera = espera;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < repeticoes && !isInterrupted(); i++) {
                produto.venda(quantidade);
                sleep(espera);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
