package com.weekendr.events;

public class Event {
public String name;
public String User_Id;
public String society_Id;
public String Event_type;
public double time;
public String Venue;
public String Status;
public String Event_Description;
protected String getName() {
	return name;
}
protected void setName(String name) {
	this.name = name;
}
protected String getUser_Id() {
	return User_Id;
}
protected void setUser_Id(String user_Id) {
	User_Id = user_Id;
}
protected String getSociety_Id() {
	return society_Id;
}
protected void setSociety_Id(String society_Id) {
	this.society_Id = society_Id;
}
protected String getEvent_type() {
	return Event_type;
}
protected void setEvent_type(String event_type) {
	Event_type = event_type;
}
protected double getTime() {
	return time;
}
protected void setTime(double time) {
	this.time = time;
}
protected String getVenue() {
	return Venue;
}
protected void setVenue(String venue) {
	Venue = venue;
}
protected String getStatus() {
	return Status;
}
protected void setStatus(String status) {
	Status = status;
}
protected String getEvent_Description() {
	return Event_Description;
}
protected void setEvent_Description(String event_Description) {
	Event_Description = event_Description;
}

}
