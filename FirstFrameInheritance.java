import java.awt.*;

public  class FirstFrameInheritance extends Frame{
    FirstFrameInheritance(){
        Button b = new Button ("Click me");
        b.setBounds(30,100,80,30);
        //unignorable codes
        add(b);
        setTitle("Frame by inheritance");
        setLayout(null);
        setVisible(true);
        //upto this 

    }
    public static void main(String[] args) {
        FirstFrameInheritance f = new FirstFrameInheritance();
    }
}

