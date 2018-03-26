package com.news.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckfailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckfailedExample() {
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

        public Criteria andChfIdIsNull() {
            addCriterion("chf_id is null");
            return (Criteria) this;
        }

        public Criteria andChfIdIsNotNull() {
            addCriterion("chf_id is not null");
            return (Criteria) this;
        }

        public Criteria andChfIdEqualTo(Integer value) {
            addCriterion("chf_id =", value, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdNotEqualTo(Integer value) {
            addCriterion("chf_id <>", value, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdGreaterThan(Integer value) {
            addCriterion("chf_id >", value, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chf_id >=", value, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdLessThan(Integer value) {
            addCriterion("chf_id <", value, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdLessThanOrEqualTo(Integer value) {
            addCriterion("chf_id <=", value, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdIn(List<Integer> values) {
            addCriterion("chf_id in", values, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdNotIn(List<Integer> values) {
            addCriterion("chf_id not in", values, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdBetween(Integer value1, Integer value2) {
            addCriterion("chf_id between", value1, value2, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chf_id not between", value1, value2, "chfId");
            return (Criteria) this;
        }

        public Criteria andChfReasonIsNull() {
            addCriterion("chf_reason is null");
            return (Criteria) this;
        }

        public Criteria andChfReasonIsNotNull() {
            addCriterion("chf_reason is not null");
            return (Criteria) this;
        }

        public Criteria andChfReasonEqualTo(String value) {
            addCriterion("chf_reason =", value, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonNotEqualTo(String value) {
            addCriterion("chf_reason <>", value, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonGreaterThan(String value) {
            addCriterion("chf_reason >", value, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonGreaterThanOrEqualTo(String value) {
            addCriterion("chf_reason >=", value, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonLessThan(String value) {
            addCriterion("chf_reason <", value, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonLessThanOrEqualTo(String value) {
            addCriterion("chf_reason <=", value, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonLike(String value) {
            addCriterion("chf_reason like", value, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonNotLike(String value) {
            addCriterion("chf_reason not like", value, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonIn(List<String> values) {
            addCriterion("chf_reason in", values, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonNotIn(List<String> values) {
            addCriterion("chf_reason not in", values, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonBetween(String value1, String value2) {
            addCriterion("chf_reason between", value1, value2, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfReasonNotBetween(String value1, String value2) {
            addCriterion("chf_reason not between", value1, value2, "chfReason");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeIsNull() {
            addCriterion("chf_createtime is null");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeIsNotNull() {
            addCriterion("chf_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeEqualTo(Date value) {
            addCriterion("chf_createtime =", value, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeNotEqualTo(Date value) {
            addCriterion("chf_createtime <>", value, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeGreaterThan(Date value) {
            addCriterion("chf_createtime >", value, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chf_createtime >=", value, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeLessThan(Date value) {
            addCriterion("chf_createtime <", value, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("chf_createtime <=", value, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeIn(List<Date> values) {
            addCriterion("chf_createtime in", values, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeNotIn(List<Date> values) {
            addCriterion("chf_createtime not in", values, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeBetween(Date value1, Date value2) {
            addCriterion("chf_createtime between", value1, value2, "chfCreatetime");
            return (Criteria) this;
        }

        public Criteria andChfCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("chf_createtime not between", value1, value2, "chfCreatetime");
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