package com.news.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewExample() {
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

        public Criteria andNewTitleIsNull() {
            addCriterion("new_title is null");
            return (Criteria) this;
        }

        public Criteria andNewTitleIsNotNull() {
            addCriterion("new_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewTitleEqualTo(String value) {
            addCriterion("new_title =", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleNotEqualTo(String value) {
            addCriterion("new_title <>", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleGreaterThan(String value) {
            addCriterion("new_title >", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleGreaterThanOrEqualTo(String value) {
            addCriterion("new_title >=", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleLessThan(String value) {
            addCriterion("new_title <", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleLessThanOrEqualTo(String value) {
            addCriterion("new_title <=", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleLike(String value) {
            addCriterion("new_title like", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleNotLike(String value) {
            addCriterion("new_title not like", value, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleIn(List<String> values) {
            addCriterion("new_title in", values, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleNotIn(List<String> values) {
            addCriterion("new_title not in", values, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleBetween(String value1, String value2) {
            addCriterion("new_title between", value1, value2, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewTitleNotBetween(String value1, String value2) {
            addCriterion("new_title not between", value1, value2, "newTitle");
            return (Criteria) this;
        }

        public Criteria andNewImgIsNull() {
            addCriterion("new_img is null");
            return (Criteria) this;
        }

        public Criteria andNewImgIsNotNull() {
            addCriterion("new_img is not null");
            return (Criteria) this;
        }

        public Criteria andNewImgEqualTo(String value) {
            addCriterion("new_img =", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgNotEqualTo(String value) {
            addCriterion("new_img <>", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgGreaterThan(String value) {
            addCriterion("new_img >", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgGreaterThanOrEqualTo(String value) {
            addCriterion("new_img >=", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgLessThan(String value) {
            addCriterion("new_img <", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgLessThanOrEqualTo(String value) {
            addCriterion("new_img <=", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgLike(String value) {
            addCriterion("new_img like", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgNotLike(String value) {
            addCriterion("new_img not like", value, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgIn(List<String> values) {
            addCriterion("new_img in", values, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgNotIn(List<String> values) {
            addCriterion("new_img not in", values, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgBetween(String value1, String value2) {
            addCriterion("new_img between", value1, value2, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewImgNotBetween(String value1, String value2) {
            addCriterion("new_img not between", value1, value2, "newImg");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeIsNull() {
            addCriterion("new_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeIsNotNull() {
            addCriterion("new_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeEqualTo(Date value) {
            addCriterion("new_createtime =", value, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeNotEqualTo(Date value) {
            addCriterion("new_createtime <>", value, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeGreaterThan(Date value) {
            addCriterion("new_createtime >", value, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("new_createtime >=", value, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeLessThan(Date value) {
            addCriterion("new_createtime <", value, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("new_createtime <=", value, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeIn(List<Date> values) {
            addCriterion("new_createtime in", values, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeNotIn(List<Date> values) {
            addCriterion("new_createtime not in", values, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeBetween(Date value1, Date value2) {
            addCriterion("new_createtime between", value1, value2, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("new_createtime not between", value1, value2, "newCreatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeIsNull() {
            addCriterion("new_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeIsNotNull() {
            addCriterion("new_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeEqualTo(Date value) {
            addCriterion("new_updatetime =", value, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeNotEqualTo(Date value) {
            addCriterion("new_updatetime <>", value, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeGreaterThan(Date value) {
            addCriterion("new_updatetime >", value, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("new_updatetime >=", value, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeLessThan(Date value) {
            addCriterion("new_updatetime <", value, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("new_updatetime <=", value, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeIn(List<Date> values) {
            addCriterion("new_updatetime in", values, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeNotIn(List<Date> values) {
            addCriterion("new_updatetime not in", values, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("new_updatetime between", value1, value2, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("new_updatetime not between", value1, value2, "newUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewPassIsNull() {
            addCriterion("new_pass is null");
            return (Criteria) this;
        }

        public Criteria andNewPassIsNotNull() {
            addCriterion("new_pass is not null");
            return (Criteria) this;
        }

        public Criteria andNewPassEqualTo(Integer value) {
            addCriterion("new_pass =", value, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassNotEqualTo(Integer value) {
            addCriterion("new_pass <>", value, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassGreaterThan(Integer value) {
            addCriterion("new_pass >", value, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_pass >=", value, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassLessThan(Integer value) {
            addCriterion("new_pass <", value, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassLessThanOrEqualTo(Integer value) {
            addCriterion("new_pass <=", value, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassIn(List<Integer> values) {
            addCriterion("new_pass in", values, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassNotIn(List<Integer> values) {
            addCriterion("new_pass not in", values, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassBetween(Integer value1, Integer value2) {
            addCriterion("new_pass between", value1, value2, "newPass");
            return (Criteria) this;
        }

        public Criteria andNewPassNotBetween(Integer value1, Integer value2) {
            addCriterion("new_pass not between", value1, value2, "newPass");
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

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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