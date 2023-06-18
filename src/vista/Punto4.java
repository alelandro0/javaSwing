package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Punto4 extends JFrame implements ActionListener {
    private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar;
    private JButton btnDesactivar;
    private JButton btnActivar;

    public Punto4() {
        
        setTitle("Punto4");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciar();
    }
    public void iniciar() {
       
        txtNombre = new JTextField(15);
        txtCiudad = new JTextField(15);
        txtFrase = new JLabel();
        btnAceptar = new JButton("Aceptar");
        btnDesactivar = new JButton("Desactivar");
        btnActivar = new JButton("Activar");


        btnAceptar.addActionListener(this);
        btnDesactivar.addActionListener(this);
        btnActivar.addActionListener(this);

        
        txtNombre.setBounds(10, 10, 200, 25);
        txtCiudad.setBounds(10, 40, 200, 25);
        txtFrase.setBounds(10, 70, 400, 25);
        btnAceptar.setBounds(10, 100, 100, 25);
        btnDesactivar.setBounds(120, 100, 100, 25);
        btnActivar.setBounds(230, 100, 100, 25);

       
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Ciudad:"));
        add(txtCiudad);
        add(txtFrase);
        add(btnAceptar);
        add(btnDesactivar);
        add(btnActivar);

      
        setSize(450, 170);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            String nombre = txtNombre.getText();
            String ciudad = txtCiudad.getText();
            String frase = "Usted se llama " + nombre + " y vive en " + ciudad + ".";
            txtFrase.setText(frase);
        } else if (e.getSource() == btnDesactivar) {
            txtNombre.setEnabled(false);
            txtCiudad.setEnabled(false);
        } else if (e.getSource() == btnActivar) {
            txtNombre.setEnabled(true);
            txtCiudad.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        Punto4 ventana = new Punto4();
    }
}

