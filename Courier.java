package com.niit.courier;



import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Courier {
	private int courierOrderId;
	private CourierType courierType;
	private Address sender;
	private Address receiver;
	private float shipmentWeight;
    private String shipmentDimensions;
    public int getCourierOrderId() {
		return courierOrderId;
	}
	public void setCourierOrderId(int courierOrderId) {
		this.courierOrderId = courierOrderId;
	}
	public CourierType getCourierType() {
		return courierType;
	}
	public void setCourierType(CourierType courierType) {
		this.courierType = courierType;
	}
	public Address getSender() {
		return sender;
	}
	public void setSender(Address sender) {
		this.sender = sender;
	}
	public Address getReceiver() {
		return receiver;
	}
	public void setReceiver(Address receiver) {
		this.receiver = receiver;
	}
	public float getShipmentWeight() {
		return shipmentWeight;
	}
	public void setShipmentWeight(float shipmentWeight) {
		this.shipmentWeight = shipmentWeight;
	}
	public String getShipmentDimensions() {
		return shipmentDimensions;
	}
	public void setShipmentDimensions(String shipmentDimensions) {
		this.shipmentDimensions = shipmentDimensions;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Date getCourierReceiptDateTime() {
		return courierReceiptDateTime;
	}
	public void setCourierReceiptDateTime(Date courierReceiptDateTime) {
		this.courierReceiptDateTime = courierReceiptDateTime;
	}
	public String[] getCharges() {
		return charges;
	}
	PaymentMode paymentMode;
    Date courierReceiptDateTime;
	
   //Declare appropriate variables

    // Provide appropriate getters and setters


    // Parameterized constructor
    public Courier(int courierOrderId, CourierType courierType, Address sender, Address receiver, float shipmentWeight,
                   String shipmentDimensions, PaymentMode paymentMode, Date courierReceiptDateTime) {
        //Initialize values
    	this.courierOrderId = courierOrderId;
    	this.courierType = courierType;
    	this.sender = sender;
    	this.receiver = receiver;
    	this.shipmentWeight = shipmentWeight;
    	this.shipmentDimensions = shipmentDimensions;
    	this.paymentMode = paymentMode;
    	this.courierReceiptDateTime = courierReceiptDateTime;

    }
    //  final String to hold the courier charges from source city to destination city
    // do not change the values
    private final String charges[] = { "Chennai,Coimbatore,50", "Chennai,Trichy,50", "Chennai,Bangalore,100" };

    // calculate the cost of the courier depending on the weight and extract the cost from charges array
   
    
    // the calculateCost() method cannot be accessed outside the class, provide appropriate access specifiers
     private double calculateCost() {
    	 
        double costOfCourier = 0;
        
        if(sender.getCity().equals("Chennai")&&receiver.getCity().equals("Coimbatore"))
        	costOfCourier=50;
        if(sender.getCity().equals("Chennai")&&receiver.getCity().equals("Trirchy"))
        	costOfCourier=50;
        if(sender.getCity().equals("Chennai")&&receiver.getCity().equals("Bangalore"))
        	costOfCourier=100;
        
        return costOfCourier;
    }
     private double calculateCostWeight() {
    	 double c=calculateCost();
    	 return(c*shipmentWeight);
     }
     
    // generate a random number between 100000 and 900000 to be sent back as acknowledgement,
    // provide appropriate access specifiers since this method will not be used outside this class
    public String generateAcknowledgementNumber()
    {
    	Random rnd = new Random();
        int number = rnd.nextInt(900000);

        // this will convert any number sequence into 6 character.
        String rand= String.format("%06d", number);
        return ("ACK"+rand);
    }

    // return the acknowledgement number, if cost is = 0, then return a message 'no services to the area'
    public String acknowledgementGenerator() {
       return "";
    }

    // Display the details of the courier, cost of dispatch and acknowledgement number
    //
    public void displayCourierDetails() {
    	System.out.println(toString());
    }

    // Display courier details in desired format as below
//    Courier [charges=xxx, cost=xxx, courierOrderId=xxx, courierReceiptDateTime=xxx, courierType=xxx
//                ,paymentMode=xxx, receiver=xxx, sender=xxx,
//               shipmentDimensions=xxxx, shipmentWeight=xxx]

   @Override
    public String toString() {
	   
      return("Courier[charges="+sender.getCity()+"to"+receiver.getCity()+" "+calculateCost()+"cost="+calculateCostWeight()
      +" courier id="+courierOrderId+" Acknoweledgement id="+generateAcknowledgementNumber()
      +"courierReceiptDateTime="+courierReceiptDateTime+"courierType="+courierType+"PaymentMode="+paymentMode+"receiver="+receiver
      +"sender="+sender+"shipmentDimensions="+shipmentDimensions+"shipmentWeight="+shipmentWeight);
    }
}
