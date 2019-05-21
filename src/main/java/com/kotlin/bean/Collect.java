package com.kotlin.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Collect {
    private Long collectId;

    private Long fromUserId;

    private Long uerId;

    private Long videoId;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date collectTime;

    public Long getCollectId() {
        return collectId;
    }

    public void setCollectId(Long collectId) {
        this.collectId = collectId;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getUerId() {
        return uerId;
    }

    public void setUerId(Long uerId) {
        this.uerId = uerId;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}