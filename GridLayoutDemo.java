import java.awt.*;

public class GridLayoutDemo extends Frame {
    Button b1,b2,b3,b4,b5;
    GridLayoutDemo()

    {
        setSize(400,200);
        setTitle("GridLayout Demo");
        setLayout(new GridLayout(0,3));

        b1= new Button("Button 1");
        
        b2= new Button("Button 2");
        b3= new Button("Button 3");
        b4= new Button("Button 4");
        b5= new Button("Button 5");
        
        add(b1);
        add(b2);
        
        add(b3);
        add(b4);
        
        add(b5);
        setVisible(true);

        
    }
    public static void main(String[] args) {
        GridLayoutDemo frame = new GridLayoutDemo();
    }
}