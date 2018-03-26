package com.news.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIsNull() {
            addCriterion("user_loginname is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIsNotNull() {
            addCriterion("user_loginname is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameEqualTo(String value) {
            addCriterion("user_loginname =", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotEqualTo(String value) {
            addCriterion("user_loginname <>", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameGreaterThan(String value) {
            addCriterion("user_loginname >", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginname >=", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLessThan(String value) {
            addCriterion("user_loginname <", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLessThanOrEqualTo(String value) {
            addCriterion("user_loginname <=", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLike(String value) {
            addCriterion("user_loginname like", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotLike(String value) {
            addCriterion("user_loginname not like", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIn(List<String> values) {
            addCriterion("user_loginname in", values, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotIn(List<String> values) {
            addCriterion("user_loginname not in", values, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameBetween(String value1, String value2) {
            addCriterion("user_loginname between", value1, value2, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotBetween(String value1, String value2) {
            addCriterion("user_loginname not between", value1, value2, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNull() {
            addCriterion("user_createtime is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNotNull() {
            addCriterion("user_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeEqualTo(Date value) {
            addCriterion("user_createtime =", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotEqualTo(Date value) {
            addCriterion("user_createtime <>", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThan(Date value) {
            addCriterion("user_createtime >", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_createtime >=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThan(Date value) {
            addCriterion("user_createtime <", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("user_createtime <=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIn(List<Date> values) {
            addCriterion("user_createtime in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotIn(List<Date> values) {
            addCriterion("user_createtime not in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeBetween(Date value1, Date value2) {
            addCriterion("user_createtime between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("user_createtime not between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistIsNull() {
            addCriterion("user_blacklist is null");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistIsNotNull() {
            addCriterion("user_blacklist is not null");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistEqualTo(Integer value) {
            addCriterion("user_blacklist =", value, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistNotEqualTo(Integer value) {
            addCriterion("user_blacklist <>", value, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistGreaterThan(Integer value) {
            addCriterion("user_blacklist >", value, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_blacklist >=", value, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistLessThan(Integer value) {
            addCriterion("user_blacklist <", value, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistLessThanOrEqualTo(Integer value) {
            addCriterion("user_blacklist <=", value, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistIn(List<Integer> values) {
            addCriterion("user_blacklist in", values, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistNotIn(List<Integer> values) {
            addCriterion("user_blacklist not in", values, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistBetween(Integer value1, Integer value2) {
            addCriterion("user_blacklist between", value1, value2, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserBlacklistNotBetween(Integer value1, Integer value2) {
            addCriterion("user_blacklist not between", value1, value2, "userBlacklist");
            return (Criteria) this;
        }

        public Criteria andUserNavIsNull() {
            addCriterion("user_nav is null");
            return (Criteria) this;
        }

        public Criteria andUserNavIsNotNull() {
            addCriterion("user_nav is not null");
            return (Criteria) this;
        }

        public Criteria andUserNavEqualTo(String value) {
            addCriterion("user_nav =", value, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavNotEqualTo(String value) {
            addCriterion("user_nav <>", value, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavGreaterThan(String value) {
            addCriterion("user_nav >", value, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavGreaterThanOrEqualTo(String value) {
            addCriterion("user_nav >=", value, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavLessThan(String value) {
            addCriterion("user_nav <", value, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavLessThanOrEqualTo(String value) {
            addCriterion("user_nav <=", value, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavLike(String value) {
            addCriterion("user_nav like", value, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavNotLike(String value) {
            addCriterion("user_nav not like", value, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavIn(List<String> values) {
            addCriterion("user_nav in", values, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavNotIn(List<String> values) {
            addCriterion("user_nav not in", values, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavBetween(String value1, String value2) {
            addCriterion("user_nav between", value1, value2, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserNavNotBetween(String value1, String value2) {
            addCriterion("user_nav not between", value1, value2, "userNav");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorIsNull() {
            addCriterion("user_isauthor is null");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorIsNotNull() {
            addCriterion("user_isauthor is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorEqualTo(Integer value) {
            addCriterion("user_isauthor =", value, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorNotEqualTo(Integer value) {
            addCriterion("user_isauthor <>", value, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorGreaterThan(Integer value) {
            addCriterion("user_isauthor >", value, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_isauthor >=", value, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorLessThan(Integer value) {
            addCriterion("user_isauthor <", value, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorLessThanOrEqualTo(Integer value) {
            addCriterion("user_isauthor <=", value, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorIn(List<Integer> values) {
            addCriterion("user_isauthor in", values, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorNotIn(List<Integer> values) {
            addCriterion("user_isauthor not in", values, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorBetween(Integer value1, Integer value2) {
            addCriterion("user_isauthor between", value1, value2, "userIsauthor");
            return (Criteria) this;
        }

        public Criteria andUserIsauthorNotBetween(Integer value1, Integer value2) {
            addCriterion("user_isauthor not between", value1, value2, "userIsauthor");
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