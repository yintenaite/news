package com.news.entity;

import java.util.ArrayList;
import java.util.List;

public class StatisticExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatisticExample() {
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

        public Criteria andStatisticIdIsNull() {
            addCriterion("statistic_id is null");
            return (Criteria) this;
        }

        public Criteria andStatisticIdIsNotNull() {
            addCriterion("statistic_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticIdEqualTo(Integer value) {
            addCriterion("statistic_id =", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdNotEqualTo(Integer value) {
            addCriterion("statistic_id <>", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdGreaterThan(Integer value) {
            addCriterion("statistic_id >", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("statistic_id >=", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdLessThan(Integer value) {
            addCriterion("statistic_id <", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdLessThanOrEqualTo(Integer value) {
            addCriterion("statistic_id <=", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdIn(List<Integer> values) {
            addCriterion("statistic_id in", values, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdNotIn(List<Integer> values) {
            addCriterion("statistic_id not in", values, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdBetween(Integer value1, Integer value2) {
            addCriterion("statistic_id between", value1, value2, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdNotBetween(Integer value1, Integer value2) {
            addCriterion("statistic_id not between", value1, value2, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticReadIsNull() {
            addCriterion("statistic_read is null");
            return (Criteria) this;
        }

        public Criteria andStatisticReadIsNotNull() {
            addCriterion("statistic_read is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticReadEqualTo(Integer value) {
            addCriterion("statistic_read =", value, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadNotEqualTo(Integer value) {
            addCriterion("statistic_read <>", value, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadGreaterThan(Integer value) {
            addCriterion("statistic_read >", value, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("statistic_read >=", value, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadLessThan(Integer value) {
            addCriterion("statistic_read <", value, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadLessThanOrEqualTo(Integer value) {
            addCriterion("statistic_read <=", value, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadIn(List<Integer> values) {
            addCriterion("statistic_read in", values, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadNotIn(List<Integer> values) {
            addCriterion("statistic_read not in", values, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadBetween(Integer value1, Integer value2) {
            addCriterion("statistic_read between", value1, value2, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticReadNotBetween(Integer value1, Integer value2) {
            addCriterion("statistic_read not between", value1, value2, "statisticRead");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionIsNull() {
            addCriterion("statistic_collection is null");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionIsNotNull() {
            addCriterion("statistic_collection is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionEqualTo(Integer value) {
            addCriterion("statistic_collection =", value, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionNotEqualTo(Integer value) {
            addCriterion("statistic_collection <>", value, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionGreaterThan(Integer value) {
            addCriterion("statistic_collection >", value, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("statistic_collection >=", value, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionLessThan(Integer value) {
            addCriterion("statistic_collection <", value, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionLessThanOrEqualTo(Integer value) {
            addCriterion("statistic_collection <=", value, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionIn(List<Integer> values) {
            addCriterion("statistic_collection in", values, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionNotIn(List<Integer> values) {
            addCriterion("statistic_collection not in", values, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionBetween(Integer value1, Integer value2) {
            addCriterion("statistic_collection between", value1, value2, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCollectionNotBetween(Integer value1, Integer value2) {
            addCriterion("statistic_collection not between", value1, value2, "statisticCollection");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentIsNull() {
            addCriterion("statistic_comment is null");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentIsNotNull() {
            addCriterion("statistic_comment is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentEqualTo(Integer value) {
            addCriterion("statistic_comment =", value, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentNotEqualTo(Integer value) {
            addCriterion("statistic_comment <>", value, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentGreaterThan(Integer value) {
            addCriterion("statistic_comment >", value, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("statistic_comment >=", value, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentLessThan(Integer value) {
            addCriterion("statistic_comment <", value, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentLessThanOrEqualTo(Integer value) {
            addCriterion("statistic_comment <=", value, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentIn(List<Integer> values) {
            addCriterion("statistic_comment in", values, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentNotIn(List<Integer> values) {
            addCriterion("statistic_comment not in", values, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentBetween(Integer value1, Integer value2) {
            addCriterion("statistic_comment between", value1, value2, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andStatisticCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("statistic_comment not between", value1, value2, "statisticComment");
            return (Criteria) this;
        }

        public Criteria andNewIdIsNull() {
            addCriterion("new_id is null");
            return (Criteria) this;
        }

        public Criteria andNewIdIsNotNull() {
            addCriterion("new_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewIdEqualTo(String value) {
            addCriterion("new_id =", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdNotEqualTo(String value) {
            addCriterion("new_id <>", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdGreaterThan(String value) {
            addCriterion("new_id >", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_id >=", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdLessThan(String value) {
            addCriterion("new_id <", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdLessThanOrEqualTo(String value) {
            addCriterion("new_id <=", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdLike(String value) {
            addCriterion("new_id like", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdNotLike(String value) {
            addCriterion("new_id not like", value, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdIn(List<String> values) {
            addCriterion("new_id in", values, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdNotIn(List<String> values) {
            addCriterion("new_id not in", values, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdBetween(String value1, String value2) {
            addCriterion("new_id between", value1, value2, "newId");
            return (Criteria) this;
        }

        public Criteria andNewIdNotBetween(String value1, String value2) {
            addCriterion("new_id not between", value1, value2, "newId");
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