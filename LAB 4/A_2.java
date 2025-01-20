import java.util.*;

public class A_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println();
        for(int i=0 ;i<size ;i++)
        {
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int sum=0,avg=0;
        for(int i=0 ;i<size ;i++)
        {
            sum = arr[i]+sum;
        }
        avg = (sum/size);
        System.out.println("AVERAGE : "+avg);
    }
}