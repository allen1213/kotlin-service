package com.kotlin.service;

import com.kotlin.bean.Comment;

import java.util.List;

public interface ICommentService {

    int insertSelective(Comment record);

    int deleteByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(Comment record);

    List<Comment> selectCommentByVideoId(Long videoId);
}
