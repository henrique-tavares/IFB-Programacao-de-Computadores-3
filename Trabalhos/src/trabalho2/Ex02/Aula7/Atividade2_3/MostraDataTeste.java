package trabalho2.Ex02.Aula7.Atividade2_3;

public class MostraDataTeste {
    public static void main(String[] args) {
        var md1 = new MostraData("Olá");
        var md2 = new MostraData("Adeus");

        // ------------------------------|Atividade_02|------------------------------//
        // md1.start();
        // md2.start();

        // md1.run();
        // md2.run();

        // ------------------------------|Atividade_03|------------------------------//
        md2.setPriority(Thread.MAX_PRIORITY);

        md1.start();
        md2.start();

    }
}
