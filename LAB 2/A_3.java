import java.util.Scanner;

public class A_3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("ENTER LENGTH : ");
      double l = sc.nextDouble();
      System.out.print("ENTER BREADTH : ");
      double b = sc.nextDouble();
      double a = l * b;
      System.out.print("AREA OF RECTANGLE : ");
      System.out.print(a);
   }

}