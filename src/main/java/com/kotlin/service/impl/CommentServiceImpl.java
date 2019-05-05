package com.kotlin.service.impl;

import com.kotlin.bean.Comment;
import com.kotlin.dao.CommentMapper;
import com.kotlin.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long commentId) {
        return commentMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Comment> selectCommentByVideoId(Long videoId) {
        return commentMapper.selectCommentByVideoId(videoId);
    }
}
