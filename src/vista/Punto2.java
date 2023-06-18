package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Punto2 extends JFrame implements ActionListener {
    private JTextField txtTexto1;
    private JTextField txtTexto2;
    private JButton btnTraspasa1;
    private JButton btnTraspasa2;

    public Punto2 () {
       
        setTitle("Ejercicio 2");
        setSize(300, 170);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        iniciarComponentes();
    }
    public void iniciarComponentes() {
    	
    
        txtTexto1 = new JTextField(15);
        txtTexto2 = new JTextField(15);
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa2 = new JButton("Traspasa 2");

       
        btnTraspasa1.addActionListener(this);
        btnTraspasa2.addActionListener(this);

       
        add(txtTexto1);
        add(btnTraspasa1);
        add(txtTexto2);
        add(btnTraspasa2);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTraspasa1) {
            txtTexto2.setText(txtTexto1.getText());
            txtTexto1.setText("");
        } else if (e.getSource() == btnTraspasa2) {
            txtTexto1.setText(txtTexto2.getText());
            txtTexto2.setText("");
        }
    }

    public static void main(String[] args) {
    	Punto2 ventana = new Punto2 ();
    }
}
