package com.capg.room.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.room.beans.CustomerDetails;

class RoomDaoImplTest {

	
	static RoomDaoImpl RoomDao;
	
	
	@BeforeAll
	public static void init() {
		RoomDao = new RoomDaoImpl();
	}
	@Test
	void testbooking() {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setCustname("bhaskar");
		customerDetails.setEmail("bhas@");
		customerDetails.setCustadd("chil");
		customerDetails.setMobileno(994876);
		customerDetails.setRoomno(101);
		customerDetails.setRoomtype("AC_SINGLE");
		
		assertEquals(1000, RoomDao.bookingRoom(customerDetails));
	}
	
	@Test
	void testgetCustomer() {
		assertEquals(null,RoomDao.getCustomerDetails(1002));
	}

}
