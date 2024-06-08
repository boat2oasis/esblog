package com.example.esblog.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.esblog.entity.es.EsBlog;
import com.example.esblog.entity.mysql.MysqlBlog;
import com.example.esblog.repository.es.EsBlogRepository;
import com.example.esblog.repository.mysql.MysqlBlogRepository;


@Controller
public class IndexController {
	
	@Autowired
	MysqlBlogRepository  mysqlBlogRepository;
	
	@Autowired
	EsBlogRepository esBlogRepository;
	
	
	@RequestMapping("/")
	public String index() {
		List<MysqlBlog> list =   mysqlBlogRepository.findAll();
		Iterable<EsBlog>  all = esBlogRepository.findAll();
		System.out.println(all.iterator().next());
		System.out.println(list.size());
		return "index.html";
	}
}


