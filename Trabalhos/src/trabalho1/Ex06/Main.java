package trabalho1.Ex06;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        var servicos = new LinkedList<Servico>();

        while (true) {
            try {
                System.out.print("\nDigite um código (0 para sair): ");
                var codigo = Integer.parseInt(input.nextLine());

                if (codigo == 0) {
                    break;
                }

                System.out.print("Digite uma descrição: ");
                var descricao = input.nextLine();

                System.out.print("Digite um preço por hora: R$");
                var precoHora = Double.parseDouble(input.nextLine());

                System.out.print("Digite uma quantidade de horas: ");
                var qtdHora = Integer.parseInt(input.nextLine());

                servicos.add(new Servico(codigo, descricao, precoHora, qtdHora));

            } catch (NumberFormatException e) {
                System.err.println("\nOcorreu um erro... Formato inválido de número. Tente Novamente.\n");
            }
        }

        System.out.println("\nOrdem de inserção:");
        servicos.forEach(servico -> System.out.println(servico));

        Collections.sort(servicos);

        System.out.println("\nOrdem alfabética:");
        servicos.forEach(servico -> System.out.println(servico));

        input.close();
    }
}
