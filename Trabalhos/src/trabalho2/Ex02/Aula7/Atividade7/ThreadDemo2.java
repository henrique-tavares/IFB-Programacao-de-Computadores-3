package trabalho2.Ex02.Aula7.Atividade7;

public class ThreadDemo2 implements Runnable {
    Thread thread;

    public ThreadDemo2(String name) {
        thread = new Thread(this, name);
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
        System.out.println("Rodando threads...");

        var t1 = new ThreadDemo2("A");
        var t2 = new ThreadDemo2("B");
        var t3 = new ThreadDemo2("C");
        var t4 = new ThreadDemo2("D");

        try {
            t1.thread.join();
            t2.thread.join();
            t3.thread.join();
            t4.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nThreads mortas.");
    }
}
