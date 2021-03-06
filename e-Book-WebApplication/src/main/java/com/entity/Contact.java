package com.entity;

public class Contact {
	private int contactId;
	private String firstName;
	private String lastName;
	private String email;
	private String comment;
	

	public Contact() {
		super();
		
	}

	public int getContactId() {
		return contactId;
	}


	public void setContactId(int contactId) {
		this.contactId = contactId;
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
		this.lastName= lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment= comment;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", comment=" + comment + "]";
	}

}
