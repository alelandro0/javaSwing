package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Punto10 extends JFrame implements ActionListener {
    private JTextField txtPalabra1;
    private JTextField txtPalabra2;
    private JButton btnConcatena;
    private JLabel etiTexto;

    public Punto10() {
        setTitle("Concatenador de Palabras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        iniciar();
    }

    public void iniciar() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel lblPalabra1 = new JLabel("Palabra 1:");
        JLabel lblPalabra2 = new JLabel("Palabra 2:");

        txtPalabra1 = new JTextField(10);
        txtPalabra2 = new JTextField(10);

        btnConcatena = new JButton("Concatena");
        btnConcatena.addActionListener(this);

        etiTexto = new JLabel();

        panel.add(lblPalabra1);
        panel.add(txtPalabra1);
        panel.add(lblPalabra2);
        panel.add(txtPalabra2);
        panel.add(btnConcatena);
        panel.add(etiTexto);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConcatena) {
            String palabra1 = txtPalabra1.getText();
            String palabra2 = txtPalabra2.getText();

            String resultado = palabra1 + palabra2;
            etiTexto.setText(resultado);
        }
    }

    public static void main(String[] args) {
        Punto10 ventana = new Punto10();
    }
}
