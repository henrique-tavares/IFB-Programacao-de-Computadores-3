package trabalho2.Ex01;

public class ProdutoTeste {
    public static void main(String[] args) {
        var produto = new Produto();

        var c1 = new Compra(produto, 5, 10, 1000);
        var c2 = new Compra(produto, 2, 50, 250);

        var v1 = new Venda(produto, 6, 20, 100);
        var v2 = new Venda(produto, 3, 4, 50);

        c1.start();
        v1.start();
        c2.start();
        v2.start();
    }
}
