package trabalho2.Ex02.Aula7.Atividade8;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        var conta = new ContaBancaria();

        var t1 = new DepositoThread(conta, 220.0);
        var t2 = new SaqueThread(conta, 110.0);
        var t3 = new DepositoThread(conta, 43.0);
        var t4 = new SaqueThread(conta, 152.0);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // t1.run();
        // t2.run();
        // t3.run();
        // t4.run();
    }
}
