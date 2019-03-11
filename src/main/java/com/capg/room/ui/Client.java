package com.capg.room.ui;

import java.util.Scanner;

import com.capg.room.beans.CustomerDetails;
import com.capg.room.beans.RoomDetails;
import com.capg.room.service.RoomService;
import com.capg.room.service.RoomServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   CustomerDetails customerDetails = new CustomerDetails();
   RoomDetails rd = new RoomDetails();
   RoomService rs = new RoomServiceImpl();
   do {
   System.out.println("enter the choice");
   System.out.println("1.Booking a room");
   System.out.println("2.View the status");
   System.out.println("3.Exit");
    int ch = sc.nextInt();
    switch(ch) {
    case 1 :
    	System.out.println("enter customer name");
    	customerDetails.setCustname(sc.next());
    	System.out.println("enter email");
    	customerDetails.setEmail(sc.next());
    	System.out.println("enter customer address");
    	customerDetails.setCustadd(sc.next());
    	System.out.println("enter mobilenum");
    	customerDetails.setMobileno(sc.nextLong());
    	System.out.println("roomno");
    	customerDetails.setRoomno(sc.nextInt());
    	
    	System.out.println("enter room type");
    	customerDetails.setRoomtype(sc.next());
    	
    	int newCustomerId = rs.bookingRoom(customerDetails);
    	System.out.println("YourRoom succesfully booked  "+newCustomerId);
    	break;
    	
    	
    case 2 :
    	
    	System.out.println("enter cust id");
    	int customerId = sc.nextInt();
    	customerDetails = rs.getCustomerDetails(customerId);
    	if(customerDetails!=null) {
    	System.out.println("name of the customer:"+customerDetails.getCustname());
    	System.out.println("booking status:Booked");
    	System.out.println("roomno:"+customerDetails.getRoomno());
    	System.out.println("room type:"+customerDetails.getRoomtype());
    	}
    	
    	
    	
    case 3 :
    	System.exit(0);
    	break;
    	
    	
    }
   
	}while(true);
	}
	}


