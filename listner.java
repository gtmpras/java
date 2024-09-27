import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import javax.swing.*;
public class listner extends JFrame {
    listner(){
        setSize(400,500);
        JButton  lbl = new JButton("click Me");
        lbl.setBounds(25,50,80,20);
        JTextField txt = new JTextField(50);
        txt.setBounds(80,50,80,20);
        add(lbl);
        add(txt);
        setVisible(true);
        setLayout(null);
        lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txt.setText("Hello prasoon");

            }
        });
        
    }
    public static void main(String[] args) {
        new listner();
    }
    
}
