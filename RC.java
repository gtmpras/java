import javax.swing.*;
import java.awt.*;

public class RC extends JFrame {
    RC(){
        setSize(400,400);
        setLayout(null);

        JLabel gender= new JLabel("Select Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        add(gender);
        bg.add(male);
        bg.add(female);
        add(male);//adding to frame
        add(female);//adding to frame

        gender.setBounds(25,80,100,20);
        male.setBounds(200,80,100,20);
        female.setBounds(300,80,100,20);

        //checkbox
        JLabel hobb = new JLabel("Select your hobbies");
        JCheckBox c1 = new JCheckBox("Playing");
        JCheckBox c2 = new JCheckBox("Reading");
        JCheckBox c3 = new JCheckBox("Programming");
        add(hobb);
        add(c1);
        add(c2);
        add(c3);
        hobb.setBounds(25,120,140,20);
        c1.setBounds(50,140,140,20);
        c2.setBounds(50,160,140,20);
        c3.setBounds(50,180,140,20);
        setVisible(true);

    }
    public static void main(String[] args) {
        new RC();
    }
}
