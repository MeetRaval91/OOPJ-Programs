import java.util.*;

public class A_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER = ");
        int n = sc.nextInt();
        int rev = 0 ,temp=n;
        while( n!=0 )
        {
            rev = rev*10 + n%10;
            n = n/10;
        }
        if(temp==rev)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("2");
        }
    }
}