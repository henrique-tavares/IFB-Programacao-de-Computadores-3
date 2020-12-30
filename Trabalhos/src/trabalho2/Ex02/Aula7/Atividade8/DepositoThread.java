package trabalho2.Ex02.Aula7.Atividade8;

public class DepositoThread extends Thread {
    private ContaBancaria conta;
    private Double quantia;

    private static final int REPETICOES = 10;
    private static final int ESPERA = 10;

    public DepositoThread(ContaBancaria conta, Double quantia) {
        this.conta = conta;
        this.quantia = quantia;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < REPETICOES && !isInterrupted(); i++) {
                conta.deposito(quantia);
                sleep(ESPERA);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
