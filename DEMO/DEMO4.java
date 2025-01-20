import java.util.*;

public class DEMO4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER PRINCIPLE = ");
        float p = sc.nextFloat();
        System.out.print("ENTER RATE OF INTEREST = ");
        float i = sc.nextFloat();
        System.out.print("ENTER ANY TIME = ");
        float t = sc.nextFloat();
        float s = (p*i*t)/100 ;
        System.out.print("SIMPLE INTEREST = ");
        System.out.print(s);
    }
}