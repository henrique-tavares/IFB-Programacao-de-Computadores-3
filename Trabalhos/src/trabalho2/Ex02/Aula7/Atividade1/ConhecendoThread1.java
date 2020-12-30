package trabalho2.Ex02.Aula7.Atividade1;

public class ConhecendoThread1 {
    public static void main(String[] args) {
        try {
            int sec = 0;
            System.out.println("Tempo: " + sec + "s");

            for (sec = 1; sec <= 10; sec++) {
                Thread.sleep(1000);
                System.out.println("Tempo: " + sec + "s");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
