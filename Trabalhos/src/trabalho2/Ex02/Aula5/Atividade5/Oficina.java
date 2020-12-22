package trabalho2.Ex02.Aula5.Atividade5;

import java.util.List;

public class Oficina {

    public static Double calculaServico(Servico servico, Integer quantidade) {
        return quantidade * servico.getValor();
    }

    public static Double calculaServico(List<Tuple<Servico, Integer>> list) {
        var total = 0.0;

        for (var tuple : list) {
            total += tuple.a.getValor() * tuple.b;
        }

        return total;
    }
}
