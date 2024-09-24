import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args) {
        
    int a[] = {10,5,19,23,14,35};
    int b[] = new int[5];

    int pos = Arrays.binarySearch(a, 19);
    System.out.println("Index of 19 is: "+pos);

    boolean flag = Arrays.equals(a, b);
    System.out.println("Are a and b equal: "+flag);

    System.arraycopy(a, 0, b, 0, 5);
    System.out.println("*******Elements of b are ************");
    for (int i = 0;i<5;i++){
        System.out.println(b[i]+ " ");
    }
        System.out.println();
        Arrays.sort(a);
        System.out.println("************After sorting elements are**********");
        for(int i=0;i<5;i++){
            System.out.println(a[i]+ " ");   
    }
    }
}
