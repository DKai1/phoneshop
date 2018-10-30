package com.qst.PhoneShop.model;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPhonenameIsNull() {
            addCriterion("phonename is null");
            return (Criteria) this;
        }

        public Criteria andPhonenameIsNotNull() {
            addCriterion("phonename is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenameEqualTo(String value) {
            addCriterion("phonename =", value, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameNotEqualTo(String value) {
            addCriterion("phonename <>", value, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameGreaterThan(String value) {
            addCriterion("phonename >", value, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameGreaterThanOrEqualTo(String value) {
            addCriterion("phonename >=", value, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameLessThan(String value) {
            addCriterion("phonename <", value, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameLessThanOrEqualTo(String value) {
            addCriterion("phonename <=", value, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameLike(String value) {
            addCriterion("phonename like", value, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameNotLike(String value) {
            addCriterion("phonename not like", value, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameIn(List<String> values) {
            addCriterion("phonename in", values, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameNotIn(List<String> values) {
            addCriterion("phonename not in", values, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameBetween(String value1, String value2) {
            addCriterion("phonename between", value1, value2, "phonename");
            return (Criteria) this;
        }

        public Criteria andPhonenameNotBetween(String value1, String value2) {
            addCriterion("phonename not between", value1, value2, "phonename");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPhoneimgIsNull() {
            addCriterion("phoneImg is null");
            return (Criteria) this;
        }

        public Criteria andPhoneimgIsNotNull() {
            addCriterion("phoneImg is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneimgEqualTo(Integer value) {
            addCriterion("phoneImg =", value, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgNotEqualTo(Integer value) {
            addCriterion("phoneImg <>", value, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgGreaterThan(Integer value) {
            addCriterion("phoneImg >", value, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgGreaterThanOrEqualTo(Integer value) {
            addCriterion("phoneImg >=", value, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgLessThan(Integer value) {
            addCriterion("phoneImg <", value, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgLessThanOrEqualTo(Integer value) {
            addCriterion("phoneImg <=", value, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgIn(List<Integer> values) {
            addCriterion("phoneImg in", values, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgNotIn(List<Integer> values) {
            addCriterion("phoneImg not in", values, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgBetween(Integer value1, Integer value2) {
            addCriterion("phoneImg between", value1, value2, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andPhoneimgNotBetween(Integer value1, Integer value2) {
            addCriterion("phoneImg not between", value1, value2, "phoneimg");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksIsNull() {
            addCriterion("commodityStocks is null");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksIsNotNull() {
            addCriterion("commodityStocks is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksEqualTo(Integer value) {
            addCriterion("commodityStocks =", value, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksNotEqualTo(Integer value) {
            addCriterion("commodityStocks <>", value, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksGreaterThan(Integer value) {
            addCriterion("commodityStocks >", value, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityStocks >=", value, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksLessThan(Integer value) {
            addCriterion("commodityStocks <", value, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksLessThanOrEqualTo(Integer value) {
            addCriterion("commodityStocks <=", value, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksIn(List<Integer> values) {
            addCriterion("commodityStocks in", values, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksNotIn(List<Integer> values) {
            addCriterion("commodityStocks not in", values, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksBetween(Integer value1, Integer value2) {
            addCriterion("commodityStocks between", value1, value2, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andCommoditystocksNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityStocks not between", value1, value2, "commoditystocks");
            return (Criteria) this;
        }

        public Criteria andSellnumIsNull() {
            addCriterion("sellNum is null");
            return (Criteria) this;
        }

        public Criteria andSellnumIsNotNull() {
            addCriterion("sellNum is not null");
            return (Criteria) this;
        }

        public Criteria andSellnumEqualTo(Integer value) {
            addCriterion("sellNum =", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotEqualTo(Integer value) {
            addCriterion("sellNum <>", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumGreaterThan(Integer value) {
            addCriterion("sellNum >", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellNum >=", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumLessThan(Integer value) {
            addCriterion("sellNum <", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumLessThanOrEqualTo(Integer value) {
            addCriterion("sellNum <=", value, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumIn(List<Integer> values) {
            addCriterion("sellNum in", values, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotIn(List<Integer> values) {
            addCriterion("sellNum not in", values, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumBetween(Integer value1, Integer value2) {
            addCriterion("sellNum between", value1, value2, "sellnum");
            return (Criteria) this;
        }

        public Criteria andSellnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sellNum not between", value1, value2, "sellnum");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("category not between", value1, value2, "category");
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