import java.util.*;
public class CaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		char chararr[] = new char[str.length()];
		String lowercasestr = str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')// using this if statement to just ignore space and check for odd or even only with letters
			{
				chararr[i]=' ';
			}
			else
			{
				if((i+1)%2==0) {
					chararr[i] = Character.toLowerCase(str.charAt(i));
				}
				else 
				{
					chararr[i] = Character.toUpperCase(str.charAt(i));
				}
			}
		}
		String k = new String(chararr);//converting char array to string
		// String k = String.valueOf(chararr); --> another way to convert char array to string
		System.out.println(k);

	}

}
