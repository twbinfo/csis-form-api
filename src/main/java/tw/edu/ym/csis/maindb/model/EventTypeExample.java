package tw.edu.ym.csis.maindb.model;

import java.util.ArrayList;
import java.util.List;

public class EventTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public EventTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEventCodeIsNull() {
            addCriterion("EVENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEventCodeIsNotNull() {
            addCriterion("EVENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEventCodeEqualTo(String value) {
            addCriterion("EVENT_CODE =", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeNotEqualTo(String value) {
            addCriterion("EVENT_CODE <>", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeGreaterThan(String value) {
            addCriterion("EVENT_CODE >", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_CODE >=", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeLessThan(String value) {
            addCriterion("EVENT_CODE <", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeLessThanOrEqualTo(String value) {
            addCriterion("EVENT_CODE <=", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeLike(String value) {
            addCriterion("EVENT_CODE like", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeNotLike(String value) {
            addCriterion("EVENT_CODE not like", value, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeIn(List<String> values) {
            addCriterion("EVENT_CODE in", values, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeNotIn(List<String> values) {
            addCriterion("EVENT_CODE not in", values, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeBetween(String value1, String value2) {
            addCriterion("EVENT_CODE between", value1, value2, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventCodeNotBetween(String value1, String value2) {
            addCriterion("EVENT_CODE not between", value1, value2, "eventCode");
            return (Criteria) this;
        }

        public Criteria andEventDescIsNull() {
            addCriterion("EVENT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andEventDescIsNotNull() {
            addCriterion("EVENT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andEventDescEqualTo(String value) {
            addCriterion("EVENT_DESC =", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotEqualTo(String value) {
            addCriterion("EVENT_DESC <>", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescGreaterThan(String value) {
            addCriterion("EVENT_DESC >", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_DESC >=", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLessThan(String value) {
            addCriterion("EVENT_DESC <", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLessThanOrEqualTo(String value) {
            addCriterion("EVENT_DESC <=", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLike(String value) {
            addCriterion("EVENT_DESC like", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotLike(String value) {
            addCriterion("EVENT_DESC not like", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescIn(List<String> values) {
            addCriterion("EVENT_DESC in", values, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotIn(List<String> values) {
            addCriterion("EVENT_DESC not in", values, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescBetween(String value1, String value2) {
            addCriterion("EVENT_DESC between", value1, value2, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotBetween(String value1, String value2) {
            addCriterion("EVENT_DESC not between", value1, value2, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andIsPostedIsNull() {
            addCriterion("IS_POSTED is null");
            return (Criteria) this;
        }

        public Criteria andIsPostedIsNotNull() {
            addCriterion("IS_POSTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsPostedEqualTo(String value) {
            addCriterion("IS_POSTED =", value, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedNotEqualTo(String value) {
            addCriterion("IS_POSTED <>", value, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedGreaterThan(String value) {
            addCriterion("IS_POSTED >", value, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_POSTED >=", value, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedLessThan(String value) {
            addCriterion("IS_POSTED <", value, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedLessThanOrEqualTo(String value) {
            addCriterion("IS_POSTED <=", value, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedLike(String value) {
            addCriterion("IS_POSTED like", value, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedNotLike(String value) {
            addCriterion("IS_POSTED not like", value, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedIn(List<String> values) {
            addCriterion("IS_POSTED in", values, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedNotIn(List<String> values) {
            addCriterion("IS_POSTED not in", values, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedBetween(String value1, String value2) {
            addCriterion("IS_POSTED between", value1, value2, "isPosted");
            return (Criteria) this;
        }

        public Criteria andIsPostedNotBetween(String value1, String value2) {
            addCriterion("IS_POSTED not between", value1, value2, "isPosted");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(String value) {
            addCriterion("ACTIVE =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(String value) {
            addCriterion("ACTIVE <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(String value) {
            addCriterion("ACTIVE >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVE >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(String value) {
            addCriterion("ACTIVE <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(String value) {
            addCriterion("ACTIVE <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLike(String value) {
            addCriterion("ACTIVE like", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotLike(String value) {
            addCriterion("ACTIVE not like", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<String> values) {
            addCriterion("ACTIVE in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<String> values) {
            addCriterion("ACTIVE not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(String value1, String value2) {
            addCriterion("ACTIVE between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(String value1, String value2) {
            addCriterion("ACTIVE not between", value1, value2, "active");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table EVENT_TYPE
     *
     * @mbggenerated
     */
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