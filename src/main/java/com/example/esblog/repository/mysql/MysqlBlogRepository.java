package com.example.esblog.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.esblog.entity.mysql.MysqlBlog;

public interface MysqlBlogRepository extends JpaRepository<MysqlBlog, Integer> {

}
