package com.capg.room.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.room.beans.CustomerDetails;
import com.capg.room.beans.RoomDetails;

public class RoomDaoImpl implements RoomDao {
	 Map<Integer,RoomDetails> custentry=new HashMap<Integer, RoomDetails>();
     Map<Integer,CustomerDetails> cust = new HashMap<Integer,CustomerDetails>();
	Integer custid = 1000;
	RoomDetails rd = new RoomDetails();
	CustomerDetails cd = new CustomerDetails();
    
     public RoomDaoImpl() {
    	 custentry = new HashMap<Integer, RoomDetails>();
    	 custentry.put(101, new RoomDetails("AC_SINGLE","not booked"));
    	 custentry.put(102, new RoomDetails("AC_SINGLE","not booked"));
    	 custentry.put(103, new RoomDetails("AC_DOUBLE","not booked"));
    	 custentry.put(201, new RoomDetails("NONAC_SINGLE","not booked"));
    	 custentry.put(202, new RoomDetails("NONAC_SINGLE","not booked"));
    	 custentry.put(203, new RoomDetails("NONAC_DOUBLE","not booked")); 
     }

	public int bookingRoom(CustomerDetails customer) {
		
		if(custentry.containsKey(customer.getRoomno())) {
			rd = custentry.get(customer.getRoomno());
			if(rd.getStatus().equals("not booked")) {
				if(rd.getRoomtype().equals(customer.getRoomtype())) {
				cust.put(custid, new CustomerDetails(customer.getCustname(),customer.getEmail(),customer.getCustadd(),customer.getMobileno(),customer.getRoomno(),customer.getRoomtype()));
				custentry.replace(customer.getRoomno(),new RoomDetails(customer.getRoomtype(),"booked"));
				custid++;
				
			}	
			else return 1;
			}
			else return 0;
		}
		else
		{
		return -1;
		}
		
		
		
		return custid-1;
	}

	public CustomerDetails getCustomerDetails(int customerId) {
		if(cust.containsKey(customerId)) {
			cd = cust.get(customerId);
			return cd;
		}
		
		else {
			return null;
		}
	}

	}

	

