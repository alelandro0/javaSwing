package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Punto8 extends JFrame implements ActionListener {
    private JLabel etiTexto;
    private JButton btnAzul;
    private JButton btnRojo;
    private JButton btnVerde;
    private JButton btnFondoAzul;
    private JButton btnFondoRojo;
    private JButton btnFondoVerde;
    private JButton btnTransparente;
    private JButton btnOpaca;
    private JPanel panel;

    public Punto8() {
        setTitle("Punto8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(435, 500);
        setLocationRelativeTo(null);
        iniciar();
    }

    public void iniciar() {
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setOpaque(true);

        etiTexto = new JLabel("Texto de ejemplo");

        btnAzul = new JButton("Azul");
        btnRojo = new JButton("Rojo");
        btnVerde = new JButton("Verde");
        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoVerde = new JButton("Fondo Verde");
        btnTransparente = new JButton("Transparente");
        btnOpaca = new JButton("Opaca");

        btnAzul.addActionListener(this);
        btnRojo.addActionListener(this);
        btnVerde.addActionListener(this);
        btnFondoAzul.addActionListener(this);
        btnFondoRojo.addActionListener(this);
        btnFondoVerde.addActionListener(this);
        btnTransparente.addActionListener(this);
        btnOpaca.addActionListener(this);

        panel.add(etiTexto);
        panel.add(btnAzul);
        panel.add(btnRojo);
        panel.add(btnVerde);
        panel.add(btnFondoAzul);
        panel.add(btnFondoRojo);
        panel.add(btnFondoVerde);
        panel.add(btnTransparente);
        panel.add(btnOpaca);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAzul) {
            etiTexto.setForeground(Color.BLUE);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(Color.RED);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(Color.GREEN);
        } else if (e.getSource() == btnFondoAzul) {
            panel.setBackground(Color.BLUE);
        } else if (e.getSource() == btnFondoRojo) {
            panel.setBackground(Color.red);
        } else if (e.getSource() == btnFondoVerde) {
            panel.setBackground(Color.GREEN);
        } else if (e.getSource() == btnTransparente) {
            panel.setOpaque(false);
        } else if (e.getSource() == btnOpaca) {
            panel.setOpaque(true);
        }
        panel.repaint();
    }

    public static void main(String[] args) {
        Punto8 ventana = new Punto8();
    }
}

