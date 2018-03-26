package com.news.mapper;

import com.news.entity.Checkpass;
import com.news.entity.CheckpassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckpassMapper {
    int countByExample(CheckpassExample example);

    int deleteByExample(CheckpassExample example);

    int deleteByPrimaryKey(Integer chpId);

    int insert(Checkpass record);

    int insertSelective(Checkpass record);

    List<Checkpass> selectByExample(CheckpassExample example);

    Checkpass selectByPrimaryKey(Integer chpId);

    int updateByExampleSelective(@Param("record") Checkpass record, @Param("example") CheckpassExample example);

    int updateByExample(@Param("record") Checkpass record, @Param("example") CheckpassExample example);

    int updateByPrimaryKeySelective(Checkpass record);

    int updateByPrimaryKey(Checkpass record);
}