package com.kotlin.bean.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdviseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdviseExample() {
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

        public Criteria andAdviseIdIsNull() {
            addCriterion("advise_id is null");
            return (Criteria) this;
        }

        public Criteria andAdviseIdIsNotNull() {
            addCriterion("advise_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseIdEqualTo(Long value) {
            addCriterion("advise_id =", value, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdNotEqualTo(Long value) {
            addCriterion("advise_id <>", value, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdGreaterThan(Long value) {
            addCriterion("advise_id >", value, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("advise_id >=", value, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdLessThan(Long value) {
            addCriterion("advise_id <", value, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdLessThanOrEqualTo(Long value) {
            addCriterion("advise_id <=", value, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdIn(List<Long> values) {
            addCriterion("advise_id in", values, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdNotIn(List<Long> values) {
            addCriterion("advise_id not in", values, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdBetween(Long value1, Long value2) {
            addCriterion("advise_id between", value1, value2, "adviseId");
            return (Criteria) this;
        }

        public Criteria andAdviseIdNotBetween(Long value1, Long value2) {
            addCriterion("advise_id not between", value1, value2, "adviseId");
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

        public Criteria andAdviseTitleIsNull() {
            addCriterion("advise_title is null");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleIsNotNull() {
            addCriterion("advise_title is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleEqualTo(String value) {
            addCriterion("advise_title =", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleNotEqualTo(String value) {
            addCriterion("advise_title <>", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleGreaterThan(String value) {
            addCriterion("advise_title >", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("advise_title >=", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleLessThan(String value) {
            addCriterion("advise_title <", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleLessThanOrEqualTo(String value) {
            addCriterion("advise_title <=", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleLike(String value) {
            addCriterion("advise_title like", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleNotLike(String value) {
            addCriterion("advise_title not like", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleIn(List<String> values) {
            addCriterion("advise_title in", values, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleNotIn(List<String> values) {
            addCriterion("advise_title not in", values, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleBetween(String value1, String value2) {
            addCriterion("advise_title between", value1, value2, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleNotBetween(String value1, String value2) {
            addCriterion("advise_title not between", value1, value2, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseContentIsNull() {
            addCriterion("advise_content is null");
            return (Criteria) this;
        }

        public Criteria andAdviseContentIsNotNull() {
            addCriterion("advise_content is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseContentEqualTo(String value) {
            addCriterion("advise_content =", value, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentNotEqualTo(String value) {
            addCriterion("advise_content <>", value, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentGreaterThan(String value) {
            addCriterion("advise_content >", value, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentGreaterThanOrEqualTo(String value) {
            addCriterion("advise_content >=", value, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentLessThan(String value) {
            addCriterion("advise_content <", value, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentLessThanOrEqualTo(String value) {
            addCriterion("advise_content <=", value, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentLike(String value) {
            addCriterion("advise_content like", value, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentNotLike(String value) {
            addCriterion("advise_content not like", value, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentIn(List<String> values) {
            addCriterion("advise_content in", values, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentNotIn(List<String> values) {
            addCriterion("advise_content not in", values, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentBetween(String value1, String value2) {
            addCriterion("advise_content between", value1, value2, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseContentNotBetween(String value1, String value2) {
            addCriterion("advise_content not between", value1, value2, "adviseContent");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeIsNull() {
            addCriterion("advise_time is null");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeIsNotNull() {
            addCriterion("advise_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeEqualTo(Date value) {
            addCriterion("advise_time =", value, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeNotEqualTo(Date value) {
            addCriterion("advise_time <>", value, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeGreaterThan(Date value) {
            addCriterion("advise_time >", value, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("advise_time >=", value, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeLessThan(Date value) {
            addCriterion("advise_time <", value, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeLessThanOrEqualTo(Date value) {
            addCriterion("advise_time <=", value, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeIn(List<Date> values) {
            addCriterion("advise_time in", values, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeNotIn(List<Date> values) {
            addCriterion("advise_time not in", values, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeBetween(Date value1, Date value2) {
            addCriterion("advise_time between", value1, value2, "adviseTime");
            return (Criteria) this;
        }

        public Criteria andAdviseTimeNotBetween(Date value1, Date value2) {
            addCriterion("advise_time not between", value1, value2, "adviseTime");
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