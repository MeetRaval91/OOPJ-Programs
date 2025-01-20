import java.util.*;

public class DEMO3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER = ");
        int num = sc.nextInt();
        int digit,sum=0;
        int og=num;
        while (num > 0) {
        digit = num % 10;
        sum += digit * digit * digit;
        num /= 10;
    }
    if (sum == og) {
        System.out.println("Armstrong number.\n");
    } else {
        System.out.println("Not an Armstrong number.\n");
 }
}
}