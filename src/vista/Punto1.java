package vista;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Punto1 extends JFrame implements ActionListener {
    private JLabel etiNombre;
    private JLabel etiCiudad;
    private JButton btnOcultarNombre;
    private JButton btnVisuNombre;
    private JButton btnOcultarCiudad;
    private JButton btnVisuCiudad;
    
    public Punto1() {
        setTitle("DON APARATO");
        setSize(435, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
        setVisible(true);
    }

    public void iniciarComponentes() {
        etiNombre = new JLabel("Alejandro");
        etiNombre.setBounds(50, 50, 150, 30); 
        
        etiCiudad = new JLabel("Armenia");
        etiCiudad.setBounds(50, 100, 150, 30); 
        
        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnOcultarNombre.setBounds(200, 50, 150, 30); 
        btnOcultarNombre.addActionListener(this);
        
        btnVisuNombre = new JButton("Visualizar Nombre");
        btnVisuNombre.setBounds(200, 100, 150, 30); 
        btnVisuNombre.addActionListener(this);
        
        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnOcultarCiudad.setBounds(200, 150, 150, 30); 
        btnOcultarCiudad.addActionListener(this);
        
        btnVisuCiudad = new JButton("Visualizar Ciudad");
        btnVisuCiudad.setBounds(200, 200, 150, 30);
        btnVisuCiudad.addActionListener(this);
        
        add(etiNombre);
        add(etiCiudad);
        add(btnOcultarNombre);
        add(btnVisuNombre);
        add(btnOcultarCiudad);
        add(btnVisuCiudad);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOcultarNombre) {
            etiNombre.setVisible(false);
        } else if (e.getSource() == btnVisuNombre) {
            etiNombre.setVisible(true);
        } else if (e.getSource() == btnOcultarCiudad) {
            etiCiudad.setVisible(false);
        } else if (e.getSource() == btnVisuCiudad) {
            etiCiudad.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Punto1 ventana = new Punto1();
    }
}
