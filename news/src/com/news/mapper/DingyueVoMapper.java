package com.news.mapper;

import java.util.List;

import com.news.entity.DingyueVo;

public interface DingyueVoMapper {
	public List<DingyueVo> getDingyue(String userId);
	public Integer getDingyueOfAuthor(String authorId);
}
