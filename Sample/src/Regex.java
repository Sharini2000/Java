import java.util.Scanner;
import java.util.regex.*;


public class Regex {

	public static void main(String[] args) {
	count();
	cap();
		

	}
	static void count()
	{
		String str = "This is a method to find, print and count the word and its repetition in this sentence";
		Pattern p = Pattern.compile("method");
		Matcher m = p.matcher(str);
		int count=0;
		while(m.find())
		{
			count++;
			System.out.println("The word method is found and it starts at "+ m.start()+ " and ends at "+m.end()+" position in the given string");
		}
		System.out.println("The count of word 'Method' in the string is " + count);
	}
	static void cap()
	{
		String str = "This is a method to check if given word is not present in sentence using ^ symbol";
		Pattern p = Pattern.compile("method");
		Matcher m = p.matcher(str);
		if(m.find())
		{
			System.out.println("The sentence have word method");
			
		}
		else
			System.out.println("The sentence does not have word method");
	}

}
