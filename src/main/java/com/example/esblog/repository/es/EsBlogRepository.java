package com.example.esblog.repository.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.esblog.entity.es.EsBlog;

public interface EsBlogRepository extends  ElasticsearchRepository<EsBlog,Integer>{

}
