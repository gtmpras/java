//Program to create a new file in java with file handling
import java.io.FileOutputStream;
public class FileOutputStreamExample{
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("CSIT7th.txt");
            String s = "Welcome to Ambikeshwari Campus";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("successs");
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}