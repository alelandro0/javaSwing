package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Punto5 extends JFrame {
    private JLabel etiPal1;
    private JLabel etiPal2;
    private JLabel etiPal3;
    private JLabel etiPal4;
    private JLabel etiOcultar;

    public Punto5() {
        setTitle("Punto5");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciar();
    }
    public void iniciar() {

        etiPal1 = new JLabel("Palabra 1");
        etiPal2 = new JLabel("Palabra 2");
        etiPal3 = new JLabel("Palabra 3");
        etiPal4 = new JLabel("Palabra 4");
        etiOcultar = new JLabel("Ocultar");
        etiOcultar.setBackground(Color.YELLOW);
        etiOcultar.setOpaque(true);

        etiPal1.setBounds(20, 20, 100, 20);
        etiPal2.setBounds(20, 50, 100, 20);
        etiPal3.setBounds(20, 80, 100, 20);
        etiPal4.setBounds(20, 110, 100, 20);
        etiOcultar.setBounds(150, 20, 100, 100);

        add(etiPal1);
        add(etiPal2);
        add(etiPal3);
        add(etiPal4);
        add(etiOcultar);

        etiOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }
        });

        setSize(300, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        Punto5 ventana = new Punto5();
    }
}
