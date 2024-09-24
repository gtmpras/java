import java.awt.*;

public class FirstFrameAssociation {
    FirstFrameAssociation(){
        Frame f = new Frame();//creating a frame
        Button b = new Button ("Click me");
        b.setBounds(100,100,80,30);
        //unignorable codes
        f.add(b);
        f.setTitle("Frame by inheritance");
        f.setLayout(null);
        f.setVisible(true);
        //upto this 

    }
    public static void main(String[] args) {
        FirstFrameInheritance f = new FirstFrameInheritance();
    }
}