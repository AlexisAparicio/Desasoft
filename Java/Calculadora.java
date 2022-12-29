import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Calculadora implements ActionListener{
    JFrame ventana;
    JLabel lbl_num1, lbl_num2,lbl_res;
    JTextField tf_num1,tf_oper,tf_num2,tf_res;
    JButton btn_calcular,btn_sumar,btn_aleatorio;

    public static void main(String[]args)
    {
        new Calculadora();
    }

    Calculadora()
    {
        ventana=new JFrame("Calculadora");
        ventana.setBounds(100,100,500,500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Labels//
        lbl_num1 = new JLabel("num1");
        lbl_num1.setBounds(40,40,50,20);
        ventana.add(lbl_num1);

        lbl_num2 = new JLabel("num2");
        lbl_num2.setBounds(40,75,50,20);
        ventana.add(lbl_num2);

        lbl_res= new JLabel("Resultado");
        lbl_res.setBounds(20,100,70,20);
        ventana.add(lbl_res);

        // Casilla de texto
        tf_num1 = new JTextField();
        tf_num1.setBounds(95,40,50,20);
        ventana.add(tf_num1);

        tf_oper = new JTextField();
        tf_oper.setBounds(70,60,20,20);
        ventana.add(tf_oper);

        tf_num2 =  new JTextField();
        tf_num2.setBounds(95,75,50,20);
        ventana.add(tf_num2);

        tf_res = new JTextField();
        tf_res.setBounds(95,100,50,20);
        ventana.add(tf_res);

        //Botones
        btn_calcular = new JButton("Calcular");
        btn_calcular.setBounds(40,125,100,20);
        btn_calcular.addActionListener(this);
        ventana.add(btn_calcular);

        btn_sumar = new JButton("+");
        btn_sumar.setBounds(145,125,30,20);
        btn_sumar.addActionListener(this);
        ventana.add(btn_sumar);

        btn_aleatorio = new JButton("Aleatorio");
        btn_aleatorio.setBounds(40,150,100,20);
        btn_aleatorio.addActionListener(this);
        ventana.add(btn_aleatorio);

        ventana.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
       int num1=0,num2=0,res=0;
       try{
       num1= Integer.parseInt(tf_num1.getText());
       num2= Integer.parseInt(tf_num2.getText());
       }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(ventana, "Error en numero");
       }

       //Boton de calcular por el cuadro de operador
       if(e.getSource()==btn_calcular)
        {
            if(tf_oper.getText().equals("+"))
            res= num1+num2;
            if(tf_oper.getText().equals("-"))
            res= num1-num2;
            if(tf_oper.getText().equals("*"))
            res= num1*num2;
            if(tf_oper.getText().equals("/"))
            res= num1/num2;
        }
        //Boton de sumar
        if(e.getSource()==btn_sumar)
        res= num1+num2;

        if(e.getSource()==btn_aleatorio)
        {
            Random rnd= new Random();
            tf_num1.setText(String.valueOf(rnd.nextInt(100)));
            tf_num2.setText(String.valueOf(rnd.nextInt(100)));
        }

       tf_res.setText(String.valueOf(res));
    }

}
