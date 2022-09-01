package com.opps.bll;

public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	//Defoult constructor
	public InvoiceItem(){
		
	}
	public InvoiceItem(String id, String desc, int qty, double unitPrice ){
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getId() {
		return id;
	}
	public String getDesc() {
		return desc;
	}
	public double getTotal(){
		return unitPrice*qty;
	}
	@Override
	public String toString(){
		return " ID : "+ id + "\n Description :"+desc + "\n Quantity : "+ qty + "\n Unit Price :"+ unitPrice;
	}
}

