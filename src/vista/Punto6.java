package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Punto6 extends JFrame implements ActionListener {
    private JLabel etiNombre;
    private JButton btnEsquina;
    private JButton btnCentro;
    private JButton btnAgrandar;
    private JButton btnAchicar;

    public Punto6() {
        setTitle("Punto6");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 300);
        iniciar();
    }

    public void iniciar() {
        etiNombre = new JLabel("Tu Nombre");
        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.YELLOW);
        etiNombre.setBounds(20, 20, 200, 50);

        btnEsquina = new JButton("Esquina");
        btnCentro = new JButton("Centro");
        btnAgrandar = new JButton("Agrandar");
        btnAchicar = new JButton("Achicar");

        btnEsquina.setBounds(20, 80, 100, 30); 
        btnCentro.setBounds(130, 80, 100, 30); 
        btnAgrandar.setBounds(240, 80, 100, 30); 
        btnAchicar.setBounds(350, 80, 100, 30);

        btnEsquina.addActionListener(this);
        btnCentro.addActionListener(this);
        btnAgrandar.addActionListener(this);
        btnAchicar.addActionListener(this);
        
        add(etiNombre);
        add(btnEsquina);
        add(btnCentro);
        add(btnAgrandar);
        add(btnAchicar);

        setVisible(true);

        btnEsquina.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnEsquina.setFont(btnEsquina.getFont().deriveFont(Font.BOLD, 14f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnEsquina.setFont(btnEsquina.getFont().deriveFont(Font.PLAIN, 12f));
            }
        });

        btnCentro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnCentro.setFont(btnCentro.getFont().deriveFont(Font.BOLD, 14f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnCentro.setFont(btnCentro.getFont().deriveFont(Font.PLAIN, 12f));
            }
        });

        btnAgrandar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnAgrandar.setFont(btnAgrandar.getFont().deriveFont(Font.BOLD, 14f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAgrandar.setFont(btnAgrandar.getFont().deriveFont(Font.PLAIN, 12f));
            }
        });

        btnAchicar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnAchicar.setFont(btnAchicar.getFont().deriveFont(Font.BOLD, 14f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAchicar.setFont(btnAchicar.getFont().deriveFont(Font.PLAIN, 12f));
            }
        });

     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEsquina) {
            etiNombre.setLocation(10, 10);
        } else if (e.getSource() == btnCentro) {
            int x = (getWidth() - etiNombre.getWidth()) / 2;
            int y = (getHeight() - etiNombre.getHeight()) / 2;
            etiNombre.setLocation(x, y);
        } else if (e.getSource() == btnAgrandar) {
            int width = etiNombre.getWidth() + 20;
            int height = etiNombre.getHeight() + 10;
            etiNombre.setSize(width, height);
        } else if (e.getSource() == btnAchicar) {
            int width = etiNombre.getWidth() - 20;
            int height = etiNombre.getHeight() - 10;
            etiNombre.setSize(width, height);
        }
    }

    public static void main(String[] args) {
        Punto6 ventana = new Punto6();
    }
}
