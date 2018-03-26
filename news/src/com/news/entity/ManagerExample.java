package com.news.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andManagerNumberIsNull() {
            addCriterion("manager_number is null");
            return (Criteria) this;
        }

        public Criteria andManagerNumberIsNotNull() {
            addCriterion("manager_number is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNumberEqualTo(String value) {
            addCriterion("manager_number =", value, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberNotEqualTo(String value) {
            addCriterion("manager_number <>", value, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberGreaterThan(String value) {
            addCriterion("manager_number >", value, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("manager_number >=", value, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberLessThan(String value) {
            addCriterion("manager_number <", value, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberLessThanOrEqualTo(String value) {
            addCriterion("manager_number <=", value, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberLike(String value) {
            addCriterion("manager_number like", value, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberNotLike(String value) {
            addCriterion("manager_number not like", value, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberIn(List<String> values) {
            addCriterion("manager_number in", values, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberNotIn(List<String> values) {
            addCriterion("manager_number not in", values, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberBetween(String value1, String value2) {
            addCriterion("manager_number between", value1, value2, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerNumberNotBetween(String value1, String value2) {
            addCriterion("manager_number not between", value1, value2, "managerNumber");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameIsNull() {
            addCriterion("manager_loginname is null");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameIsNotNull() {
            addCriterion("manager_loginname is not null");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameEqualTo(String value) {
            addCriterion("manager_loginname =", value, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameNotEqualTo(String value) {
            addCriterion("manager_loginname <>", value, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameGreaterThan(String value) {
            addCriterion("manager_loginname >", value, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_loginname >=", value, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameLessThan(String value) {
            addCriterion("manager_loginname <", value, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameLessThanOrEqualTo(String value) {
            addCriterion("manager_loginname <=", value, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameLike(String value) {
            addCriterion("manager_loginname like", value, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameNotLike(String value) {
            addCriterion("manager_loginname not like", value, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameIn(List<String> values) {
            addCriterion("manager_loginname in", values, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameNotIn(List<String> values) {
            addCriterion("manager_loginname not in", values, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameBetween(String value1, String value2) {
            addCriterion("manager_loginname between", value1, value2, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerLoginnameNotBetween(String value1, String value2) {
            addCriterion("manager_loginname not between", value1, value2, "managerLoginname");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIsNull() {
            addCriterion("manager_password is null");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIsNotNull() {
            addCriterion("manager_password is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordEqualTo(String value) {
            addCriterion("manager_password =", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotEqualTo(String value) {
            addCriterion("manager_password <>", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordGreaterThan(String value) {
            addCriterion("manager_password >", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("manager_password >=", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLessThan(String value) {
            addCriterion("manager_password <", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLessThanOrEqualTo(String value) {
            addCriterion("manager_password <=", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLike(String value) {
            addCriterion("manager_password like", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotLike(String value) {
            addCriterion("manager_password not like", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIn(List<String> values) {
            addCriterion("manager_password in", values, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotIn(List<String> values) {
            addCriterion("manager_password not in", values, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordBetween(String value1, String value2) {
            addCriterion("manager_password between", value1, value2, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotBetween(String value1, String value2) {
            addCriterion("manager_password not between", value1, value2, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNull() {
            addCriterion("manager_name is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("manager_name =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("manager_name <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("manager_name >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_name >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("manager_name <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("manager_name <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("manager_name like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("manager_name not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("manager_name in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("manager_name not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("manager_name between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("manager_name not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeIsNull() {
            addCriterion("manager_createtime is null");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeIsNotNull() {
            addCriterion("manager_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeEqualTo(Date value) {
            addCriterion("manager_createtime =", value, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeNotEqualTo(Date value) {
            addCriterion("manager_createtime <>", value, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeGreaterThan(Date value) {
            addCriterion("manager_createtime >", value, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("manager_createtime >=", value, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeLessThan(Date value) {
            addCriterion("manager_createtime <", value, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("manager_createtime <=", value, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeIn(List<Date> values) {
            addCriterion("manager_createtime in", values, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeNotIn(List<Date> values) {
            addCriterion("manager_createtime not in", values, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeBetween(Date value1, Date value2) {
            addCriterion("manager_createtime between", value1, value2, "managerCreatetime");
            return (Criteria) this;
        }

        public Criteria andManagerCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("manager_createtime not between", value1, value2, "managerCreatetime");
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