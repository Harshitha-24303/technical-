package example;
import java.util.*;
public class reverse {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]= new int[6];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0,j=n-1;i<n/2;i++,j--)
	{
	   a[i]=(a[i]+a[j])-(a[j]=a[i]);
	}
	for(int i=0;i<n;i++)
		System.out.println(a[i]+" ");
	}
	}


