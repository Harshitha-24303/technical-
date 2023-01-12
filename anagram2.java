package prob;
import java.util.Arrays;
import java.util.Scanner;
public class eg {
     public static void main(String[] args)
     {
    	Scanner in=new Scanner(System.in); 
    	char[] str1=in.next().toCharArray();
    	char[] str2=in.next().toCharArray();
    	Arrays.sort(str1);
    	Arrays.sort(str2);
    	if (new String(str1).equals(new String(str2)))
    		System.out.println("Anagram");
    	else
    		System.out.println("Not Anagram");
    		
     }
}
