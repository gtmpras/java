

import javax.swing.*;
import java.awt.event.*;

public class AdapterExample  extends MouseAdapter {

    private JTextField txts1, txts2, res1;
    JFrame f;

    // Constructor
    AdapterExample() {
        f= new JFrame();
        f.setTitle("Sum & Diff");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        // First number input
        JLabel s1 = new JLabel("Enter first number:");
        txts1 = new JTextField(10);
        s1.setBounds(60, 100, 150, 25);
        txts1.setBounds(200, 100, 100, 25);
        f.add(s1);
        f.add(txts1);

        // Second number input
        JLabel s2 = new JLabel("Enter second number:");
        txts2 = new JTextField(10);
        s2.setBounds(60, 150, 150, 25);
        txts2.setBounds(200, 150, 100, 25);
        f.add(s2);
        f.add(txts2);

        // Result output
        JLabel resultLabel = new JLabel("Result:");
        res1 = new JTextField(10);
        resultLabel.setBounds(60, 200, 100, 25);
        res1.setBounds(200, 200, 100, 25);
        res1.setEditable(false);  // Result field should be non-editable
        f.add(resultLabel);
        f.add(res1);

        // Add mouse listener to result field
        res1.addMouseListener(this);

        // Set window size and make it visible
        f.setSize(400, 400);
        f.setVisible(true);
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        diff();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        sum();
    }

    
    // Method to calculate sum
    private void sum() {
        try {
            int num1 = Integer.parseInt(txts1.getText());
            int num2 = Integer.parseInt(txts2.getText());
            int sum = num1 + num2;
            res1.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            res1.setText("Invalid Input");
        }
    }

    // Method to calculate difference
    private void diff() {
        try {
            int num1 = Integer.parseInt(txts1.getText());
            int num2 = Integer.parseInt(txts2.getText());
            int diff = num1 - num2;
            res1.setText(String.valueOf(diff));
        } catch (NumberFormatException ex) {
            res1.setText("Invalid Input");
        }
    }

    // Main method
    public static void main(String[] args) {
        new swing_sum();
    }
}
