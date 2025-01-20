import java.util.*;

public class A_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three distinct number");
		System.out.print("Enter first number : ");
		double a = sc.nextDouble();
		System.out.print("Enter second number : ");
		double b = sc.nextDouble();
		System.out.print("Enter third number : ");
		double c = sc.nextDouble();
		double max = 0;
		if(a==b || a==c || b==c)
		{
			System.out.println("You have entered two or more same numbers");
		}
		else
		{
			max = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		}
		System.out.println("LARGEST NUMBER : "+max);
	}
}