package com.news.mapper;

import com.news.entity.Nav;
import com.news.entity.NavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavMapper {
	
	List<Nav> getAllNav();
    int countByExample(NavExample example);

    int deleteByExample(NavExample example);

    int deleteByPrimaryKey(Integer navId);

    int insert(Nav record);

    int insertSelective(Nav record);

    List<Nav> selectByExample(NavExample example);

    Nav selectByPrimaryKey(Integer navId);

    int updateByExampleSelective(@Param("record") Nav record, @Param("example") NavExample example);

    int updateByExample(@Param("record") Nav record, @Param("example") NavExample example);

    int updateByPrimaryKeySelective(Nav record);

    int updateByPrimaryKey(Nav record);
}