import java.util.*;

public class A_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of inputs : ");
        int size = sc.nextInt();
        float [] arr = new float[size];
        for(int i=0 ;i<size ;i++)
        {
            System.out.print("Enter input "+(i+1)+" : ");
            arr[i] = sc.nextFloat();
        }
        sc.nextLine();
        System.out.print("Enter operation : ");
        String str = sc.nextLine();
        float add=0,mul=1,sub=0,div=1;
        if(str.charAt(0)=='a' || str.charAt(0)=='A')
        {
            for(int i=0 ;i<size ;i++)
            {
                add=arr[i]+add;
            }
            System.out.print("Addition of inputs : "+add);
        }
        if(str.charAt(0)=='m' || str.charAt(0)=='M')
        {
            for(int i=0 ;i<size ;i++)
            {
                mul=arr[i]*mul;
            }
            System.out.print("Multiplication of inputs : "+mul);
        }
        if(str.charAt(0)=='d' || str.charAt(0)=='D')
        {
            div = (arr[0]*arr[0]);
            for(int i=0 ;i<size ;i++)
            {
                div=div/arr[i];
            }
            System.out.print("Division of inputs : "+div);
        }
        if(str.charAt(0)=='s' || str.charAt(0)=='S')
        {
            sub = (2*arr[0]);
            for(int i=0 ;i<size ;i++)
            {
                sub=sub-arr[i];
            }
            System.out.print("Substration of inputs : "+sub);
        }
    }
}