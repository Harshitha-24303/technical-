package example;
import java.util.*;
public class linear {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[9];
		System.out.println("Enter the array elements5");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int x;
		System.out.println("Enter the search key");
		x=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		if(a[i]==x)
		{ 
			System.out.println("Element found at location"+" "+i);
			flag=1;
			//break;
		}
		}
		if(flag==0)
		{
			System.out.println("Element not found");
		}
	}

}
