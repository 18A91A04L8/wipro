package com.jap.shortestword;

/* "Write a Java program to get the strings as input from the user and push them to an array.
 Find the shortest word in the list of Strings and output the same on screen.*/
public class ShortestWord {
    public static void main(String[] args) {
        // Input number of words in array using scanner
        int numberOfWords = 0;

        // Input array of words to be compared using scanner
        String[] words = new String[]{ };

        ShortestWord shortestWord = new ShortestWord();
        // Call the method and display shortest word in array of words
        System.out.println("Shortest word is " + shortestWord.findShortestWord(words));
    }

    // Function to find shortest word in array of words
    public String findShortestWord(String[] words) {
		String small=" ";
		if(words.length==0)
		 small="Cannot find shortest word as array is empty";
		else
		{
			int len=words[0].length();
		 small=words[0];
		 for(int i=1;i<words.length;i++)
		 {
			if(words[i].length()<len)
			{
				len=words[i].length();
				small=words[i];
			}
			 

		 }
        int k=1;
		} 
		 return small;
    }
}

