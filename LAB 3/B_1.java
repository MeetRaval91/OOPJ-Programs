import java.util.*;

public class A_5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any year : ");
		int a = sc.nextInt();
		if(a%4==0 && a%100!=0 || a%400==0)
		{
			System.out.println("Entered year is a leap year : ");
		}
		else
		{
			System.out.println("Entered year is not a leap year : ");
		}
		System.out.println(a);
    }
}