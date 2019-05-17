package model;

public class Client {
private String username;
private String password;
private String name;
private String surname;
private String email;
private int phoneNumber;
private String address;
private long accountNumber;


public Client(String username, String password, String name, String surname, String email, int phoneNumber,
		String address, long accountNumber) {
	super();
	this.username = username;
	this.password = password;
	this.name = name;
	this.surname = surname;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.accountNumber = accountNumber;
}

public Client() {
	super();
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}


	
	
	
	
	
	
	
}
