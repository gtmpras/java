class Rectangle{
    private int length;
    private int breadth;
    private int area,perimeter;

    Rectangle(){

        //default constructor
        //by default constructor is public
        System.out.println("Constructor called");
        length = 0;
        breadth = 0;


    }
    //constructor overloading
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }

        //setting parameterized values.
    void setData(int l, int b){
        length = l;
        breadth = b;
    }

    void calculateArea(){
        area = length * breadth;
        
    }
     
    void calculatePerimeter(){
        perimeter = 2*(length + breadth);
    }


//for displaying 
    void displayResult(){
        System.out.println("Area is: "+ area);
        System.out.println("Perimeter is: "+perimeter);
    }


}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //taking new parameter values
        rectangle.setData(15, 12);

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.displayResult();

        //another constructor object
        Rectangle rectangle2 = new Rectangle();
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        rectangle2.displayResult();

    }
}
