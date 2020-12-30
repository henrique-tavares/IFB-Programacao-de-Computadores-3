package trabalho2.Ex02.Aula7.Atividade8;

public class ContaBancaria {
    private Double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }

    public synchronized void deposito(double quantia) {
        saldo += quantia;
        System.out.println("Depositando " + quantia + ", novo saldo é " + saldo);

        notifyAll();
    }

    public synchronized void saque(double quantia) throws InterruptedException {
        while (saldo < quantia) {
            wait();
        }

        saldo -= quantia;
        System.out.println("Sacando " + quantia + ", novo saldo é " + saldo);
    }
}
