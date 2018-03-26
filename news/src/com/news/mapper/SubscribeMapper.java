package com.news.mapper;

import com.news.entity.Subscribe;
import com.news.entity.SubscribeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscribeMapper {
	Subscribe getIfSubscribe(Subscribe s);
	void delSubscribe(Subscribe s);
    int countByExample(SubscribeExample example);

    int deleteByExample(SubscribeExample example);

    int deleteByPrimaryKey(Integer subscribeId);

    int insert(Subscribe record);

    int insertSelective(Subscribe record);

    List<Subscribe> selectByExample(SubscribeExample example);

    Subscribe selectByPrimaryKey(Integer subscribeId);

    int updateByExampleSelective(@Param("record") Subscribe record, @Param("example") SubscribeExample example);

    int updateByExample(@Param("record") Subscribe record, @Param("example") SubscribeExample example);

    int updateByPrimaryKeySelective(Subscribe record);

    int updateByPrimaryKey(Subscribe record);
}