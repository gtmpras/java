
// class Th1 extends Thread{
//     public void run(){
//         for(int i = 1; i<= 50;i++){
//             System.out.println("Hello this is muti threading");
//         }
//     }

    
// }

// class Th2 extends Thread{
//     public void run(){
//         for(int i = 1; i<= 50;i++){
//             System.out.println("Hello this is Agian muti threading");
//         }
//     }

    
// }
class Th1 implements Runnable {
    public void run(){
        for(int i = 1; i<= 50;i++){
            System.out.println("Hello this is single  threading");
        }
    }

    
}
class Th2 implements Runnable{
    public void run(){
        for(int i = 1; i<= 50;i++){
            System.out.println("Hello this is  threading");
        }
    }

    
}
public class MultiThreading_extend  {
    
    public static void main(String[] args) {
        Th1 obA = new Th1();
        Thread t1 = new Thread(obA);
        Th2 obB = new Th2();
        Thread t2 = new Thread(obB);
        // obA.start();
        // obB.start();
        t1.start();
        t2.start();
        
    }
}
