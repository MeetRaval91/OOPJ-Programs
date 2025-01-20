import java.util.Scanner;

public class A_5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number one: ");
      int a = sc.nextInt();
      System.out.print("Enter number two  : ");
      int b = sc.nextInt();
      System.out.print("Enter number three : ");
      int c = sc.nextInt();
      if(a>b)
      {
         if(a>c)
         {
            System.out.print("NUMBER IS LARGEST : "+a);
         }
         else
         {
            System.out.print("NUMBER IS LARGEST : "+c);
         }
      }
      if(b>c)
      {
         if(b>c)
         {
            System.out.print("NUMBER IS LARGEST : "+b);
         }
         else
         {
            System.out.print("NUMBER IS LARGEST : "+c);
         }
      }
   }

}