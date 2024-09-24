import java.awt.*;
public class CardLayoutDemo extends Frame {
    Panel p1,p2,p3;
    static CardLayout cl;
    CardLayoutDemo(){
        setSize(300,200);
        setTitle("Card Layout Demo");
        cl = new CardLayout();
        setLayout(cl);

        p1= new Panel();
        p2= new Panel();
        // p3 = new Panel();
        
        p1.setBackground(Color.RED);
        p1.add(new Label("This is Red Panel"));
        p2.setBackground(Color.blue);
        p2.add(new Label("This is blue panel"));

        add("RED Panel",p1);
        add("Blue Panel",p2);
        setVisible(true);

    }
    public static void main(String[] args) {
        CardLayoutDemo first = new CardLayoutDemo();
        CardLayoutDemo second = new CardLayoutDemo();
        cl.next(second);
    }
}
