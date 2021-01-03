package trabalho3.Atividade01;

public class ClasseExterna {
    private Integer numero;

    private class ClasseInterna {
        public void imprimir() {
            System.out.println("Dentro do método da inner class");
        }
    }

    public void mostrarInnerClass() {
        var ci = new ClasseInterna();
        ci.imprimir();
    }
}
