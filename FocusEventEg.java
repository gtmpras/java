
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FocusEventEg extends JFrame implements FocusListener {
    private JTextField txt1,txt2,txt3;
    JLabel t1,t2,t3;
    JButton b1;

    FocusEventEg(){
        super("focus event");
        setSize(500,500);
        t1 = new JLabel("Enter the first number");
        t2 = new JLabel("Enter the second number");
        t3 = new JLabel("Result");
        txt1 = new JTextField(20);
        txt2= new JTextField(20);
        txt3 = new JTextField(20);
        b1 = new JButton("multiply");
        txt1.addFocusListener(this);
        txt2.addFocusListener(this);
        b1.addFocusListener(this);
       

        setLayout(new FlowLayout(FlowLayout.LEFT,125,10));
        add(t1);
        add(txt1);
        add(t2);
        add(txt2);
        add(t3);
        add(txt3);
        add(b1);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        FocusEventEg kh =  new FocusEventEg();
        //kh.setSize(400,500);
    }
    @Override
    public void focusGained(FocusEvent ke){
        int x, y,z;
        if(ke.getSource()==b1){
           
            x= Integer.parseInt(txt1.getText());
            y= Integer.parseInt(txt2.getText());
            z = x*y;
            txt3.setText(String.valueOf(z));
        }
    }
    @Override
    public void focusLost(FocusEvent ke){
        if(ke.getSource()==txt1 && txt1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "ENter number to continue");
            txt1.requestFocus();
        }
        if(ke.getSource()==txt2 && txt2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "ENter number to continue");
            txt2.requestFocus();
        }

    }
    

}

