import java.util.*;

public class A_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER SIZE OF ARRAY : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0 ;i<size ;i++)
		{
			System.out.print("ENTER ELEMENT "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("ORIGINAL ARRAY : ");
		for(int i=0 ;i<size ;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("\nREVERSED ARRAY : ");
		for(int i=0 ;i<size ;i++)
		{
			System.out.print(arr[size-i-1]);
		}
	}
}