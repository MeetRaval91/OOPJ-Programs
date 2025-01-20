import java.util.*;

public class A_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("OUT OF 100");
		System.out.print("Enter Mark(Maths) : ");
		float m1 = sc.nextFloat();
		System.out.print("Enter Mark(EG) : ");
		float m2 = sc.nextFloat();
		System.out.print("Enter Mark(OOPJ) : ");
		float m3 = sc.nextFloat();
		System.out.print("Enter Mark(WD) : ");
		float m4 = sc.nextFloat();
		System.out.print("Enter Mark(English) : ");
		float m5 = sc.nextFloat();
		float p = ((m1+m2+m3+m4+m5)/500)*100;
		System.out.print("STUDENT PERCENTAGE : "+p);	
		System.out.print("\n THEREFOR STUDENT GET : ");		
		if(p>=60)
		{
			System.out.println("FIRST DIVISION");
		}
		else if(p>=50 && p<=59)
		{
			System.out.println("SECOND DIVISION");
		}
		else if(p>=40 && p<=49)
		{
			System.out.println("THIRD DIVISION");
		}
		else if(p<40)
		{
			System.out.println("FAIL");
		}
	}
}