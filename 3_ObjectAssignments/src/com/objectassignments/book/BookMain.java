package com.objectassignments.book;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("Ikigai", "F&H", 500, "Self Help");
		book1.checkBookType();
		Book book2 = new Book("Ikigai2", "F&H2", 1500, "Self Help");
		book2.checkBookType();
	}
}
