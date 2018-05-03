package com.wey.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoaderListener;

import com.wey.core.bean.Book;
import com.wey.core.dao.BookDao;
import com.wey.core.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;
	
	@Override
	public Book findById(String id) {
		return bookDao.findById(id);
	}

}
