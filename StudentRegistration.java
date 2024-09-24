//Student Registration form created by using AWT Controls
import java.awt.*;

class StudentRegistration extends Frame{

    //****labeling must be at the top of hierarchy
    
    Label lblhd = new Label("Student detail",Label.CENTER);
    Label lblname = new Label("Name",Label.LEFT);
    Label lblage = new Label("Age",Label.LEFT);
    //choice for age
    Choice chage= new Choice();
    
    Label lblsex = new Label("Sex(M/F)",Label.LEFT);
    //for radio button
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox chkmale = new Checkbox("Male",true,cbg);//male checkbox
    Checkbox chkfemale= new Checkbox("Female",false,cbg);//female checkbox
    
    Label lblhob = new Label("Hobbies",Label.LEFT);
    //list of hobbies with multiple selection
    List hb= new List(3,true);

    
    Label lbladdr= new Label("Address",Label.LEFT);
    //Creating textfield for Address
    TextArea txtaddr = new TextArea(" ",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
    Label lblcourse= new Label("Course",Label.LEFT);
    //choice for course
    Choice course = new Choice();

    Label lblsem = new Label("Semester",Label.LEFT);
    //choice for semester
    Choice sem = new Choice();


    //for save button
    Button b1 = new Button("save");


    //Constructor class
    StudentRegistration(){
        setBackground(Color.cyan);
        setForeground(Color.black);
        setLayout(null);

        lblhd.setBounds(10,40,280,20);
        add(lblhd);
        
        //*****set for name
        lblname.setBounds(25,65,90,20);
        add(lblname);
        TextField txtname = new TextField();
        add(txtname);
        txtname.setBounds(75,65,200,20);


        //*****set for age

        lblage.setBounds(25,90,90,20);
        add(lblage);
        chage.setBounds(120,90,50,20);
        add(chage);
        chage.add("17");
        chage.add("18");
        chage.add("19");
        chage.add("20");


        //****set for gender

        lblsex.setBounds(25,120,90,20);
        add(lblsex);
        //radio button 
        chkmale.setBounds(120,120,50,20);
        add(chkmale);
        chkfemale.setBounds(170,120,60,20);
        add(chkfemale);

        //****set for hobbies
        lblhob.setBounds(25,150,90,20);
        add(lblhob);
        hb.setBounds(120,150,90,50);
        add(hb);
        hb.add("Movie");
        hb.add("Coding");
        hb.add("Reading");
        hb.add("Walking");

        //**** set for Address
        lbladdr.setBounds(25,230,90,20);
        add(lbladdr);
        txtaddr.setBounds(120,230,170,60);
        add(txtaddr);

        //**** set for Course
        lblcourse.setBounds(25,305,90,20);
        add(lblcourse);
        course.setBounds(120,305,100,20);
        course.add("Bsc.CSIT");
        course.add("BIM");
        course.add("BCA");
        course.add("B.E Computer");
        add(course);

        //*** set for Semester
        lblsem.setBounds(25,335,90,20);
        add(lblsem);
        sem.add("1st");
        sem.add("2nd");
        sem.add("3rd");
        sem.add("4th");
        sem.add("5th");
        sem.add("6th");
        sem.add("7th");
        sem.add("8th");
        sem.setBounds(120,335,50,20);
        add(sem);
        

        
        //*** creating I7
        
        //*** creating save button
        b1.setBounds(120,400,50,30);
        add(b1);

        
        
        
    }

    //main function

    public static void main(String[] args) {
        StudentRegistration stu = new StudentRegistration();
        stu.setSize(new Dimension (500,500));
        stu.setTitle("Student Registration");
        stu.setVisible(true);
    }
    
}