package com.wey.core.dao;

import com.wey.core.bean.Book;

public interface BookDao {
	public Book findById(String id);
}
