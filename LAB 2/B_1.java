import java.util.Scanner;

public class A_4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("ENTER TEMPERATURE IN FAHRENHEIT: ");
      float f = sc.nextFloat();
      float c = ((f-32)*5)/9;
      System.out.print("TEMPERATURE IN CELSIUS : ");
      System.out.print(c);
   }

}