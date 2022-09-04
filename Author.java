package com.opps.bll;
public class Author {
	public String firstName;
	public String lastName;
	public String bookName;
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author (String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public Author (String firstName, String lastName, String bookName){
		this.firstName=firstName;
		this.lastName=lastName;
		this.bookName=bookName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString(){
		return " Author First Name : " + firstName + "\n Author Last Name : "+ lastName +"\n Book Name : "+ bookName;
	}
}
