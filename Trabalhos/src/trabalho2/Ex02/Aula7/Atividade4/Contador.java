package trabalho2.Ex02.Aula7.Atividade4;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Contador extends JFrame {

    private static final long serialVersionUID = 1L;

    JLabel l1;

    public Contador(String titulo) {
        var j = new JFrame(titulo);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Inicia Contador");

        j.add(l1);
        j.setSize(300, 200);
        j.setLocation(500, 200);
        j.setVisible(true);
    }

    private void iniciaContador() {
        try {
            Thread.sleep(1000);
            for (int i = 10; i > 0; i--) {
                l1.setText(Integer.toString(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        l1.setText(Thread.currentThread().toString());
    }

    public static void main(String[] args) {
        var t = new Contador("Contador");
        t.iniciaContador();
    }
}
