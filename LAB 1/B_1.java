import java.util.Scanner;

public class B_1 {
   public B_1() {
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER LENGTH IN METERS : ");
      double m = sc.nextDouble();
      System.out.print("LENGTH IN FEET : ");
      System.out.print(m * 3.28);
   }

}