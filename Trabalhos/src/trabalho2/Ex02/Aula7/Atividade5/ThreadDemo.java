package trabalho2.Ex02.Aula7.Atividade5;

public class ThreadDemo extends Thread {
    public ThreadDemo(String nome) {
        super(nome);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName());
        }
    }

    public static void main(String[] args) {
        var pnt1 = new ThreadDemo("A");
        var pnt2 = new ThreadDemo("B");
        var pnt3 = new ThreadDemo("C");
        var pnt4 = new ThreadDemo("D");

        pnt1.setPriority(7);
        pnt2.setPriority(4);
        pnt3.setPriority(1);
        pnt4.setPriority(10);
    }
}
