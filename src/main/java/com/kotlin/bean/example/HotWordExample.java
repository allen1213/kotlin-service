package com.kotlin.bean.example;

import java.util.ArrayList;
import java.util.List;

public class HotWordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotWordExample() {
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

        public Criteria andHotIdIsNull() {
            addCriterion("hot_id is null");
            return (Criteria) this;
        }

        public Criteria andHotIdIsNotNull() {
            addCriterion("hot_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotIdEqualTo(Long value) {
            addCriterion("hot_id =", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdNotEqualTo(Long value) {
            addCriterion("hot_id <>", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdGreaterThan(Long value) {
            addCriterion("hot_id >", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hot_id >=", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdLessThan(Long value) {
            addCriterion("hot_id <", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdLessThanOrEqualTo(Long value) {
            addCriterion("hot_id <=", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdIn(List<Long> values) {
            addCriterion("hot_id in", values, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdNotIn(List<Long> values) {
            addCriterion("hot_id not in", values, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdBetween(Long value1, Long value2) {
            addCriterion("hot_id between", value1, value2, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdNotBetween(Long value1, Long value2) {
            addCriterion("hot_id not between", value1, value2, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotNameIsNull() {
            addCriterion("hot_name is null");
            return (Criteria) this;
        }

        public Criteria andHotNameIsNotNull() {
            addCriterion("hot_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotNameEqualTo(String value) {
            addCriterion("hot_name =", value, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameNotEqualTo(String value) {
            addCriterion("hot_name <>", value, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameGreaterThan(String value) {
            addCriterion("hot_name >", value, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameGreaterThanOrEqualTo(String value) {
            addCriterion("hot_name >=", value, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameLessThan(String value) {
            addCriterion("hot_name <", value, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameLessThanOrEqualTo(String value) {
            addCriterion("hot_name <=", value, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameLike(String value) {
            addCriterion("hot_name like", value, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameNotLike(String value) {
            addCriterion("hot_name not like", value, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameIn(List<String> values) {
            addCriterion("hot_name in", values, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameNotIn(List<String> values) {
            addCriterion("hot_name not in", values, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameBetween(String value1, String value2) {
            addCriterion("hot_name between", value1, value2, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotNameNotBetween(String value1, String value2) {
            addCriterion("hot_name not between", value1, value2, "hotName");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionIsNull() {
            addCriterion("hot_description is null");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionIsNotNull() {
            addCriterion("hot_description is not null");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionEqualTo(String value) {
            addCriterion("hot_description =", value, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionNotEqualTo(String value) {
            addCriterion("hot_description <>", value, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionGreaterThan(String value) {
            addCriterion("hot_description >", value, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("hot_description >=", value, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionLessThan(String value) {
            addCriterion("hot_description <", value, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionLessThanOrEqualTo(String value) {
            addCriterion("hot_description <=", value, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionLike(String value) {
            addCriterion("hot_description like", value, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionNotLike(String value) {
            addCriterion("hot_description not like", value, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionIn(List<String> values) {
            addCriterion("hot_description in", values, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionNotIn(List<String> values) {
            addCriterion("hot_description not in", values, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionBetween(String value1, String value2) {
            addCriterion("hot_description between", value1, value2, "hotDescription");
            return (Criteria) this;
        }

        public Criteria andHotDescriptionNotBetween(String value1, String value2) {
            addCriterion("hot_description not between", value1, value2, "hotDescription");
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