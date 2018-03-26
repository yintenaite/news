package com.news.mapper;

import java.util.List;
import java.util.Map;

import com.news.entity.NewsQueue;

public interface NewsQueueMapper {

	public List<NewsQueue> getNewstoQueue(Map map);
}
