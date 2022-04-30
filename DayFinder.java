package com.jap.dayfinder;


public class DayFinder {
//The current day of week is taken in int (For Sunday 1, Monday 2, Tuesday 3....Saturday 7)
    public String predictDay(int currentDay, int noOfDaysFromToday)
    {
		if(noOfDaysFromToday<0)
		{
			noOfDaysFromToday=noOfDaysFromToday * (-1);
		}
		else{
			noOfDaysFromToday=noOfDaysFromToday * 1;
		}
		int num=0;
		String day=" ";

		int sum=currentDay+noOfDaysFromToday;
		if(sum>7)
		{
			num=sum-7;

		}
		else
		{
			num=sum;
		}
		if(num==1)
		{
			day="Sunday";
		}
		if(num==2)
		{
			day="Monday";
		}
		if(num==3)
		{
			day="Tuesday";
		}
		if(num==4)
		{
			day="Wednesday";
		}
		if(num==5)
		{
			day="Thursday";
		}
		if(num==6)
		{
			day="Friday";
		}
		if(num==7)
		{
			day="Saturday";
		}

       return day;
    }

    public static void main(String[] args){
        DayFinder dayFinder = new DayFinder();
        // Accept input of medicine taken day and the next dose to be taken in how many days
        int medicineTakenOn = 2;
        int daysToNextDose = 4;
		
		DayFinder df=new DayFinder();

        // call the method to predict the day the next dose must be taken
        String nextDoseToBeTakenOn = df.predictDay(medicineTakenOn,daysToNextDose);
        // display the day
        System.out.println("Your next dose should be taken on :  "+nextDoseToBeTakenOn);
    }

}