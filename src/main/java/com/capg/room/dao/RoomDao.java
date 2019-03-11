package com.capg.room.dao;

import com.capg.room.beans.CustomerDetails;
import com.capg.room.beans.RoomDetails;

public interface RoomDao {
 int bookingRoom(CustomerDetails customer);
     CustomerDetails getCustomerDetails(int customerId);
     
}
