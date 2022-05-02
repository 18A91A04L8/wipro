package com.niit.courier;




import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
	private String name;
	private int houseNo;
	private String street;
	private String city;
	private String phoneNo;
    // Declare the attributes that correspond to Address



    // This methods takes a phone no as a string and validates the phone number
    // The phone no must be in the format below
    //  +<area code><10 digit numbers> - +919776855678
    // or a 10 digit number - 9776855678

    public int isPhoneNoValid(String phone)
    {
    	Pattern ptrn=Pattern.compile("^(\\+91[\\-\\s]?)?[9]?(91)?[789]\\d{9}$");
    	Matcher match=ptrn.matcher(phone);
    	if(match.find()&&match.group().equals(phone))
            return 1;
    	else
    		return 0;
		
    }

    // Setter and getter methods

    public String getName() {
        return name;
    }
    public int getHouseNo() {
        return houseNo;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    // setPhoneNo in the class, the phone number cannot be modified outside the class
    void setPhoneNo(String phoneNo) {
    	this.phoneNo=phoneNo;

    }

    // The method must return the address in the below format
   // Address [city=xxx,houseNo=xxx,name=xxx,phoneNo=xxx,street=xxx]
    public String toString()
    {
    	return("Address[city="+city+",houseNo="+houseNo+",name="+name+",phoneNo="+phoneNo+",street="+street);
    }


    // Parameterized constructor
    public Address(String name, int houseNo, String street, String city, String phoneNo) {
    	this.name=name;
    	this.houseNo=houseNo;
    	this.street=street;
    	this.city=city;
    	this.phoneNo=phoneNo;
    	
        // Initialize values here
    }

    
}
