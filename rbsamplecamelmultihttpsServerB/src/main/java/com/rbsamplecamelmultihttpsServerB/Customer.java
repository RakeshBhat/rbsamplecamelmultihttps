package com.rbsamplecamelmultihttpsServerB;

public class Customer {

	String id;
	String name;
	String gender;
	String dob;
	String address;
	String lastSale;
	String rating;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLastSale() {
		return lastSale;
	}
	public void setLastSale(String lastSale) {
		this.lastSale = lastSale;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return String.format("Customer [id=%s, name=%s, gender=%s, dob=%s, address=%s, lastSale=%s, rating=%s]", id,
				name, gender, dob, address, lastSale, rating);
	}
	
	
	
}
