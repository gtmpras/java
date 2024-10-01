import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class ABStart implements ActionListener {

    JButton b1, b2, b3, b4, b5;
    // JFrame jf;
    JPanel p1, p2, p3;
    JLabel l, l1, l2, l3, l4, nl;
    JTextField tf1, tf2, tf3, tf4, nt;

    JButton next, prev, first, last, insert, update_name, update_cell, update_email, update_res;
    // // connecting database
    // Connection con = null;
    // Statement stmt = null;
    ResultSet rs;

    ABStart() {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(750, 400);
        jf.setTitle("A complete learning way!");
        jf.setLocation(100, 100);
        jf.setLayout(new BorderLayout());

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        jf.add(p1, BorderLayout.NORTH);
        jf.add(p2, BorderLayout.SOUTH);
        jf.add(p3, BorderLayout.CENTER);

        Font f1 = new Font("Mistral", Font.BOLD, 24);
        l = new JLabel("E-learning Application");
        l.setFont(f1);
        p1.add(l);

        b1 = new JButton("View");
        b2 = new JButton("Add");
        b3 = new JButton("Delete");
        b4 = new JButton("Update");
        b5 = new JButton("Search");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        jf.setVisible(true);
        new ABLogin();

    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args)  {
        new ABStart();
    }
}
