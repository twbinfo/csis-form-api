package tw.edu.ym.csis.maindb.model;

import java.util.ArrayList;
import java.util.List;

public class PclGroupContentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    public PclGroupContentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
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
     * This method corresponds to the database table PCLGROUP_CONTENT
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
     * This method corresponds to the database table PCLGROUP_CONTENT
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PCLGROUP_CONTENT
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
     * This class corresponds to the database table PCLGROUP_CONTENT
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

        public Criteria andPclgroupIdIsNull() {
            addCriterion("PCLGROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdIsNotNull() {
            addCriterion("PCLGROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdEqualTo(Long value) {
            addCriterion("PCLGROUP_ID =", value, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdNotEqualTo(Long value) {
            addCriterion("PCLGROUP_ID <>", value, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdGreaterThan(Long value) {
            addCriterion("PCLGROUP_ID >", value, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PCLGROUP_ID >=", value, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdLessThan(Long value) {
            addCriterion("PCLGROUP_ID <", value, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdLessThanOrEqualTo(Long value) {
            addCriterion("PCLGROUP_ID <=", value, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdIn(List<Long> values) {
            addCriterion("PCLGROUP_ID in", values, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdNotIn(List<Long> values) {
            addCriterion("PCLGROUP_ID not in", values, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdBetween(Long value1, Long value2) {
            addCriterion("PCLGROUP_ID between", value1, value2, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andPclgroupIdNotBetween(Long value1, Long value2) {
            addCriterion("PCLGROUP_ID not between", value1, value2, "pclgroupId");
            return (Criteria) this;
        }

        public Criteria andProtocolnumIsNull() {
            addCriterion("PROTOCOLNUM is null");
            return (Criteria) this;
        }

        public Criteria andProtocolnumIsNotNull() {
            addCriterion("PROTOCOLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolnumEqualTo(String value) {
            addCriterion("PROTOCOLNUM =", value, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumNotEqualTo(String value) {
            addCriterion("PROTOCOLNUM <>", value, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumGreaterThan(String value) {
            addCriterion("PROTOCOLNUM >", value, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOLNUM >=", value, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumLessThan(String value) {
            addCriterion("PROTOCOLNUM <", value, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOLNUM <=", value, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumLike(String value) {
            addCriterion("PROTOCOLNUM like", value, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumNotLike(String value) {
            addCriterion("PROTOCOLNUM not like", value, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumIn(List<String> values) {
            addCriterion("PROTOCOLNUM in", values, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumNotIn(List<String> values) {
            addCriterion("PROTOCOLNUM not in", values, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumBetween(String value1, String value2) {
            addCriterion("PROTOCOLNUM between", value1, value2, "protocolnum");
            return (Criteria) this;
        }

        public Criteria andProtocolnumNotBetween(String value1, String value2) {
            addCriterion("PROTOCOLNUM not between", value1, value2, "protocolnum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PCLGROUP_CONTENT
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
     * This class corresponds to the database table PCLGROUP_CONTENT
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