
//handling test events
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class EventTest extends JFrame implements TextListener{
    TextField t;
    JLabel l;
    public EventTest()
    {
        setTitle("Handling event items");
        setLayout( new FlowLayout(FlowLayout.CENTER, 100, 40));
        t= new TextField(40);
        l = new JLabel("Handling text event");
        add(t);
        add(l);
        t.addTextListener(this);
    }

    public void textValueChanged(TextEvent te){
        if(te.getSource()==t){
            String msg = "You typed "+t.getText();
            l.setText(msg);
        }
    }

    public static void main(String[] args) {
        EventTest et= new EventTest();
        et.setVisible(true);
        et.setSize(500,400);
    }
}
