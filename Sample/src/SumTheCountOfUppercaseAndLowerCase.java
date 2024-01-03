import java.util.*;
public class SumTheCountOfUppercaseAndLowerCase {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String str=sc.nextLine();
	int lower=0,upper=0;
	/*char charArray[]=str.toCharArray();*/
	for(int i=0;i<str.length();i++)
	{
		if(Character.isLowerCase(str.charAt(i)))
		{
			lower++;
		}
		else if(Character.isUpperCase(str.charAt(i)))
		{
			upper++;
		}
	}
	System.out.println("The sum of upper and lower cases is : "+(lower+upper));
	
	
	
}
}
