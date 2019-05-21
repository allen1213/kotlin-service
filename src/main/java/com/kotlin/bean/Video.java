package com.kotlin.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Video {
    private Long videoId;

    private Long userId;

    private Long audioId;

    private Long categoryId;

    private String videoPlayurl;

    private String videoWeburl;

    private String videoCover;

    private String videoType;

    private String videoTag;

    private String videoTitle;

    private String videoDescription;

    private String videoCategory;

    private String videoStatus;

    private Long videoDuration;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;

    private Long likeCount;

    private Long shareCount;

    private Long commentCount;

    private Long videoWidth;

    private Long videoHeight;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAudioId() {
        return audioId;
    }

    public void setAudioId(Long audioId) {
        this.audioId = audioId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getVideoPlayurl() {
        return videoPlayurl;
    }

    public void setVideoPlayurl(String videoPlayurl) {
        this.videoPlayurl = videoPlayurl == null ? null : videoPlayurl.trim();
    }

    public String getVideoWeburl() {
        return videoWeburl;
    }

    public void setVideoWeburl(String videoWeburl) {
        this.videoWeburl = videoWeburl == null ? null : videoWeburl.trim();
    }

    public String getVideoCover() {
        return videoCover;
    }

    public void setVideoCover(String videoCover) {
        this.videoCover = videoCover == null ? null : videoCover.trim();
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }

    public String getVideoTag() {
        return videoTag;
    }

    public void setVideoTag(String videoTag) {
        this.videoTag = videoTag == null ? null : videoTag.trim();
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle == null ? null : videoTitle.trim();
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription == null ? null : videoDescription.trim();
    }

    public String getVideoCategory() {
        return videoCategory;
    }

    public void setVideoCategory(String videoCategory) {
        this.videoCategory = videoCategory == null ? null : videoCategory.trim();
    }

    public String getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(String videoStatus) {
        this.videoStatus = videoStatus == null ? null : videoStatus.trim();
    }

    public Long getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(Long videoDuration) {
        this.videoDuration = videoDuration;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public Long getShareCount() {
        return shareCount;
    }

    public void setShareCount(Long shareCount) {
        this.shareCount = shareCount;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Long getVideoWidth() {
        return videoWidth;
    }

    public void setVideoWidth(Long videoWidth) {
        this.videoWidth = videoWidth;
    }

    public Long getVideoHeight() {
        return videoHeight;
    }

    public void setVideoHeight(Long videoHeight) {
        this.videoHeight = videoHeight;
    }
}