package com.news.mapper;

import com.news.entity.Author;

public interface AuthorMapper {
	public void addAuthor(Author author);
	
	public Author getAuthorByUserId(String id);
	public void updateSubscribeCount(Integer count);
	void updateByPrimaryKeySelective(Author record);
    /*int countByExample(AuthorExample example);

    int deleteByExample(AuthorExample example);

    int deleteByPrimaryKey(String authorId);

    int insert(Author record);

    int insertSelective(Author record);

    List<Author> selectByExample(AuthorExample example);

    Author selectByPrimaryKey(String authorId);

    int updateByExampleSelective(@Param("record") Author record, @Param("example") AuthorExample example);

    int updateByExample(@Param("record") Author record, @Param("example") AuthorExample example);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);*/
}