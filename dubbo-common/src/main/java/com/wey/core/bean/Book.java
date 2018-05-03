package com.wey.core.bean;

public class Book implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	String bookId;
	String bookName;
	Integer number;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "TestBean [bookId=" + bookId + ", bookName=" + bookName + ", number=" + number + "]";
	}
}
