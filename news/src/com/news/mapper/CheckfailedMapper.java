package com.news.mapper;

import com.news.entity.Checkfailed;
import com.news.entity.CheckfailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckfailedMapper {
	Checkfailed getReason(String newsid);
    int countByExample(CheckfailedExample example);

    int deleteByExample(CheckfailedExample example);

    int deleteByPrimaryKey(Integer chfId);

    int insert(Checkfailed record);

    int insertSelective(Checkfailed record);

    List<Checkfailed> selectByExample(CheckfailedExample example);

    Checkfailed selectByPrimaryKey(Integer chfId);

    int updateByExampleSelective(@Param("record") Checkfailed record, @Param("example") CheckfailedExample example);

    int updateByExample(@Param("record") Checkfailed record, @Param("example") CheckfailedExample example);

    int updateByPrimaryKeySelective(Checkfailed record);

    int updateByPrimaryKey(Checkfailed record);
}