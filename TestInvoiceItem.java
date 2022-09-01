package com.opps.pll;

import com.opps.bll.InvoiceItem;

public class TestInvoiceItem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InvoiceItem I1 = new InvoiceItem();
		InvoiceItem I2 = new InvoiceItem("001","This is mobile",2, 12000.0);
		System.out.println("Product ID :" +I2.getId());
		System.out.println("Product Description :" +I2.getDesc());
		
		I2.setQty(3);
		System.out.println("Quantity :" +I2.getQty());
		System.out.println("Unit Price :" +I2.getUnitPrice());
		I2.setUnitPrice(15000.0);
		System.out.println("Unit Price :" +I2.getUnitPrice());
		System.out.println("Total Price :" +I2.getTotal());
		System.out.println("-------------------------------");
		System.out.println(I2.toString());
		
	}

}
