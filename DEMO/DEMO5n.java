import java.util.*;

public class DEMO5n{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY ONE = ");
        int a = sc.nextInt();
        System.out.print("ENTER ANY TWO = ");
        int b = sc.nextInt();
        System.out.println("BEFORE SWAPPING");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("AFTER SWAPPING");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}