import java.util.*;

public class DEMO2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER = ");
        int n = sc.nextInt();
        int count = 0 ;
        while( n!=0 )
        {
            n = n/10;
            count++;
        }
        System.out.print("DIGITS = ");
        System.out.print(count);
    }
}