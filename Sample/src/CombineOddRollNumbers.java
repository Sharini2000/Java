import java.util.*;
public class CombineOddRollNumbers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String result="";
		String temp=null;
		System.out.println("Enter the number of students: ");
		int n=sc.nextInt();
		System.out.println("Enter the roll number of students: ");
		int roll[]=new int[n];
		for(int i=0;i<n;i++)
		{
			roll[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if((roll[i]%2)!=0)
			{
				temp=Integer.toString(roll[i]);
				result=result + temp.concat(" ");
			}
		}
		System.out.println(result);
		
	}

}
