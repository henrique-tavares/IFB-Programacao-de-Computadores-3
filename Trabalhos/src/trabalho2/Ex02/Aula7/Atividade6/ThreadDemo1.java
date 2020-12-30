package trabalho2.Ex02.Aula7.Atividade6;

public class ThreadDemo1 implements Runnable {
    Thread thread;

    public ThreadDemo1(String nome) {
        thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        new ThreadDemo1("A");
        new ThreadDemo1("B");
        new ThreadDemo1("C");
        new ThreadDemo1("D");
    }
}
