package com.capg.room.beans;

public class RoomDetails {
  
  private String roomtype;
  private String status;
  
  
  public RoomDetails(String roomtype,String status) {
	  this.roomtype=roomtype;
	  this.status = status;
  }


public RoomDetails() {
	// TODO Auto-generated constructor stub
}


public String getRoomtype() {
	return roomtype;
}


public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}
  
  
}
