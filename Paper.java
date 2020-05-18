package com.cs623.paper_review;

public class Paper {
	int paper_id;
    String author_emailaddress;
    String title;
    String paper_abstract;
    String filename;
    
	public Paper(int paper_id, String author_emailaddress, String title, String paper_abstract, String filename) {
		super();
		this.paper_id = paper_id;
		this.author_emailaddress = author_emailaddress;
		this.title = title;
		this.paper_abstract = paper_abstract;
		this.filename = filename;
	}

	public int getPaper_id() {
		return paper_id;
	}

	public void setPaper_id(int paper_id) {
		this.paper_id = paper_id;
	}

	public String getAuthor_emailaddress() {
		return author_emailaddress;
	}

	public void setAuthor_emailaddress(String author_emailaddress) {
		this.author_emailaddress = author_emailaddress;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPaper_abstract() {
		return paper_abstract;
	}

	public void setPaper_abstract(String paper_abstract) {
		this.paper_abstract = paper_abstract;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
    
    

}
