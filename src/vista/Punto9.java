package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Punto9 extends JFrame implements ActionListener {
    private JTextField txtPrimerTrimestre;
    private JTextField txtSegundoTrimestre;
    private JTextField txtTercerTrimestre;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;
    private JButton btnCalcular;

    public Punto9() {
        setTitle("Calculadora de Notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        iniciar();
    }

    public void iniciar() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        

        JLabel lblPrimerTrimestre = new JLabel("Primer Trimestre:");
        JLabel lblSegundoTrimestre = new JLabel("Segundo Trimestre:");
        JLabel lblTercerTrimestre = new JLabel("Tercer Trimestre:");

        txtPrimerTrimestre = new JTextField(10);
        txtSegundoTrimestre = new JTextField(10);
        txtTercerTrimestre = new JTextField(10);

        etiNotaFinal = new JLabel("Nota Final:");
        etiResultado = new JLabel("Resultado:");

        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this);

        panel.add(lblPrimerTrimestre);
        panel.add(txtPrimerTrimestre);
        panel.add(lblSegundoTrimestre);
        panel.add(txtSegundoTrimestre);
        panel.add(lblTercerTrimestre);
        panel.add(txtTercerTrimestre);
        panel.add(btnCalcular);
        panel.add(etiNotaFinal);
        panel.add(etiResultado);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
            double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
            double nota3 = Double.parseDouble(txtTercerTrimestre.getText());

            double notaFinal = (nota1 + nota2 + nota3) / 3;
            etiNotaFinal.setText("Nota Final: " + notaFinal);

            if (notaFinal < 5) {
                etiResultado.setText("Resultado: SUSPENSO");
                etiResultado.setForeground(Color.RED);
                etiNotaFinal.setForeground(Color.RED);
            } else {
                etiResultado.setText("Resultado: APROBADO");
                etiResultado.setForeground(Color.BLACK);
                etiNotaFinal.setForeground(Color.BLACK);
            }
        }
    }

    public static void main(String[] args) {
        Punto9 ventana = new Punto9();
    }
}

