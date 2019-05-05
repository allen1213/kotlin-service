package com.kotlin.bean;

import java.util.Date;

public class Advise {
    private Long adviseId;

    private Long userId;

    private String adviseTitle;

    private String adviseContent;

    private Date adviseTime;

    public Long getAdviseId() {
        return adviseId;
    }

    public void setAdviseId(Long adviseId) {
        this.adviseId = adviseId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAdviseTitle() {
        return adviseTitle;
    }

    public void setAdviseTitle(String adviseTitle) {
        this.adviseTitle = adviseTitle == null ? null : adviseTitle.trim();
    }

    public String getAdviseContent() {
        return adviseContent;
    }

    public void setAdviseContent(String adviseContent) {
        this.adviseContent = adviseContent == null ? null : adviseContent.trim();
    }

    public Date getAdviseTime() {
        return adviseTime;
    }

    public void setAdviseTime(Date adviseTime) {
        this.adviseTime = adviseTime;
    }
}