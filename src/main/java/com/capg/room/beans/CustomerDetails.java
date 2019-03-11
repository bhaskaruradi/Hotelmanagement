package com.capg.room.beans;

public class CustomerDetails {
  private String custname;
  private String email;
  private  String custadd;
  private long mobileno;
  private String roomtype;
  private int roomno;
  private int cusid;
  private int status;
  
  public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getCusid() {
	return cusid;
}
public void setCusid(int cusid) {
	this.cusid = cusid;
}
public CustomerDetails(String custname,String email,String custadd,long mobileno,int roomno,String roomtype) {
	  this.custname= custname;
	  this.email= email;
	  this.custadd = custadd;
	  this.mobileno = mobileno;
	  this.roomtype = roomtype;
	  this.roomno = roomno;
  }
public CustomerDetails() {
	// TODO Auto-generated constructor stub
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCustadd() {
	return custadd;
}
public void setCustadd(String custadd) {
	this.custadd = custadd;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getRoomtype() {
	return roomtype;
}
public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}
public int getRoomno() {
	return roomno;
}
public void setRoomno(int roomno) {
	this.roomno = roomno;
}
public void setStatus(String status) {
	// TODO Auto-generated method stub
	
}

  
  
  
  
}
