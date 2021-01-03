package trabalho3.Atividade03;

public class ClasseAtividade03 {
    public void metodoComInnerClass() {
        int numero = 123;

        class ClasseInternaComoVariavelLocal {
            public void imprimir() {
                System.out.println("Método da inner classe exibindo o valor da variável local: " + numero);
            }
        }

        var civl = new ClasseInternaComoVariavelLocal();
        civl.imprimir();
    }
}
