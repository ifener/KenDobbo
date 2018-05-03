package com.wey.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wey.core.bean.Book;
import com.wey.core.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/index.html")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/dubbo.html")
	public String dubbo(Model model,@RequestParam String id) {
		Book book  = bookService.findById(id);
		model.addAttribute("book", book);
		return "dubbo";
	}
}
