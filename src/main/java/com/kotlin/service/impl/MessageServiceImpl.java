package com.kotlin.service.impl;

import com.kotlin.bean.Message;
import com.kotlin.bean.example.MessageExample;
import com.kotlin.dao.MessageMapper;
import com.kotlin.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements IMessageService {

    @Autowired
    private MessageMapper messageMapper;
    @Override
    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long messageId) {
        return messageMapper.deleteByPrimaryKey(messageId);
    }

    @Override
    public List<Message> selectMessageByUserId(Long fromUserId,Long toUserId) {
        return messageMapper.selectMessageByUserId(fromUserId,toUserId);
    }
}
