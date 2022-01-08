package com.example.demo.controller;

public class Employee {
	private String adress;
	
	private String gmail;
	public Employee() {
		super();
		
	}
	public Employee(String adress, String gmail) {
		super();
		this.adress = adress;
		this.gmail = gmail;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

}
