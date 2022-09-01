package com.opps.pll;

import com.opps.bll.Author;

public class TestAuthor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Author firstobj = new Author();
		Author secondobj = new Author("Yeswant","Yadaw");
		Author thirdobj = new Author("Dennis","Ritchie", "C Language");
		
		System.out.println("First Name : "+ secondobj.getFirstName());
		System.out.println("Last Name : "+ secondobj.getLastName());
		System.out.println("Book Name : "+ secondobj.getBookName());
		System.out.println("--------------------------------");
		//System.out.println(thirdobj);
		System.out.println("First Name : "+ thirdobj.getFirstName());
		System.out.println("Last Name : "+ thirdobj.getLastName());
		System.out.println("Book Name : "+ thirdobj.getBookName());
		
		System.out.println("--------------------------------");
		
		System.out.println("First Name : "+firstobj.getFirstName());
		System.out.println("Last Name : "+ firstobj.getLastName());
		System.out.println("Book Name : "+ firstobj.getBookName());
		
		Author A1 = new Author();
		//System.out.println(A1);
		Author A2; // This is reference
		//System.out.println(A2);
		A2 = secondobj;
		System.out.println("++++++++++++++++++++++++");
		System.out.println(A2);
	}
	

}
