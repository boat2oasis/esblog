package com.example.esblog;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.esblog.entity.es.EsBlog;
import com.example.esblog.repository.es.EsBlogRepository;

@SpringBootTest
class EsblogApplicationTests {
	@Autowired
	EsBlogRepository esBlogRepository;
    @Test
    void contextLoads() {
    	Iterable<EsBlog>  all = esBlogRepository.findAll();
    	System.out.println(all.iterator().next());
    	System.out.println("Hello world");
    }

}
