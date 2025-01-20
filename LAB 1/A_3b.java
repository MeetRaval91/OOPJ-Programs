import java.util.*;

public class A_3b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER : ");
        int b = sc.nextInt(); 
        int sum=a+b;
        System.out.println("SUM : "+sum);
        if(sum == 7)
        {
            System.out.println("THALA FOR A REASON");
        }
    }
}