package com.kotlin.bean;

import java.util.Date;

public class Collect {
    private Long collectId;

    private Long fromUserId;

    private Long uerId;

    private Long videoId;

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