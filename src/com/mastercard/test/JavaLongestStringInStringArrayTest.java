package com.mastercard.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.mastercard.JavaLongestStringInStringArray;

public class JavaLongestStringInStringArrayTest {
   String str= "The cow jumped over the moon";
		@Test
		public void testLongestWordLength() 
		{
			String result="jumped";
			assertEquals(result,JavaLongestStringInStringArray.longestWord(str));
		}
		
		@Test
		public void testLongestWord() 
		{
			int result=6;
            assertEquals(result,JavaLongestStringInStringArray.longestWordLength(str));
		}

		@Test
		public void testLongestWordNotEquals() {
			int result=7;
			assertNotEquals(result,JavaLongestStringInStringArray.longestWordLength(str));
			
		}
		

		@Test(expected=NullPointerException.class)
		public void testLongestWordWhenNull() {
			int result=0;
			assertNotEquals(result,JavaLongestStringInStringArray.longestWordLength(null));
			
		}
		
		@Test
		public void testLongestWordWhenEmptyString() {
			int result=0;
			assertEquals(result,JavaLongestStringInStringArray.longestWordLength(""));
			
		}
		
		@Test
		public void testLongestWordWithCaps() 
		{
			String result="JUMPED";
			assertNotEquals(result,JavaLongestStringInStringArray.longestWord(str));
		}
		
		@Test
		public void testLongestWordWithSpaces() 
		{
			String result="   jumped ";
			assertNotEquals(result,JavaLongestStringInStringArray.longestWord(str));
		}
		
		@Test
		public void testLongestWordWithAnotherLongestWord() 
		{
			String result="jumpedOnATree";
			assertNotEquals(result,JavaLongestStringInStringArray.longestWord(str));
		}
		
		
		
		
		
	}


