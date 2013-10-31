package tw.edu.ym.csis.metadb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkippingRuleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    public SkippingRuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
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
     * This method corresponds to the database table SKIPPINGRULE
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
     * This method corresponds to the database table SKIPPINGRULE
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKIPPINGRULE
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
     * This class corresponds to the database table SKIPPINGRULE
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFormversionidIsNull() {
            addCriterion("FORMVERSIONID is null");
            return (Criteria) this;
        }

        public Criteria andFormversionidIsNotNull() {
            addCriterion("FORMVERSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andFormversionidEqualTo(Long value) {
            addCriterion("FORMVERSIONID =", value, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidNotEqualTo(Long value) {
            addCriterion("FORMVERSIONID <>", value, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidGreaterThan(Long value) {
            addCriterion("FORMVERSIONID >", value, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidGreaterThanOrEqualTo(Long value) {
            addCriterion("FORMVERSIONID >=", value, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidLessThan(Long value) {
            addCriterion("FORMVERSIONID <", value, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidLessThanOrEqualTo(Long value) {
            addCriterion("FORMVERSIONID <=", value, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidIn(List<Long> values) {
            addCriterion("FORMVERSIONID in", values, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidNotIn(List<Long> values) {
            addCriterion("FORMVERSIONID not in", values, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidBetween(Long value1, Long value2) {
            addCriterion("FORMVERSIONID between", value1, value2, "formversionid");
            return (Criteria) this;
        }

        public Criteria andFormversionidNotBetween(Long value1, Long value2) {
            addCriterion("FORMVERSIONID not between", value1, value2, "formversionid");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionIsNull() {
            addCriterion("MASTEREXPRESSION is null");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionIsNotNull() {
            addCriterion("MASTEREXPRESSION is not null");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionEqualTo(String value) {
            addCriterion("MASTEREXPRESSION =", value, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionNotEqualTo(String value) {
            addCriterion("MASTEREXPRESSION <>", value, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionGreaterThan(String value) {
            addCriterion("MASTEREXPRESSION >", value, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionGreaterThanOrEqualTo(String value) {
            addCriterion("MASTEREXPRESSION >=", value, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionLessThan(String value) {
            addCriterion("MASTEREXPRESSION <", value, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionLessThanOrEqualTo(String value) {
            addCriterion("MASTEREXPRESSION <=", value, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionLike(String value) {
            addCriterion("MASTEREXPRESSION like", value, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionNotLike(String value) {
            addCriterion("MASTEREXPRESSION not like", value, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionIn(List<String> values) {
            addCriterion("MASTEREXPRESSION in", values, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionNotIn(List<String> values) {
            addCriterion("MASTEREXPRESSION not in", values, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionBetween(String value1, String value2) {
            addCriterion("MASTEREXPRESSION between", value1, value2, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andMasterexpressionNotBetween(String value1, String value2) {
            addCriterion("MASTEREXPRESSION not between", value1, value2, "masterexpression");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("CREATEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("CREATEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("CREATEDDATE =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("CREATEDDATE <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("CREATEDDATE >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDDATE >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("CREATEDDATE <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDDATE <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("CREATEDDATE in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("CREATEDDATE not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("CREATEDDATE between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDDATE not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("CREATORID is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("CREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(String value) {
            addCriterion("CREATORID =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(String value) {
            addCriterion("CREATORID <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(String value) {
            addCriterion("CREATORID >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORID >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(String value) {
            addCriterion("CREATORID <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(String value) {
            addCriterion("CREATORID <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLike(String value) {
            addCriterion("CREATORID like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotLike(String value) {
            addCriterion("CREATORID not like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<String> values) {
            addCriterion("CREATORID in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<String> values) {
            addCriterion("CREATORID not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(String value1, String value2) {
            addCriterion("CREATORID between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(String value1, String value2) {
            addCriterion("CREATORID not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andLastupddateIsNull() {
            addCriterion("LASTUPDDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastupddateIsNotNull() {
            addCriterion("LASTUPDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastupddateEqualTo(Date value) {
            addCriterion("LASTUPDDATE =", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotEqualTo(Date value) {
            addCriterion("LASTUPDDATE <>", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateGreaterThan(Date value) {
            addCriterion("LASTUPDDATE >", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTUPDDATE >=", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateLessThan(Date value) {
            addCriterion("LASTUPDDATE <", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateLessThanOrEqualTo(Date value) {
            addCriterion("LASTUPDDATE <=", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateIn(List<Date> values) {
            addCriterion("LASTUPDDATE in", values, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotIn(List<Date> values) {
            addCriterion("LASTUPDDATE not in", values, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateBetween(Date value1, Date value2) {
            addCriterion("LASTUPDDATE between", value1, value2, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotBetween(Date value1, Date value2) {
            addCriterion("LASTUPDDATE not between", value1, value2, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupdidIsNull() {
            addCriterion("LASTUPDID is null");
            return (Criteria) this;
        }

        public Criteria andLastupdidIsNotNull() {
            addCriterion("LASTUPDID is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdidEqualTo(String value) {
            addCriterion("LASTUPDID =", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidNotEqualTo(String value) {
            addCriterion("LASTUPDID <>", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidGreaterThan(String value) {
            addCriterion("LASTUPDID >", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDID >=", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidLessThan(String value) {
            addCriterion("LASTUPDID <", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDID <=", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidLike(String value) {
            addCriterion("LASTUPDID like", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidNotLike(String value) {
            addCriterion("LASTUPDID not like", value, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidIn(List<String> values) {
            addCriterion("LASTUPDID in", values, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidNotIn(List<String> values) {
            addCriterion("LASTUPDID not in", values, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidBetween(String value1, String value2) {
            addCriterion("LASTUPDID between", value1, value2, "lastupdid");
            return (Criteria) this;
        }

        public Criteria andLastupdidNotBetween(String value1, String value2) {
            addCriterion("LASTUPDID not between", value1, value2, "lastupdid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SKIPPINGRULE
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
     * This class corresponds to the database table SKIPPINGRULE
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