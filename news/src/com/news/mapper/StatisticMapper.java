package com.news.mapper;

import com.news.entity.Statistic;
import com.news.entity.StatisticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticMapper {
	Statistic getStatisticByNewsId(String id);
	
    int countByExample(StatisticExample example);

    int deleteByExample(StatisticExample example);

    int deleteByPrimaryKey(Integer statisticId);

    int insert(Statistic record);

    int insertSelective(Statistic record);

    List<Statistic> selectByExample(StatisticExample example);

    Statistic selectByPrimaryKey(Integer statisticId);

    int updateByExampleSelective(@Param("record") Statistic record, @Param("example") StatisticExample example);

    int updateByExample(@Param("record") Statistic record, @Param("example") StatisticExample example);

    int updateByPrimaryKeySelective(Statistic record);

    int updateByPrimaryKey(Statistic record);
}