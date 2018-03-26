package com.news.mapper;

import com.news.entity.New;
import com.news.entity.NewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewMapper {
    int countByExample(NewExample example);

    int deleteByExample(NewExample example);

    int deleteByPrimaryKey(String newId);

    int insert(New record);

    int insertSelective(New record) throws Exception;

    List<New> selectByExampleWithBLOBs(NewExample example);

    List<New> selectByExample(NewExample example);

    New selectByPrimaryKey(String newId);

    int updateByExampleSelective(@Param("record") New record, @Param("example") NewExample example);

    int updateByExampleWithBLOBs(@Param("record") New record, @Param("example") NewExample example);

    int updateByExample(@Param("record") New record, @Param("example") NewExample example);

    int updateByPrimaryKeySelective(New record);

    int updateByPrimaryKeyWithBLOBs(New record);

    int updateByPrimaryKey(New record);
}