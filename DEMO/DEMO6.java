import java.util.*;

public class DEMO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter half of height of diamond : ");
        int n = sc.nextInt();
        System.out.println();
        for(int i=0 ;i<n ;i++)
        {
            for(int j=0 ;j<i+1 ;j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<n-i;j++ )
            {
                System.out.print("* ");


                
            }
            System.out.println();
        }
        for(int i=0 ;i<n ;i++)
        {
            for(int j=0 ;j<n-i ;j++)
            {
                System.out.print(" ");
            }
            for(int j=0 ;j<i+1 ;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}