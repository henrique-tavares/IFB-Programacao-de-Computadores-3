package trabalho2.Ex02.Aula5.Atividade5;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<Tuple<Servico, Integer>>();
        list.add(new Tuple<Servico, Integer>(Servico.CAR, 5));
        list.add(new Tuple<Servico, Integer>(Servico.CEL, 20));
        list.add(new Tuple<Servico, Integer>(Servico.CPC, 2));
        list.add(new Tuple<Servico, Integer>(Servico.FPC, 7));
        list.add(new Tuple<Servico, Integer>(Servico.IMP, 12));

        var formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println(String.format("|%-5s|%-25s|%-15s|%-11s|%-15s|", "Tipo", "Descrição", "Valor Unitário",
                "Quantidade", "Valor Total"));

        for (var tuple : list) {
            System.out.println(String.format("|%-5s|%-25s|%-15s|%-11s|%-15s|", tuple.a.toString(),
                    tuple.a.getDescricao(), formatter.format(tuple.a.getValor()), tuple.b,
                    formatter.format(Oficina.calculaServico(tuple.a, tuple.b))));
        }

        System.out.println(
                "|Total dos Serviços:" + String.format("%56s|", formatter.format(Oficina.calculaServico(list))));
    }
}
