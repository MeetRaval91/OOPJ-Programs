import java.util.*;

public class A_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        for(int a = 0; a < str.length() ; a++ )
        {
            for(int b = 0 ; b <= a ; b++)
            {
                System.out.print(str.charAt(b)+" ");
            }
            System.out.print("\n");
        }
    }
}