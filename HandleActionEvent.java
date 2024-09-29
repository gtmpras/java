
//Handling Action Events

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HandleActionEvent extends JFrame implements ActionListener {
    private JTextField txt1,txt2,txt3;
    HandleActionEvent() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        

        // entering 1st number
        JLabel f1 = new JLabel("Enter the first number: ");
        txt1 = new JTextField(80);
        f1.setBounds(60, 100, 150, 25);
        txt1.setBounds(220, 100, 100, 25);
        add(f1);
        add(txt1);

        // entering 2nd number
        JLabel f2 = new JLabel("Enter the second number: ");
        txt2 = new JTextField(80);
        f2.setBounds(60, 150, 150, 25);
        txt2.setBounds(220, 150, 100, 25);
        add(f2);
        add(txt2);

        
        // entering result
        JLabel f3 = new JLabel("Result is: ");
        txt3 = new JTextField(80);
        f3.setBounds(60, 200, 150, 25);
        txt3.setBounds(220, 200, 100, 25);
        add(f3);
        add(txt3);

        JButton b1 = new JButton("Add");
        b1.setBounds(60,230,80,20);
        add(b1);

        JButton b2 = new JButton("Sub");
        add(b2);
        b2.setBounds(140,230,80,20);
        b1.addActionListener(this);
        b2.addActionListener(this);

    

    }
    
    public void actionPerformed(ActionEvent ae){
        int x,y,z;
        x= Integer.parseInt(txt1.getText());
        y = Integer.parseInt(txt2.getText());
        if(ae.getActionCommand()== "Add"){
            z = x+y;
            txt3.setText(String.valueOf(z));
        }else{
            z = x-y;
            txt3.setText(String.valueOf(z));
        }
    }
    
    public static void main(String[] args) {
     HandleActionEvent s =  new HandleActionEvent();
        s.setVisible(true);
        s.setSize(500, 500);

    }
}
