package com.news.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckpassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckpassExample() {
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

        public Criteria andChpIdIsNull() {
            addCriterion("chp_id is null");
            return (Criteria) this;
        }

        public Criteria andChpIdIsNotNull() {
            addCriterion("chp_id is not null");
            return (Criteria) this;
        }

        public Criteria andChpIdEqualTo(Integer value) {
            addCriterion("chp_id =", value, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdNotEqualTo(Integer value) {
            addCriterion("chp_id <>", value, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdGreaterThan(Integer value) {
            addCriterion("chp_id >", value, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chp_id >=", value, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdLessThan(Integer value) {
            addCriterion("chp_id <", value, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdLessThanOrEqualTo(Integer value) {
            addCriterion("chp_id <=", value, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdIn(List<Integer> values) {
            addCriterion("chp_id in", values, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdNotIn(List<Integer> values) {
            addCriterion("chp_id not in", values, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdBetween(Integer value1, Integer value2) {
            addCriterion("chp_id between", value1, value2, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chp_id not between", value1, value2, "chpId");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeIsNull() {
            addCriterion("chp_createtime is null");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeIsNotNull() {
            addCriterion("chp_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeEqualTo(Date value) {
            addCriterion("chp_createtime =", value, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeNotEqualTo(Date value) {
            addCriterion("chp_createtime <>", value, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeGreaterThan(Date value) {
            addCriterion("chp_createtime >", value, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chp_createtime >=", value, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeLessThan(Date value) {
            addCriterion("chp_createtime <", value, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("chp_createtime <=", value, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeIn(List<Date> values) {
            addCriterion("chp_createtime in", values, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeNotIn(List<Date> values) {
            addCriterion("chp_createtime not in", values, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeBetween(Date value1, Date value2) {
            addCriterion("chp_createtime between", value1, value2, "chpCreatetime");
            return (Criteria) this;
        }

        public Criteria andChpCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("chp_createtime not between", value1, value2, "chpCreatetime");
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

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
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