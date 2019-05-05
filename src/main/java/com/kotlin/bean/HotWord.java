package com.kotlin.bean;

public class HotWord {
    private Long hotId;

    private String hotName;

    private String hotDescription;

    public Long getHotId() {
        return hotId;
    }

    public void setHotId(Long hotId) {
        this.hotId = hotId;
    }

    public String getHotName() {
        return hotName;
    }

    public void setHotName(String hotName) {
        this.hotName = hotName == null ? null : hotName.trim();
    }

    public String getHotDescription() {
        return hotDescription;
    }

    public void setHotDescription(String hotDescription) {
        this.hotDescription = hotDescription == null ? null : hotDescription.trim();
    }
}