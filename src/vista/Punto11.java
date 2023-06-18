package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Punto11 extends JFrame {
    private JTextField txtNumero;
    private JLabel etiUna, etiDos, etiTres, etiCuatro, etiCinco, etiSeis, etiSiete, etiOcho, etiNueve, etiDiez;
    private JButton btnBorrar;
    private StringBuilder numeros;

    public Punto11() {
        setTitle("Etiquetas y Cuadro de Texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        iniciar();
    }

    public void iniciar() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        etiUna = new JLabel("0");
        etiDos = new JLabel("1");
        etiTres = new JLabel("2");
        etiCuatro = new JLabel("3");
        etiCinco = new JLabel("4");
        etiSeis = new JLabel("5");
        etiSiete = new JLabel("6");
        etiOcho = new JLabel("7");
        etiNueve = new JLabel("8");
        etiDiez = new JLabel("9");

        txtNumero = new JTextField(10);
        txtNumero.setEditable(false);

        btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(e -> {
            txtNumero.setText("");
            numeros.setLength(0);
        });

        panel.add(etiUna);
        panel.add(etiDos);
        panel.add(etiTres);
        panel.add(etiCuatro);
        panel.add(etiCinco);
        panel.add(etiSeis);
        panel.add(etiSiete);
        panel.add(etiOcho);
        panel.add(etiNueve);
        panel.add(etiDiez);
        panel.add(txtNumero);
        panel.add(btnBorrar);

        numeros = new StringBuilder();

        etiUna.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(0);
                txtNumero.setText(numeros.toString());
            }
        });

        etiDos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(1);
                txtNumero.setText(numeros.toString());
            }
        });

        etiTres.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(2);
                txtNumero.setText(numeros.toString());
            }
        });

        etiCuatro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(3);
                txtNumero.setText(numeros.toString());
            }
        });

        etiCinco.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(4);
                txtNumero.setText(numeros.toString());
            }
        });

        etiSeis.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(5);
                txtNumero.setText(numeros.toString());
            }
        });

        etiSiete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(6);
                txtNumero.setText(numeros.toString());
            }
        });

        etiOcho.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(7);
                txtNumero.setText(numeros.toString());
            }
        });

        etiNueve.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(8);
                txtNumero.setText(numeros.toString());
            }
        });

        etiDiez.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                numeros.append(9);
                txtNumero.setText(numeros.toString());
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        Punto11 ventana = new Punto11();
    }
}
