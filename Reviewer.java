package com.cs623.paper_review;

public class Reviewer {

	int paper_id;
	String reviewer_emailaddress;
	String author_emailaddress;
	String firstname;
	String authorfeedback;
	String lastname;
	String committeefeedback;
	double phonenumber;
	String affiliation;
	public int getPaper_id() {
		return paper_id;
	}
	public void setPaper_id(int paper_id) {
		this.paper_id = paper_id;
	}
	public String getReviewer_emailaddress() {
		return reviewer_emailaddress;
	}
	public void setReviewer_emailaddress(String reviewer_emailaddress) {
		this.reviewer_emailaddress = reviewer_emailaddress;
	}
	public String getAuthor_emailaddress() {
		return author_emailaddress;
	}
	public void setAuthor_emailaddress(String author_emailaddress) {
		this.author_emailaddress = author_emailaddress;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getAuthorfeedback() {
		return authorfeedback;
	}
	public void setAuthorfeedback(String authorfeedback) {
		this.authorfeedback = authorfeedback;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCommitteefeedback() {
		return committeefeedback;
	}
	public void setCommitteefeedback(String committeefeedback) {
		this.committeefeedback = committeefeedback;
	}
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAffiliation() {
		return affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	public Reviewer(int paper_id, String reviewer_emailaddress, String author_emailaddress, String firstname,
			String authorfeedback, String lastname, String committeefeedback, double phonenumber, String affiliation) {
		super();
		this.paper_id = paper_id;
		this.reviewer_emailaddress = reviewer_emailaddress;
		this.author_emailaddress = author_emailaddress;
		this.firstname = firstname;
		this.authorfeedback = authorfeedback;
		this.lastname = lastname;
		this.committeefeedback = committeefeedback;
		this.phonenumber = phonenumber;
		this.affiliation = affiliation;
	}
	
	
}
