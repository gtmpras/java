class Overloading{
    int sum(int a , int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    float sum(int a, float b){
        return (a+b);
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Overloading od = new Overloading();
        System.out.println(od.sum(10, 15));
        System.out.println(od.sum(5,100,15));
        System.out.println(od.sum(2,2.5f));

    }
}
