package com.jap.sortwords;

/* Write a Java program to sort all of the words in the list in alphabetical order and display */
public class SortWords {
    public static void main(String[] args) {
        String[] words = {"Rahul","Ajay","Gaurav","Suresh"};

        SortWords sortWords = new SortWords();
	
        // Call method to sort words alphabetically
        String[] sortedWords = sortWords.sort(words);
		for(int k=0;k<sortedWords.length;k++)
		{
			System.out.println(sortedWords[k]);
		}


        // Display the words after sorting alphabetically
    }

    // Function to sort words in an array in alphabetical order
    public String[] sort(String[] words) 
	{
		int len=words.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if((words[i].toLowerCase()).compareTo(words[j].toLowerCase())>0)
				{
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}

			}
		}
        return words;
    }
}
