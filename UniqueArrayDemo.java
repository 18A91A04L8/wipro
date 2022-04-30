package com.jap.uniquearray;




public class UniqueArrayDemo {

    public static void main(String[] aa) {
	

        //declare and initialize integer Array in numberArray Variable

        int [] numberArray = {101,105,106,107,108,109};
		
		

        UniqueArrayDemo uniqueArrayDemo = new UniqueArrayDemo();
        boolean result = uniqueArrayDemo.getUniqueArrayElement(numberArray);
        System.out.println("Employee id duplication result: "+result);


    }


    public boolean getUniqueArrayElement(int numberArray[]){
		
		boolean result=false;
		for(int j=0;j<numberArray.length;j++)
		{
			for(int k=j+1;k<numberArray.length;++k)
			{
				if(numberArray[j]==numberArray[k])
				  return false;
			}
		}
		return true;
	}	

}