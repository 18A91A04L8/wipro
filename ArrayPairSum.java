package com.jap.replaceinteger;

public class ArrayPairSum {

    public static void main(String[] aa) {

        //Declare and initialize integer array in the variable numberArray
        int[] numberArray=null;
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);
        //write forEach loop to iterate through the 'sumArray' to print the output
		for(int i:sumArray)
		{
			System.out.println(sumArray[i]);
		}



    }

    public int[] sumOfArrayPair(int numberArray[]){
		int len=numberArray.length;
		if(len%2==0)
		{
			int newArray[]=new int[len/2];
			int K=0;
			for(int i=0;i<len;i=i+2)
			{
				if(i!=(len-1))
				{
					int element=numberArray[i]+numberArray[i+1];
					newArray[K++]=element;
				}
				else
				{
					newArray[K++]=numberArray[len-1];
				}
			}
			return newArray;
		}
		else
		{
			int newArray[]=new int[(len/2)+1];
			int K=0;
			for(int i=0;i<len;i=i+2)
			{
				if(i!=(len-1))
				{
					int element=numberArray[i]+numberArray[i+1];
					newArray[K++]=element;
				}
				else
				{
					newArray[K++]=numberArray[len-1];
				}
			}
			return newArray;
		}
    }

}
