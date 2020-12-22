package trabalho2.Ex02.Aula5;

import trabalho2.Ex02.Aula5.Atividade1.TipoPessoa;
import trabalho2.Ex02.Aula5.Atividade2.EstadoCivil;
import trabalho2.Ex02.Aula5.Atividade3.Uf;
import trabalho2.Ex02.Aula5.Atividade4.Imposto;
import trabalho2.Ex02.Aula5.Atividade4.Taxa;

@SuppressWarnings("unused")
public class EnumTeste {
    public static void main(String[] args) {
        // -------------------------------|Atividade_01|-------------------------------//

        // System.out.println(TipoPessoa.PESSOA_JURIDICA);

        // TipoPessoa tp1 = TipoPessoa.PESSOA_FISICA;
        // TipoPessoa tp2 = TipoPessoa.PESSOA_JURIDICA;

        // System.out.println(tp1);
        // System.out.println(tp1.name());
        // System.out.println(tp1.toString());

        // -------------------------------|Atividade_02|-------------------------------//

        // System.out.println(EstadoCivil.CASADO);
        // System.out.println(EstadoCivil.CASADO.getValor());

        // System.out.println(EstadoCivil.SOLTEIRO);
        // System.out.println(EstadoCivil.SOLTEIRO.getValor());

        // -------------------------------|Atividade_03|-------------------------------//

        // System.out.println(Uf.DF);
        // System.out.println(Uf.DF.getDescricao());

        // System.out.println(Uf.ES);
        // System.out.println(Uf.ES.getDescricao());

        // -------------------------------|Atividade_04|-------------------------------//

        // System.out.println(Imposto.calculaImposto(115000, Taxa.ITBI));
        // System.out.println(Imposto.calculaImposto(78000, Taxa.IPTU));
    }
}
