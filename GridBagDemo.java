import java.awt.*;

public class GridBagDemo extends Frame{
    Button b1,b2,b3,b4,b5;
    GridBagConstraints gbc;
    GridBagDemo(){
        setSize(400,250);
        setTitle("GridBag Layout Demo");
        setLayout(new GridBagLayout());
        gbc= new GridBagConstraints();
        b1= new Button("Button 1");

        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 1;
        //gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(b1,gbc); 
        
        
        b2=new Button("Button 2");
        gbc.gridx = 1;
        add(b2,gbc);
      //  setVisible(true);

        
        b3=new Button("Button 3");
        gbc.gridx = 2;
        add(b3,gbc);
        //setVisible(true);


        b4 = new Button("This is a long button 4");
        gbc.ipady = 40;
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(b4,gbc);
       // setVisible(true);

        b5 = new Button("Button 5");
        b5.setBackground(Color.red);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipady = 20;
        gbc.gridwidth = 2;
        add(b5,gbc);
        setVisible(true);
        
    
    }

public static void main(String[] args) {
    GridBagDemo frame = new GridBagDemo();
}

}
