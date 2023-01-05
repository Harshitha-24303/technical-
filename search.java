import java.util.*;
public class linear2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arrSize=sc.nextInt();
		String[] namelist = new String[arrSize];
		namelist[0]=sc.nextLine();
		for(int i=0;i<arrSize;i++)
		{
			namelist[i]=sc.nextLine();
		}
		System.out.print("Name to be searched"+" ");
		String searchName=sc.nextLine();
		for(int i=0;i<arrSize;i++)
		{
			if(namelist[i].equals(searchName))
			{
			System.out.println("Found @ "+i);
			System.exit(0);
		}}
		System.out.println("Not Found");


}}