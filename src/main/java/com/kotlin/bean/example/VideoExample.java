package com.kotlin.bean.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Long value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Long value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Long value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Long value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Long value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Long> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Long> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Long value1, Long value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Long value1, Long value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAudioIdIsNull() {
            addCriterion("audio_id is null");
            return (Criteria) this;
        }

        public Criteria andAudioIdIsNotNull() {
            addCriterion("audio_id is not null");
            return (Criteria) this;
        }

        public Criteria andAudioIdEqualTo(Long value) {
            addCriterion("audio_id =", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotEqualTo(Long value) {
            addCriterion("audio_id <>", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdGreaterThan(Long value) {
            addCriterion("audio_id >", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdGreaterThanOrEqualTo(Long value) {
            addCriterion("audio_id >=", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdLessThan(Long value) {
            addCriterion("audio_id <", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdLessThanOrEqualTo(Long value) {
            addCriterion("audio_id <=", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdIn(List<Long> values) {
            addCriterion("audio_id in", values, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotIn(List<Long> values) {
            addCriterion("audio_id not in", values, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdBetween(Long value1, Long value2) {
            addCriterion("audio_id between", value1, value2, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotBetween(Long value1, Long value2) {
            addCriterion("audio_id not between", value1, value2, "audioId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlIsNull() {
            addCriterion("video_playUrl is null");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlIsNotNull() {
            addCriterion("video_playUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlEqualTo(String value) {
            addCriterion("video_playUrl =", value, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlNotEqualTo(String value) {
            addCriterion("video_playUrl <>", value, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlGreaterThan(String value) {
            addCriterion("video_playUrl >", value, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlGreaterThanOrEqualTo(String value) {
            addCriterion("video_playUrl >=", value, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlLessThan(String value) {
            addCriterion("video_playUrl <", value, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlLessThanOrEqualTo(String value) {
            addCriterion("video_playUrl <=", value, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlLike(String value) {
            addCriterion("video_playUrl like", value, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlNotLike(String value) {
            addCriterion("video_playUrl not like", value, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlIn(List<String> values) {
            addCriterion("video_playUrl in", values, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlNotIn(List<String> values) {
            addCriterion("video_playUrl not in", values, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlBetween(String value1, String value2) {
            addCriterion("video_playUrl between", value1, value2, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoPlayurlNotBetween(String value1, String value2) {
            addCriterion("video_playUrl not between", value1, value2, "videoPlayurl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlIsNull() {
            addCriterion("video_webUrl is null");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlIsNotNull() {
            addCriterion("video_webUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlEqualTo(String value) {
            addCriterion("video_webUrl =", value, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlNotEqualTo(String value) {
            addCriterion("video_webUrl <>", value, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlGreaterThan(String value) {
            addCriterion("video_webUrl >", value, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlGreaterThanOrEqualTo(String value) {
            addCriterion("video_webUrl >=", value, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlLessThan(String value) {
            addCriterion("video_webUrl <", value, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlLessThanOrEqualTo(String value) {
            addCriterion("video_webUrl <=", value, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlLike(String value) {
            addCriterion("video_webUrl like", value, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlNotLike(String value) {
            addCriterion("video_webUrl not like", value, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlIn(List<String> values) {
            addCriterion("video_webUrl in", values, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlNotIn(List<String> values) {
            addCriterion("video_webUrl not in", values, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlBetween(String value1, String value2) {
            addCriterion("video_webUrl between", value1, value2, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoWeburlNotBetween(String value1, String value2) {
            addCriterion("video_webUrl not between", value1, value2, "videoWeburl");
            return (Criteria) this;
        }

        public Criteria andVideoCoverIsNull() {
            addCriterion("video_cover is null");
            return (Criteria) this;
        }

        public Criteria andVideoCoverIsNotNull() {
            addCriterion("video_cover is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCoverEqualTo(String value) {
            addCriterion("video_cover =", value, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverNotEqualTo(String value) {
            addCriterion("video_cover <>", value, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverGreaterThan(String value) {
            addCriterion("video_cover >", value, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverGreaterThanOrEqualTo(String value) {
            addCriterion("video_cover >=", value, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverLessThan(String value) {
            addCriterion("video_cover <", value, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverLessThanOrEqualTo(String value) {
            addCriterion("video_cover <=", value, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverLike(String value) {
            addCriterion("video_cover like", value, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverNotLike(String value) {
            addCriterion("video_cover not like", value, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverIn(List<String> values) {
            addCriterion("video_cover in", values, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverNotIn(List<String> values) {
            addCriterion("video_cover not in", values, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverBetween(String value1, String value2) {
            addCriterion("video_cover between", value1, value2, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoCoverNotBetween(String value1, String value2) {
            addCriterion("video_cover not between", value1, value2, "videoCover");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNull() {
            addCriterion("video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(String value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(String value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(String value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(String value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(String value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLike(String value) {
            addCriterion("video_type like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotLike(String value) {
            addCriterion("video_type not like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<String> values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<String> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(String value1, String value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(String value1, String value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTagIsNull() {
            addCriterion("video_tag is null");
            return (Criteria) this;
        }

        public Criteria andVideoTagIsNotNull() {
            addCriterion("video_tag is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTagEqualTo(String value) {
            addCriterion("video_tag =", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagNotEqualTo(String value) {
            addCriterion("video_tag <>", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagGreaterThan(String value) {
            addCriterion("video_tag >", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagGreaterThanOrEqualTo(String value) {
            addCriterion("video_tag >=", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagLessThan(String value) {
            addCriterion("video_tag <", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagLessThanOrEqualTo(String value) {
            addCriterion("video_tag <=", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagLike(String value) {
            addCriterion("video_tag like", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagNotLike(String value) {
            addCriterion("video_tag not like", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagIn(List<String> values) {
            addCriterion("video_tag in", values, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagNotIn(List<String> values) {
            addCriterion("video_tag not in", values, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagBetween(String value1, String value2) {
            addCriterion("video_tag between", value1, value2, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagNotBetween(String value1, String value2) {
            addCriterion("video_tag not between", value1, value2, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIsNull() {
            addCriterion("video_title is null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIsNotNull() {
            addCriterion("video_title is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleEqualTo(String value) {
            addCriterion("video_title =", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotEqualTo(String value) {
            addCriterion("video_title <>", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThan(String value) {
            addCriterion("video_title >", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("video_title >=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThan(String value) {
            addCriterion("video_title <", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThanOrEqualTo(String value) {
            addCriterion("video_title <=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLike(String value) {
            addCriterion("video_title like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotLike(String value) {
            addCriterion("video_title not like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIn(List<String> values) {
            addCriterion("video_title in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotIn(List<String> values) {
            addCriterion("video_title not in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleBetween(String value1, String value2) {
            addCriterion("video_title between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotBetween(String value1, String value2) {
            addCriterion("video_title not between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionIsNull() {
            addCriterion("video_description is null");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionIsNotNull() {
            addCriterion("video_description is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionEqualTo(String value) {
            addCriterion("video_description =", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionNotEqualTo(String value) {
            addCriterion("video_description <>", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionGreaterThan(String value) {
            addCriterion("video_description >", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("video_description >=", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionLessThan(String value) {
            addCriterion("video_description <", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("video_description <=", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionLike(String value) {
            addCriterion("video_description like", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionNotLike(String value) {
            addCriterion("video_description not like", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionIn(List<String> values) {
            addCriterion("video_description in", values, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionNotIn(List<String> values) {
            addCriterion("video_description not in", values, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionBetween(String value1, String value2) {
            addCriterion("video_description between", value1, value2, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionNotBetween(String value1, String value2) {
            addCriterion("video_description not between", value1, value2, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryIsNull() {
            addCriterion("video_category is null");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryIsNotNull() {
            addCriterion("video_category is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryEqualTo(String value) {
            addCriterion("video_category =", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryNotEqualTo(String value) {
            addCriterion("video_category <>", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryGreaterThan(String value) {
            addCriterion("video_category >", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("video_category >=", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryLessThan(String value) {
            addCriterion("video_category <", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryLessThanOrEqualTo(String value) {
            addCriterion("video_category <=", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryLike(String value) {
            addCriterion("video_category like", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryNotLike(String value) {
            addCriterion("video_category not like", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryIn(List<String> values) {
            addCriterion("video_category in", values, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryNotIn(List<String> values) {
            addCriterion("video_category not in", values, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryBetween(String value1, String value2) {
            addCriterion("video_category between", value1, value2, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryNotBetween(String value1, String value2) {
            addCriterion("video_category not between", value1, value2, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNull() {
            addCriterion("video_status is null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNotNull() {
            addCriterion("video_status is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusEqualTo(String value) {
            addCriterion("video_status =", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotEqualTo(String value) {
            addCriterion("video_status <>", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThan(String value) {
            addCriterion("video_status >", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("video_status >=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThan(String value) {
            addCriterion("video_status <", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThanOrEqualTo(String value) {
            addCriterion("video_status <=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLike(String value) {
            addCriterion("video_status like", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotLike(String value) {
            addCriterion("video_status not like", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIn(List<String> values) {
            addCriterion("video_status in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotIn(List<String> values) {
            addCriterion("video_status not in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusBetween(String value1, String value2) {
            addCriterion("video_status between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotBetween(String value1, String value2) {
            addCriterion("video_status not between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoDurationIsNull() {
            addCriterion("video_duration is null");
            return (Criteria) this;
        }

        public Criteria andVideoDurationIsNotNull() {
            addCriterion("video_duration is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDurationEqualTo(Long value) {
            addCriterion("video_duration =", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationNotEqualTo(Long value) {
            addCriterion("video_duration <>", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationGreaterThan(Long value) {
            addCriterion("video_duration >", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("video_duration >=", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationLessThan(Long value) {
            addCriterion("video_duration <", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationLessThanOrEqualTo(Long value) {
            addCriterion("video_duration <=", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationIn(List<Long> values) {
            addCriterion("video_duration in", values, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationNotIn(List<Long> values) {
            addCriterion("video_duration not in", values, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationBetween(Long value1, Long value2) {
            addCriterion("video_duration between", value1, value2, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationNotBetween(Long value1, Long value2) {
            addCriterion("video_duration not between", value1, value2, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNull() {
            addCriterion("like_count is null");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNotNull() {
            addCriterion("like_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCountEqualTo(Long value) {
            addCriterion("like_count =", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotEqualTo(Long value) {
            addCriterion("like_count <>", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThan(Long value) {
            addCriterion("like_count >", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("like_count >=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThan(Long value) {
            addCriterion("like_count <", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThanOrEqualTo(Long value) {
            addCriterion("like_count <=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIn(List<Long> values) {
            addCriterion("like_count in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotIn(List<Long> values) {
            addCriterion("like_count not in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountBetween(Long value1, Long value2) {
            addCriterion("like_count between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotBetween(Long value1, Long value2) {
            addCriterion("like_count not between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNull() {
            addCriterion("share_count is null");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNotNull() {
            addCriterion("share_count is not null");
            return (Criteria) this;
        }

        public Criteria andShareCountEqualTo(Long value) {
            addCriterion("share_count =", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotEqualTo(Long value) {
            addCriterion("share_count <>", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThan(Long value) {
            addCriterion("share_count >", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThanOrEqualTo(Long value) {
            addCriterion("share_count >=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThan(Long value) {
            addCriterion("share_count <", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThanOrEqualTo(Long value) {
            addCriterion("share_count <=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIn(List<Long> values) {
            addCriterion("share_count in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotIn(List<Long> values) {
            addCriterion("share_count not in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountBetween(Long value1, Long value2) {
            addCriterion("share_count between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotBetween(Long value1, Long value2) {
            addCriterion("share_count not between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Long value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Long value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Long value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Long value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Long value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Long> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Long> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Long value1, Long value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Long value1, Long value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andVideoWidthIsNull() {
            addCriterion("video_width is null");
            return (Criteria) this;
        }

        public Criteria andVideoWidthIsNotNull() {
            addCriterion("video_width is not null");
            return (Criteria) this;
        }

        public Criteria andVideoWidthEqualTo(Long value) {
            addCriterion("video_width =", value, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthNotEqualTo(Long value) {
            addCriterion("video_width <>", value, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthGreaterThan(Long value) {
            addCriterion("video_width >", value, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("video_width >=", value, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthLessThan(Long value) {
            addCriterion("video_width <", value, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthLessThanOrEqualTo(Long value) {
            addCriterion("video_width <=", value, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthIn(List<Long> values) {
            addCriterion("video_width in", values, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthNotIn(List<Long> values) {
            addCriterion("video_width not in", values, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthBetween(Long value1, Long value2) {
            addCriterion("video_width between", value1, value2, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoWidthNotBetween(Long value1, Long value2) {
            addCriterion("video_width not between", value1, value2, "videoWidth");
            return (Criteria) this;
        }

        public Criteria andVideoHeightIsNull() {
            addCriterion("video_height is null");
            return (Criteria) this;
        }

        public Criteria andVideoHeightIsNotNull() {
            addCriterion("video_height is not null");
            return (Criteria) this;
        }

        public Criteria andVideoHeightEqualTo(Long value) {
            addCriterion("video_height =", value, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightNotEqualTo(Long value) {
            addCriterion("video_height <>", value, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightGreaterThan(Long value) {
            addCriterion("video_height >", value, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightGreaterThanOrEqualTo(Long value) {
            addCriterion("video_height >=", value, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightLessThan(Long value) {
            addCriterion("video_height <", value, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightLessThanOrEqualTo(Long value) {
            addCriterion("video_height <=", value, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightIn(List<Long> values) {
            addCriterion("video_height in", values, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightNotIn(List<Long> values) {
            addCriterion("video_height not in", values, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightBetween(Long value1, Long value2) {
            addCriterion("video_height between", value1, value2, "videoHeight");
            return (Criteria) this;
        }

        public Criteria andVideoHeightNotBetween(Long value1, Long value2) {
            addCriterion("video_height not between", value1, value2, "videoHeight");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}