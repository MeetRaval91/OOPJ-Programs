import java.util.*;

public class A_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER ANY NUMBER : ");
		double n = sc.nextDouble();
		if(n%2==0)
		{
			if(n==0)
			{
				System.out.println("Entered number is zero");
			}
			else
			{
				System.out.println("Entered number is even");
			}
		}
		else
		{
			System.out.println("Entered number is odd");
		}
	}
}