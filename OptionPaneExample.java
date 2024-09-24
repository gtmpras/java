
// import javax.swing.*;

// public class OptionPaneExample extends JFrame{
//     //Java JOptionPane Example: showMessageDialog()


//     // OptionPaneExample(){
//     //     JFrame f = new JFrame();
//     //     JOptionPane.showMessageDialog(f,"Hello , Welcome");
//     // }

//     //    //Java JOptionPane Example: showMessageDialog()
//     // OptionPaneExample (){
//     //     JFrame f = new JFrame();
//     //     JOptionPane.showMessageDialog(f, "Successfully Updated","Alert",JOptionPane.WARNING_MESSAGE);
//     // }

//     //Java JOptionPane Example: showInputDialog()
//     // OptionPaneExample(){
//     //     JFrame f = new JFrame();
//     //     String name = JOptionPane.showInputDialog(f,"Enter your full name");
//     // }

//     public static void main(String[] args) {
//         new OptionPaneExample();
//     }
// }

    //Java JOptionPane Example: showConfirmDialog()
    
import javax.swing.*;
import java.awt.Window;
import java.awt.event.*;
public class OptionPaneExample extends WindowAdapter{
        JFrame f;
        OptionPaneExample(){
             f = new JFrame();
            f.addWindowListener(this);
            f.setSize(300,300);
            f.setLayout(null);
            f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            f.setVisible(true);
        }
        public void windowClosing(WindowEvent e){
            int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
            if(a == JOptionPane.YES_OPTION){
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }}
            public static void main(String[] args) {
                new OptionPaneExample();
            }
        
    


    }
    
