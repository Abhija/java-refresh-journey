package com.objectassignments.book;

public class Book {

	String title;
	String author;
	int price;
	String category;

	public Book(String title, String author, int price, String category) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	void checkBookType() {
		if (this.price > 500) {
			System.out.println("Premium books");
		} else {
			System.out.println("Standard book");
		}
	}

}
