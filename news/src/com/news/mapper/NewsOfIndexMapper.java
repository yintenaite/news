package com.news.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.news.entity.NewsOfIndex;

public interface NewsOfIndexMapper {
	//查询主页所有新闻
	public List<NewsOfIndex> showAllNews(@Param("category") String nav)throws Exception;
	public List<NewsOfIndex> search(String q);
	public List<NewsOfIndex> getNewsOfCollection(String id);
	public List<NewsOfIndex> getFastNews();
	public List<NewsOfIndex> getNewsOfAuthor(String authorId);
	public List<NewsOfIndex> getNewsOfAuthoring(String authorId);
	public List<NewsOfIndex> getNewsOfAuthorno(String authorId);
	
}
