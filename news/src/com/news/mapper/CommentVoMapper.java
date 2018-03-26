package com.news.mapper;

import java.util.List;

import com.news.entity.CommentVo;

public interface CommentVoMapper {
	public List<CommentVo> getCommentVoByNewsId(String id);
}
