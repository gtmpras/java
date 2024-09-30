
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyHandleActionEvent extends JFrame implements KeyListener {
    private JTextField txt1,txt2,txt3;
    JLabel t1,t2,t3;
    JButton b1,b2;

    KeyHandleActionEvent(){
        setSize(500,500);
        t1 = new JLabel("Enter the first number");
        t2 = new JLabel("Enter the second number");
        t3 = new JLabel("Result");
        txt1 = new JTextField(20);
        txt2= new JTextField(20);
        txt3 = new JTextField(20);
        b1 = new JButton("CONTINUE");
        txt3.addKeyListener(this);
        b1.addKeyListener(this);
       

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
        KeyHandleActionEvent kh =  new KeyHandleActionEvent();
        //kh.setSize(400,500);
    }
    @Override
    public void keyPressed(KeyEvent ke){

            int x, y,z;
            x= Integer.parseInt(txt1.getText());
            y= Integer.parseInt(txt2.getText());
            if(ke.getKeyChar()== 'a'){
                z = x+y;
            }
            else if(ke.getKeyChar()== 's'){
                z = x - y;
            }
            else
            {
                txt3.setText("Press a or s");
                return ;
            }
            txt3.setText(String.valueOf(z));
    }
    @Override
    public void keyTyped(KeyEvent ke){

    }
    
    @Override
    public void keyReleased(KeyEvent ke){
        
    }
}

