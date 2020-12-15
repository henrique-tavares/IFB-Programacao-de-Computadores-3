package trabalho2.Ex01;

public class Produto {
    private Integer estoque;

    public Integer getEstoque() {
        return estoque;
    }

    public Produto() {
        this.estoque = 0;
    }

    public synchronized void compra(int qtd) {
        System.out.println("\nCompra: " + estoque + " + " + qtd + " => " + (estoque + qtd));
        estoque += qtd;
        notifyAll();
    }

    public synchronized void venda(int qtd) throws InterruptedException {
        while (estoque < qtd) {
            wait();
        }

        System.out.println("\nVenda: " + estoque + " - " + qtd + " => " + (estoque - qtd));
        estoque -= qtd;
    }

}
