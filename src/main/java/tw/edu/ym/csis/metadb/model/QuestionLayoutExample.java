package tw.edu.ym.csis.metadb.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionLayoutExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    public QuestionLayoutExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
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
     * This method corresponds to the database table QUESTIONLAYOUT
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
     * This method corresponds to the database table QUESTIONLAYOUT
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUESTIONLAYOUT
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
     * This class corresponds to the database table QUESTIONLAYOUT
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

        public Criteria andControlIsNull() {
            addCriterion("CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andControlIsNotNull() {
            addCriterion("CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andControlEqualTo(String value) {
            addCriterion("CONTROL =", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotEqualTo(String value) {
            addCriterion("CONTROL <>", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThan(String value) {
            addCriterion("CONTROL >", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROL >=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThan(String value) {
            addCriterion("CONTROL <", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThanOrEqualTo(String value) {
            addCriterion("CONTROL <=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLike(String value) {
            addCriterion("CONTROL like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotLike(String value) {
            addCriterion("CONTROL not like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlIn(List<String> values) {
            addCriterion("CONTROL in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotIn(List<String> values) {
            addCriterion("CONTROL not in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlBetween(String value1, String value2) {
            addCriterion("CONTROL between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotBetween(String value1, String value2) {
            addCriterion("CONTROL not between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andRownumberIsNull() {
            addCriterion("ROWNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRownumberIsNotNull() {
            addCriterion("ROWNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRownumberEqualTo(Short value) {
            addCriterion("ROWNUMBER =", value, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberNotEqualTo(Short value) {
            addCriterion("ROWNUMBER <>", value, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberGreaterThan(Short value) {
            addCriterion("ROWNUMBER >", value, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberGreaterThanOrEqualTo(Short value) {
            addCriterion("ROWNUMBER >=", value, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberLessThan(Short value) {
            addCriterion("ROWNUMBER <", value, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberLessThanOrEqualTo(Short value) {
            addCriterion("ROWNUMBER <=", value, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberIn(List<Short> values) {
            addCriterion("ROWNUMBER in", values, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberNotIn(List<Short> values) {
            addCriterion("ROWNUMBER not in", values, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberBetween(Short value1, Short value2) {
            addCriterion("ROWNUMBER between", value1, value2, "rownumber");
            return (Criteria) this;
        }

        public Criteria andRownumberNotBetween(Short value1, Short value2) {
            addCriterion("ROWNUMBER not between", value1, value2, "rownumber");
            return (Criteria) this;
        }

        public Criteria andColnumberIsNull() {
            addCriterion("COLNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andColnumberIsNotNull() {
            addCriterion("COLNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andColnumberEqualTo(Short value) {
            addCriterion("COLNUMBER =", value, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberNotEqualTo(Short value) {
            addCriterion("COLNUMBER <>", value, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberGreaterThan(Short value) {
            addCriterion("COLNUMBER >", value, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberGreaterThanOrEqualTo(Short value) {
            addCriterion("COLNUMBER >=", value, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberLessThan(Short value) {
            addCriterion("COLNUMBER <", value, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberLessThanOrEqualTo(Short value) {
            addCriterion("COLNUMBER <=", value, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberIn(List<Short> values) {
            addCriterion("COLNUMBER in", values, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberNotIn(List<Short> values) {
            addCriterion("COLNUMBER not in", values, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberBetween(Short value1, Short value2) {
            addCriterion("COLNUMBER between", value1, value2, "colnumber");
            return (Criteria) this;
        }

        public Criteria andColnumberNotBetween(Short value1, Short value2) {
            addCriterion("COLNUMBER not between", value1, value2, "colnumber");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNull() {
            addCriterion("QUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("QUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(Long value) {
            addCriterion("QUESTIONID =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(Long value) {
            addCriterion("QUESTIONID <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(Long value) {
            addCriterion("QUESTIONID >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(Long value) {
            addCriterion("QUESTIONID >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(Long value) {
            addCriterion("QUESTIONID <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(Long value) {
            addCriterion("QUESTIONID <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<Long> values) {
            addCriterion("QUESTIONID in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<Long> values) {
            addCriterion("QUESTIONID not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(Long value1, Long value2) {
            addCriterion("QUESTIONID between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(Long value1, Long value2) {
            addCriterion("QUESTIONID not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNull() {
            addCriterion("SECTIONID is null");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNotNull() {
            addCriterion("SECTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andSectionidEqualTo(Long value) {
            addCriterion("SECTIONID =", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotEqualTo(Long value) {
            addCriterion("SECTIONID <>", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThan(Long value) {
            addCriterion("SECTIONID >", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThanOrEqualTo(Long value) {
            addCriterion("SECTIONID >=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThan(Long value) {
            addCriterion("SECTIONID <", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThanOrEqualTo(Long value) {
            addCriterion("SECTIONID <=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidIn(List<Long> values) {
            addCriterion("SECTIONID in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotIn(List<Long> values) {
            addCriterion("SECTIONID not in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidBetween(Long value1, Long value2) {
            addCriterion("SECTIONID between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotBetween(Long value1, Long value2) {
            addCriterion("SECTIONID not between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Long value) {
            addCriterion("WIDTH =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Long value) {
            addCriterion("WIDTH <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Long value) {
            addCriterion("WIDTH >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("WIDTH >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Long value) {
            addCriterion("WIDTH <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Long value) {
            addCriterion("WIDTH <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Long> values) {
            addCriterion("WIDTH in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Long> values) {
            addCriterion("WIDTH not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Long value1, Long value2) {
            addCriterion("WIDTH between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Long value1, Long value2) {
            addCriterion("WIDTH not between", value1, value2, "width");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUESTIONLAYOUT
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
     * This class corresponds to the database table QUESTIONLAYOUT
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