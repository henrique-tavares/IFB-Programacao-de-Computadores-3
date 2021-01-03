package trabalho3;

import trabalho3.Atividade01.ClasseExterna;
import trabalho3.Atividade02.MostraNumero;
import trabalho3.Atividade03.ClasseAtividade03;
import trabalho3.Atividade04.Transporte;
import trabalho3.Atividade05.ClasseConcreta1;
import trabalho3.Atividade05.Mensagem;
import trabalho3.Atividade06.ClasseAtividade6;

@SuppressWarnings("unused")
public class InnerTeste {
    public static void main(String[] args) {
        // --------------------------------------|Atividade_01|--------------------------------------//
        // var ce = new ClasseExterna();
        // ce.mostrarInnerClass();

        // --------------------------------------|Atividade_02|--------------------------------------//
        // var mn = new MostraNumero();
        // var mni = mn.new MostraNumeroInterno();

        // System.out.println(mni.getNumero());

        // --------------------------------------|Atividade_03|--------------------------------------//
        // var ca3 = new ClasseAtividade03();
        // ca3.metodoComInnerClass();

        // var transporte = new Transporte() {

        // @Override
        // public double calcularFrete() {
        // return 0.0;
        // }

        // };

        // System.out.println("Valor do frete: " + transporte.calcularFrete());

        // --------------------------------------|Atividade_05|--------------------------------------//
        // var cc1 = new ClasseConcreta1();

        // cc1.exibirMensagem(new Mensagem() {

        // @Override
        // public String retornarMensagem() {
        // return "Mensagem qualquer";
        // }

        // });

        // --------------------------------------|Atividade_06|--------------------------------------//
        var ca = new ClasseAtividade6.ClasseAninhada();
        ca.metodo1();
    }
}
