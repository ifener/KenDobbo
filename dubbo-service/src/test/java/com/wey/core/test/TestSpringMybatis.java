package com.wey.core.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wey.core.bean.Book;
import com.wey.core.dao.BookDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class TestSpringMybatis {

	@Autowired
	BookDao bookDao;
	
	@Test
	public void testFind(){
		Book findById = bookDao.findById("1000");
		System.out.println(findById.toString());
	}
}
