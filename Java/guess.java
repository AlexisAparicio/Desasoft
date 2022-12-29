import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class guess  implements ActionListener{
    JFrame ventana;
    JLabel lbl_info, lbl_reiniciar,lbl_res,lbl_cont,lbl_adivi;
    JTextField tf_num1,tf_res,tf_cont;
    JButton btn_reiniciar,btn_comprobar,btn_inicio;

    public static void main(String[]args)
    { 
        new guess();
    }

    guess()
    {
        ventana=new JFrame("Adivinanza");
        ventana.setBounds(100,100,500,500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Label //
        lbl_info= new JLabel("Juego de Adivinanza");
        lbl_info.setBounds(40,40,200,20);
        ventana.add(lbl_info);

        lbl_cont= new JLabel("Intentos");
        lbl_cont.setBounds(10,135,70,20);
        ventana.add(lbl_cont);

        lbl_adivi= new JLabel("aleatorio");
        lbl_adivi.setBounds(10,90,90,20);
        ventana.add(lbl_adivi);

        //Casilla de Texto aleatorio//
        tf_num1 = new JTextField();
        tf_num1.setBounds(70,90,50,20);
        ventana.add(tf_num1);

        //casilla de texto del cliente
        tf_res = new JTextField();
        tf_res.setBounds(70,115,50,20);
        ventana.add(tf_res);

        tf_cont = new JTextField();
        tf_cont.setBounds(70,135,50,20);
        ventana.add(tf_cont);


        //Botones//
        btn_reiniciar= new JButton("Reiniciar el juego");
        btn_reiniciar.setBounds(40,190,150,20);
        btn_reiniciar.addActionListener(this);
        ventana.add(btn_reiniciar);

        btn_comprobar = new JButton("comprobar");
        btn_comprobar.setBounds(200,190,120,20);
        btn_comprobar.addActionListener(this);
       ventana.add(btn_comprobar);

        btn_inicio = new JButton("Iniciar");
        btn_inicio.setBounds(40,160,100,20);
        btn_inicio.addActionListener(this);
        ventana.add(btn_inicio);


        ventana.setVisible(true);
    }

public void actionPerformed(ActionEvent e)
{
    int num1=0,num2=0,res=0,cont=0;
    try{
        num1= Integer.parseInt(tf_res.getText());
        num2= Integer.parseInt(tf_num1.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(ventana, "Error en numero");
        }

    if(e.getSource()==btn_inicio)
    {
        System.out.println("Iniciar");
        Random rnd= new Random();
        int rand = rnd.nextInt(100);
        tf_num1.setText(String.valueOf(rand));
        tf_cont.setText(String.valueOf(cont));
    }
    if(e.getSource()==btn_reiniciar)
    {
        System.out.println("Reiniciar");
        cont=0;
        Random rnd= new Random();
        int rand1 = rnd.nextInt(100);
        tf_num1.setText(String.valueOf(rand1));
        cont=cont+1;
        tf_cont.setText(String.valueOf(cont));
    }

    if(e.getSource()==btn_comprobar)
        {
         tf_res.getText();
             if(num2!=num1)
              { 
                   JOptionPane.showMessageDialog(ventana, "Intentar de nuevo");
            
             tf_cont.setText(String.valueOf(cont));
             System.out.println("Comprobar -intentar");
            }
            if(num2==num1)
            {
        JOptionPane.showMessageDialog(ventana, "Lo Lograste");
        System.out.println("Comprobar lo lograste");
    
            }
            tf_cont.setText(String.valueOf(cont));
    }

}

}
