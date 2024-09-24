import java.awt.*;
import java.awt.event.*;


public class MenuDemo extends Frame{
    TextArea ta;
    public MenuDemo(){
        MenuBar mBar = new MenuBar();
        setMenuBar(mBar);

            //creating meuns
        Menu files = new Menu("Files");
        Menu date= new Menu("Date");
        Menu exit= new Menu("Exit");

        ta = new TextArea(10,40);
        add(ta);

        //add menus to menu bar

        mBar.add(files);
        mBar.add(date);
        mBar.add(exit);



        //create menu items to menus

        MenuItem mnew = new MenuItem("New");
        files.add(mnew);
        MenuItem msave = new MenuItem("Save");
        files.add(msave);

        //saving button content
        msave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                FileDialog dbox = new FileDialog(MenuDemo.this,"Open Dialog Boc",FileDialog.SAVE);
                dbox.setSize(200,100);
                dbox.setLocationRelativeTo(MenuDemo.this);
                dbox.setVisible(true);
            }
        });

        
        MenuItem open = new MenuItem("Open");
        files.add(open);


        //creating dialog box
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                FileDialog dbox = new FileDialog(MenuDemo.this,"Open Dialog Boc",FileDialog.LOAD);
                dbox.setSize(200,100);
                dbox.setLocationRelativeTo(MenuDemo.this);
                dbox.setVisible(true);
            }
        });
       

        files.addSeparator();
        MenuItem print = new MenuItem("Print");
        files.add(print);
        CheckboxMenuItem tb= new CheckboxMenuItem("Toolbar");
        files.add(tb);
        
        date.add(new MenuItem("Today"));
        exit.add(new MenuItem("Close"));


        setSize(500,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MenuDemo();

    }
}
