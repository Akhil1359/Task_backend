package com.reach.bookStore;

public class Books {
	private String title;
	private String author;
	private int price;
	private String published;
	public Books()
	{}
	
	public Books(String title, String author, int price, String published) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.published = published;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	

}
