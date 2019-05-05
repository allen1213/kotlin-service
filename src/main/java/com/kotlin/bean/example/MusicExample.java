package com.kotlin.bean.example;

import java.util.ArrayList;
import java.util.List;

public class MusicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicExample() {
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

        public Criteria andMusicIdIsNull() {
            addCriterion("music_id is null");
            return (Criteria) this;
        }

        public Criteria andMusicIdIsNotNull() {
            addCriterion("music_id is not null");
            return (Criteria) this;
        }

        public Criteria andMusicIdEqualTo(Long value) {
            addCriterion("music_id =", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotEqualTo(Long value) {
            addCriterion("music_id <>", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdGreaterThan(Long value) {
            addCriterion("music_id >", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("music_id >=", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdLessThan(Long value) {
            addCriterion("music_id <", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdLessThanOrEqualTo(Long value) {
            addCriterion("music_id <=", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdIn(List<Long> values) {
            addCriterion("music_id in", values, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotIn(List<Long> values) {
            addCriterion("music_id not in", values, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdBetween(Long value1, Long value2) {
            addCriterion("music_id between", value1, value2, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotBetween(Long value1, Long value2) {
            addCriterion("music_id not between", value1, value2, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicNameIsNull() {
            addCriterion("music_name is null");
            return (Criteria) this;
        }

        public Criteria andMusicNameIsNotNull() {
            addCriterion("music_name is not null");
            return (Criteria) this;
        }

        public Criteria andMusicNameEqualTo(String value) {
            addCriterion("music_name =", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotEqualTo(String value) {
            addCriterion("music_name <>", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameGreaterThan(String value) {
            addCriterion("music_name >", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameGreaterThanOrEqualTo(String value) {
            addCriterion("music_name >=", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLessThan(String value) {
            addCriterion("music_name <", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLessThanOrEqualTo(String value) {
            addCriterion("music_name <=", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLike(String value) {
            addCriterion("music_name like", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotLike(String value) {
            addCriterion("music_name not like", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameIn(List<String> values) {
            addCriterion("music_name in", values, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotIn(List<String> values) {
            addCriterion("music_name not in", values, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameBetween(String value1, String value2) {
            addCriterion("music_name between", value1, value2, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotBetween(String value1, String value2) {
            addCriterion("music_name not between", value1, value2, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicPathIsNull() {
            addCriterion("music_path is null");
            return (Criteria) this;
        }

        public Criteria andMusicPathIsNotNull() {
            addCriterion("music_path is not null");
            return (Criteria) this;
        }

        public Criteria andMusicPathEqualTo(String value) {
            addCriterion("music_path =", value, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathNotEqualTo(String value) {
            addCriterion("music_path <>", value, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathGreaterThan(String value) {
            addCriterion("music_path >", value, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathGreaterThanOrEqualTo(String value) {
            addCriterion("music_path >=", value, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathLessThan(String value) {
            addCriterion("music_path <", value, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathLessThanOrEqualTo(String value) {
            addCriterion("music_path <=", value, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathLike(String value) {
            addCriterion("music_path like", value, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathNotLike(String value) {
            addCriterion("music_path not like", value, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathIn(List<String> values) {
            addCriterion("music_path in", values, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathNotIn(List<String> values) {
            addCriterion("music_path not in", values, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathBetween(String value1, String value2) {
            addCriterion("music_path between", value1, value2, "musicPath");
            return (Criteria) this;
        }

        public Criteria andMusicPathNotBetween(String value1, String value2) {
            addCriterion("music_path not between", value1, value2, "musicPath");
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