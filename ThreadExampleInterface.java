class Thread1 implements Runnable{
    String tname;
    Thread1(String n){
        tname = n;
        System.out.println("Creating: "+tname);
    }
    public void run(){
        System.out.println("Running"+tname);
        try{

            for(int i=1;i<5;i++){
                System.out.println("Thread: "+tname + " Printing: "+i);
                Thread.sleep(30);//creates exception so handle this with try and catch block.
            }
        }
        catch (InterruptedException e){
            System.out.print("Thread: "+tname+ " Interrupted");
        }
        System.out.println("Running: "+tname);
    }
}

public class ThreadExampleInterface {
    public static void main(String[] args) {
        Thread1 R1 = new Thread1("One");
        Thread t1 = new Thread(R1);
        t1.start();
            Thread1 R2 = new Thread1("Two");
        Thread t2 = new Thread(R2);
        t2.start();
    }   
}
