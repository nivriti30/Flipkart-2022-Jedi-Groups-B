package com.flipkart.bean;

public class PaymentBill {
	private String paymentType;
	private double amount ;
	private String transID ;
	public PaymentBill(String paymentType, double amount, String transID) {
		super();
		this.paymentType = paymentType;
		this.amount = amount;
		this.transID = transID;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransID() {
		return transID;
	}
	public void setTransID(String transID) {
		this.transID = transID;
	}
	
}
