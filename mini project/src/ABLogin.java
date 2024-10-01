import java.awt.FlowLayout;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.*;
import javax.swing.*;

public class ABLogin implements ActionListener{
    JTextField tf1;
    JPasswordField tf2;
    JLabel l1,l2,l3;
    JButton b1;
    JDialog d;

    // //establishing connection
    // Connection con = null;
    // Statement stmt = null;
    ABLogin(){
        d= new JDialog();
        d.setTitle("Login");
        d.setSize(450,250);
        d.setLayout(null);
        d.setModal(true);
        d.setLocation(200,100);
        d.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       // Class.forName("com.mysql.jdbc.Driver");
        // con = DriverManager.getConnection("jdbc:mysql://localhost/ABook", "root", "arjun");
        // stmt = con.createStatement();
        l3 = new JLabel("Prasoon's Address Book");
        l3.setBounds(100,10,300,40);
        d.add(l3);
        l1 = new JLabel("User Name");
        l1.setBounds(50,70,100,25);
        d.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(160,70,100,25);
        d.add(tf1);

        l2 = new JLabel("Password");
        l2.setBounds(50,100,100,25);
        d.add(l2);

        tf2 = new JPasswordField();
        tf2.setBounds(160,100,100,25);
        d.add(tf2);

        b1 = new JButton("Login");
        d.add(b1);
        b1.addActionListener(this);
        d.setVisible(true);
        
    }

    public void actionPerformed (ActionEvent ae){

    }


}
