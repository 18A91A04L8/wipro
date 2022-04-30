package com.jap.areacalculator;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user
        int choice = scanner.nextInt();
		System.out.println("Enter side of square");
		
		double sq=scanner.nextDouble();
		System.out.println("Enter radius of circle");
		double ci=scanner.nextDouble();
		System.out.println("Enterlength of rectangle");
		double rel=scanner.nextDouble();
		System.out.println("Enter breadth of rectangle");
		double reb=scanner.nextDouble();
		AreaCalculator arc=new AreaCalculator();
		
		



        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it
		
		arc.calculateAreaOfFence(choice,sq,ci,rel,reb);
		

    }

    // Function to calculate area of fence by calling respective methods according to user's choice
    public void calculateAreaOfFence(int choice,double sq,double ci,double rel,double reb) {
		double result=0;
		if(choice==1){
			result=calculateAreaOfSquare(sq);
		}
		if(choice==2){
			result=calculateAreaOfCircle(ci);
		}
		if(choice==3){
			result=calculateAreaOfRectangle(rel,reb);
		}
		else
		 System.out.println("invalid input");

		System.out.println("Area for fence for chickens: "+result);

		
		

    }

    // Function to calculate area of square
    public  double calculateAreaOfSquare(double side) {
		double area=side*side;
        return area;
    }

    // Function to calculate area of circle
    public  double calculateAreaOfCircle(double radius) {
		double area=3.14*radius*radius;
        return area;
    }

    // Function to calculate area of rectangle
    public  double calculateAreaOfRectangle(double length, double breadth) {
		double area=length*breadth;
        return area;
    }
}
