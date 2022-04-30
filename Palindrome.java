package com.jap.palindrome;

/* Write a java program to find if any of the words in the list is a palindrome or not, print their count and the palindrome words.*/
public class Palindrome {
    public static void main(String[] args) {
        String[] words = {};
        Palindrome palindrome = new Palindrome();

        // Call method to find palindromes in array of words
        System.out.println("Total number of palindromes: " + palindrome.findPalindromeWords(words));
    }

    // Function to find palindromes in an array of words
    public int findPalindromeWords(String[] words) {
		if(words.length==0)
		   return 0;
		   int count=0;
		   for(int i=0;i<words.length;i++)
		   {
			   String original=words[i];
			   String reverse="";
			   int len=original.length();
			   for(int j=len-1;j>=0;--j)
			   {
				   reverse=reverse+original.charAt(j);
			   }
			   if(original.equals(reverse)){
				   System.out.println(original+" is a palindrome");
				   count+=1;
			   }

		   }
        return count;
    }
}
