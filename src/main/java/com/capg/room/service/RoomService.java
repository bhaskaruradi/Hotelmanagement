package com.capg.room.service;

import com.capg.room.beans.CustomerDetails;
import com.capg.room.beans.RoomDetails;

public interface RoomService {
	 int bookingRoom(CustomerDetails customer);
	 CustomerDetails getCustomerDetails(int customerId);
}
