import java.util.*;
public class ArrayAsArgument {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the 1D array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Size: "+ arr.length);
		
		arrArgument(arr);
		
		
		
	}
	public static void arrArgument(int []a)
	{
		int j,i;
		int b[]=new int[a.length];
		for(i=(a.length-1);i>=0;i--)
		{
		   for(j=0;j<a.length;j++)
		   
		   {
			b[j]=a[i];
		   }
		}
		for(int k: b) 
		{
		System.out.print(k+ " ");
		}
		
		
		}

}
