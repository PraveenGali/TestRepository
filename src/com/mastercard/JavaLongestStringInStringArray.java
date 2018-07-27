package com.mastercard;
import java.lang.*;

public class JavaLongestStringInStringArray 

{
		
	// A Driver method which will call the longestword and longestwordlenght method
	// to retrieve the longestword and longest length appropriately.
	public static void main(String args[])
		{
	        String str="The cow jumped over the moon";
	        System.out.println("The Longest Word length is " + longestWordLength(str));
	        System.out.println("The Longest word is " + longestWord(str));
		
		}
		
		public static String longestWord(String str)
		{
			String longestString=null;
		    String[] words = str.split(" ");
		    int maxLength = 0;
		
			for(String word:words)
			{
				if(word.length()>maxLength)
				{
					maxLength = word.length();
					longestString= word;
		        }
		    }
		return longestString;
		
		}
		
       public static int longestWordLength(String str)
       {
			String[] words = str.split(" ");
			int length = 0;
			for(String word:words)
			{
				if(length < word.length())
				{
				    length = word.length();
			
			    }
			}
			
			return length;
		
       }	

}
