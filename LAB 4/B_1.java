import java.util.*;

public class A_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        System.out.print("Length of string : "+str.length()+"\n");
        int i=str.length();
        for(int j =i/2 ;j<i ;j++)
        {
            System.out.print(str.charAt(j));
        }
    }
}