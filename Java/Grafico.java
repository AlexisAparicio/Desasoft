import javax.swing.*;
import java.awt.event.*;

public class Grafico implements ActionListener
{
    JFrame ventana;
    JLabel lbl_texto,lbl_nombre,lbl_apellido;
    JTextField tf_nombre,tf_apellido;
    JButton btn_escribir,btn_apellido;

    public static void main(String[]args)
    {
        new Grafico();
    }

    Grafico()
    {
    //Ventana//
    ventana= new JFrame("Mi Ventana");
    ventana.setSize(500,300);
    ventana.setLocation(100,100);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLayout(null);

    //labels//

    //label principal//
    lbl_texto = new JLabel("Hola Mundo");
    lbl_texto.setSize(120,20);
    lbl_texto.setLocation(100,30);
    ventana.add(lbl_texto);

    //Label nombre//
    lbl_nombre = new JLabel("Nombre:");
    //lbl_nombre.setSize(80,20);
    //lbl_nombre.setLocation(50,50);
    lbl_nombre.setBounds(50,50,80,20);
    ventana.add(lbl_nombre);

    lbl_apellido = new JLabel("Apellido:");
    //lbl_nombre.setSize(80,20);
    //lbl_nombre.setLocation(50,50);
    lbl_apellido.setBounds(50,75,80,20);
    ventana.add(lbl_apellido);

    //Casilla de texto
    tf_nombre= new JTextField();
    tf_nombre.setBounds(135,50,100,20);
    ventana.add(tf_nombre);

    tf_apellido= new JTextField();
    tf_apellido.setBounds(135,75,100,20);
    ventana.add(tf_apellido);

    //Boton
    btn_escribir = new JButton("Escribir");
    btn_escribir.setBounds(50,100,80,20);
    btn_escribir.addActionListener(this);
    ventana.add(btn_escribir);

    btn_apellido=new JButton("Apellido");
    btn_apellido.setBounds(135,100,80,20);
    btn_apellido.addActionListener(this);
    ventana.add(btn_apellido);





    ventana.setVisible(true);
    }

    // Metodo de interfaz
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Entrando ActionPerformed");
        if(e.getSource()==btn_escribir)
            tf_nombre.setText("Bolivar");
        if(e.getSource()==btn_apellido)
        tf_apellido.setText(tf_nombre.getText());
    }
}

