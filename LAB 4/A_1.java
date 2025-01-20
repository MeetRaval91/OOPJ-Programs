import java.util.*;

public class A_1{
    public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		String str = sc.nextLine();
    		int vowel=0,consonant=0;
    		for(int i = 0 ; i<str.length() ; i++)
    		{
    			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.Character(i) == 'U')
    			{
    				vowel++;
    			}
    			else
    			{
    				consonant++;
    			}
    		}
    		System.out.println("Number of vowel : "+vowel);
    		System.out.println("Number of consonant : "+consonant);
    }
}