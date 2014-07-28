package com.weekendr.vehicle;

public class Vehicle {
protected String Name;
protected String user_Id;
protected String Vehicle_Id;
protected Boolean Status;
protected String House_No;
protected String society_Id;
protected String getName() {
	return Name;
}
protected void setName(String name) {
	Name = name;
}
protected String getUser_Id() {
	return user_Id;
}
protected void setUser_Id(String user_Id) {
	this.user_Id = user_Id;
}
protected String getVehicle_Id() {
	return Vehicle_Id;
}
protected void setVehicle_Id(String vehicle_Id) {
	Vehicle_Id = vehicle_Id;
}
protected Boolean getStatus() {
	return Status;
}
protected void setStatus(Boolean status) {
	Status = status;
}
protected String getHouse_No() {
	return House_No;
}
protected void setHouse_No(String house_No) {
	House_No = house_No;
}
protected String getSociety_Id() {
	return society_Id;
}
protected void setSociety_Id(String society_Id) {
	this.society_Id = society_Id;
}



}
