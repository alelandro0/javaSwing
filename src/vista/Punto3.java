package vista;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Punto3 extends JFrame implements KeyListener, ActionListener {
    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;

    public Punto3() {
     
        setTitle("Punto3");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciar();
    }
    public void iniciar() {
    	
        
        txtTexto = new JTextField(15);
        etiTexto = new JLabel();
        btnVaciar = new JButton("Vaciar");

       
        txtTexto.addKeyListener(this);
        btnVaciar.addActionListener(this);

        
        txtTexto.setBounds(20, 20, 200, 30);
        etiTexto.setBounds(20, 60, 200, 30);
        btnVaciar.setBounds(20, 100, 100, 30);

     
        add(txtTexto);
        add(etiTexto);
        add(btnVaciar);

     
        setSize(250, 180);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
     
        String texto = txtTexto.getText();
       
        etiTexto.setText(texto);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVaciar) {
            
            txtTexto.setText("");
            etiTexto.setText("");
        }
    }

    public static void main(String[] args) {
        Punto3 ventana = new Punto3();
    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
