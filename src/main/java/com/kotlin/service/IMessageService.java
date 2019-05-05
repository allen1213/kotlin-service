package com.kotlin.service;

import com.kotlin.bean.Message;
import com.kotlin.bean.example.MessageExample;

import java.util.List;

public interface IMessageService {

    int insertSelective(Message record);

    int deleteByPrimaryKey(Long messageId);

    List<Message> selectMessageByUserId(Long fromUserId,Long toUserId);
}
