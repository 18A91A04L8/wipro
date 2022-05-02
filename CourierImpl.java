package com.niit.courier;
import java.util.Date;

import java.time.LocalDateTime;

public class CourierImpl {
    public static void main(String[] args) {
        // Declare and Initialize Address and courier objects to test your code
    	Courier courier1,courier2;
    	courier1=new Courier(101,CourierType.DOMESTIC,new Address("satya",23,"chowk","Chennai","9040106323"),new Address("satyajit",23,"chhaka","Coimbatore","9040106326"),200,"10X10",PaymentMode.CASH,new Date());
    	courier2=new Courier(102,CourierType.DOMESTIC,new Address("sat",23,"chowk","Chennai","9040106323"),new Address("ajit",23,"chhaka","Trirchy","9040106326"),100,"10X10",PaymentMode.CASH,new Date());
        // give desired values
        // call the displayCourierDetails() method to display the details of the courier
    	courier1.displayCourierDetails();
    	courier2.displayCourierDetails();
    	Address add=new Address("satya",23,"chowk","Chennai","9040106323");

       
}
}