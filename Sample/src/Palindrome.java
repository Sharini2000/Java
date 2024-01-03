/*Palindrome checking by using Stringbuilder class which has reverse(); method*/

import java.io.*;
import java.util.*;

public class Palindrome 
{

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        StringBuilder B = new StringBuilder(); //Assume string builder as a char array
        
        //System.out.println(“Enter a line to check wheather its palindrome”); 
        System.out.println("Enter a word to check whether its a palindome");
        String A=sc.next(); 
        
        B.append(A); /* appending A i.e copying A to B */
        B.reverse();
        
        String result = B.toString(); /* Converting StringBuilder to String */
        int k = A.compareTo(result);
        
        if (k==0)
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
        
    }
}




