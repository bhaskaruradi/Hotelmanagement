package com.capg.room.service;

import com.capg.room.beans.CustomerDetails;
import com.capg.room.beans.RoomDetails;
import com.capg.room.dao.RoomDao;
import com.capg.room.dao.RoomDaoImpl;

public class RoomServiceImpl implements RoomService {
RoomDao r = new RoomDaoImpl();
	public int bookingRoom(CustomerDetails customer) {
		
		return r.bookingRoom(customer);
	}
	public CustomerDetails getCustomerDetails(int customerId) {
		// TODO Auto-generated method stub
		return r.getCustomerDetails(customerId);
	}

	
       
}
