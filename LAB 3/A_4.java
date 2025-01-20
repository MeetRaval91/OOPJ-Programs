import java.util.*;

public class A_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int a = sc.nextInt();
		for( int i = 1 ; i<a ; i++)
        {
            if(a%i==0)
            {
                System.out.println("NUMBER IS NOT PRIME : "+a);
                break;
            }
        }
                System.out.println("NUMBER IS PRIME : "+a);
	}
}