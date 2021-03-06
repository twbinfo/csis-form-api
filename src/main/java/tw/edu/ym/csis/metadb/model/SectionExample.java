package tw.edu.ym.csis.metadb.model;

import java.util.ArrayList;
import java.util.List;

public class SectionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    public SectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
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
     * This method corresponds to the database table SECTION
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
     * This method corresponds to the database table SECTION
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SECTION
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
     * This class corresponds to the database table SECTION
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

        public Criteria andSectionnameIsNull() {
            addCriterion("SECTIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andSectionnameIsNotNull() {
            addCriterion("SECTIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSectionnameEqualTo(String value) {
            addCriterion("SECTIONNAME =", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotEqualTo(String value) {
            addCriterion("SECTIONNAME <>", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameGreaterThan(String value) {
            addCriterion("SECTIONNAME >", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameGreaterThanOrEqualTo(String value) {
            addCriterion("SECTIONNAME >=", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLessThan(String value) {
            addCriterion("SECTIONNAME <", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLessThanOrEqualTo(String value) {
            addCriterion("SECTIONNAME <=", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLike(String value) {
            addCriterion("SECTIONNAME like", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotLike(String value) {
            addCriterion("SECTIONNAME not like", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameIn(List<String> values) {
            addCriterion("SECTIONNAME in", values, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotIn(List<String> values) {
            addCriterion("SECTIONNAME not in", values, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameBetween(String value1, String value2) {
            addCriterion("SECTIONNAME between", value1, value2, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotBetween(String value1, String value2) {
            addCriterion("SECTIONNAME not between", value1, value2, "sectionname");
            return (Criteria) this;
        }

        public Criteria andNumrowsIsNull() {
            addCriterion("NUMROWS is null");
            return (Criteria) this;
        }

        public Criteria andNumrowsIsNotNull() {
            addCriterion("NUMROWS is not null");
            return (Criteria) this;
        }

        public Criteria andNumrowsEqualTo(Long value) {
            addCriterion("NUMROWS =", value, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsNotEqualTo(Long value) {
            addCriterion("NUMROWS <>", value, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsGreaterThan(Long value) {
            addCriterion("NUMROWS >", value, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsGreaterThanOrEqualTo(Long value) {
            addCriterion("NUMROWS >=", value, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsLessThan(Long value) {
            addCriterion("NUMROWS <", value, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsLessThanOrEqualTo(Long value) {
            addCriterion("NUMROWS <=", value, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsIn(List<Long> values) {
            addCriterion("NUMROWS in", values, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsNotIn(List<Long> values) {
            addCriterion("NUMROWS not in", values, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsBetween(Long value1, Long value2) {
            addCriterion("NUMROWS between", value1, value2, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumrowsNotBetween(Long value1, Long value2) {
            addCriterion("NUMROWS not between", value1, value2, "numrows");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsIsNull() {
            addCriterion("NUMCOLUMNS is null");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsIsNotNull() {
            addCriterion("NUMCOLUMNS is not null");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsEqualTo(Long value) {
            addCriterion("NUMCOLUMNS =", value, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsNotEqualTo(Long value) {
            addCriterion("NUMCOLUMNS <>", value, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsGreaterThan(Long value) {
            addCriterion("NUMCOLUMNS >", value, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsGreaterThanOrEqualTo(Long value) {
            addCriterion("NUMCOLUMNS >=", value, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsLessThan(Long value) {
            addCriterion("NUMCOLUMNS <", value, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsLessThanOrEqualTo(Long value) {
            addCriterion("NUMCOLUMNS <=", value, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsIn(List<Long> values) {
            addCriterion("NUMCOLUMNS in", values, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsNotIn(List<Long> values) {
            addCriterion("NUMCOLUMNS not in", values, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsBetween(Long value1, Long value2) {
            addCriterion("NUMCOLUMNS between", value1, value2, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andNumcolumnsNotBetween(Long value1, Long value2) {
            addCriterion("NUMCOLUMNS not between", value1, value2, "numcolumns");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("STYLE is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("STYLE =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("STYLE <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("STYLE >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("STYLE <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("STYLE <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("STYLE like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("STYLE not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("STYLE in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("STYLE not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("STYLE between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("STYLE not between", value1, value2, "style");
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

        public Criteria andLayoutsequenceIsNull() {
            addCriterion("LAYOUTSEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceIsNotNull() {
            addCriterion("LAYOUTSEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceEqualTo(Long value) {
            addCriterion("LAYOUTSEQUENCE =", value, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceNotEqualTo(Long value) {
            addCriterion("LAYOUTSEQUENCE <>", value, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceGreaterThan(Long value) {
            addCriterion("LAYOUTSEQUENCE >", value, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceGreaterThanOrEqualTo(Long value) {
            addCriterion("LAYOUTSEQUENCE >=", value, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceLessThan(Long value) {
            addCriterion("LAYOUTSEQUENCE <", value, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceLessThanOrEqualTo(Long value) {
            addCriterion("LAYOUTSEQUENCE <=", value, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceIn(List<Long> values) {
            addCriterion("LAYOUTSEQUENCE in", values, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceNotIn(List<Long> values) {
            addCriterion("LAYOUTSEQUENCE not in", values, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceBetween(Long value1, Long value2) {
            addCriterion("LAYOUTSEQUENCE between", value1, value2, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andLayoutsequenceNotBetween(Long value1, Long value2) {
            addCriterion("LAYOUTSEQUENCE not between", value1, value2, "layoutsequence");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIsNull() {
            addCriterion("SECTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIsNotNull() {
            addCriterion("SECTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSectioncodeEqualTo(String value) {
            addCriterion("SECTIONCODE =", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotEqualTo(String value) {
            addCriterion("SECTIONCODE <>", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeGreaterThan(String value) {
            addCriterion("SECTIONCODE >", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("SECTIONCODE >=", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLessThan(String value) {
            addCriterion("SECTIONCODE <", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLessThanOrEqualTo(String value) {
            addCriterion("SECTIONCODE <=", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLike(String value) {
            addCriterion("SECTIONCODE like", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotLike(String value) {
            addCriterion("SECTIONCODE not like", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIn(List<String> values) {
            addCriterion("SECTIONCODE in", values, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotIn(List<String> values) {
            addCriterion("SECTIONCODE not in", values, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeBetween(String value1, String value2) {
            addCriterion("SECTIONCODE between", value1, value2, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotBetween(String value1, String value2) {
            addCriterion("SECTIONCODE not between", value1, value2, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andLabelwidthIsNull() {
            addCriterion("LABELWIDTH is null");
            return (Criteria) this;
        }

        public Criteria andLabelwidthIsNotNull() {
            addCriterion("LABELWIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andLabelwidthEqualTo(Long value) {
            addCriterion("LABELWIDTH =", value, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthNotEqualTo(Long value) {
            addCriterion("LABELWIDTH <>", value, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthGreaterThan(Long value) {
            addCriterion("LABELWIDTH >", value, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthGreaterThanOrEqualTo(Long value) {
            addCriterion("LABELWIDTH >=", value, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthLessThan(Long value) {
            addCriterion("LABELWIDTH <", value, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthLessThanOrEqualTo(Long value) {
            addCriterion("LABELWIDTH <=", value, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthIn(List<Long> values) {
            addCriterion("LABELWIDTH in", values, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthNotIn(List<Long> values) {
            addCriterion("LABELWIDTH not in", values, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthBetween(Long value1, Long value2) {
            addCriterion("LABELWIDTH between", value1, value2, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andLabelwidthNotBetween(Long value1, Long value2) {
            addCriterion("LABELWIDTH not between", value1, value2, "labelwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthIsNull() {
            addCriterion("INPUTWIDTH is null");
            return (Criteria) this;
        }

        public Criteria andInputwidthIsNotNull() {
            addCriterion("INPUTWIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andInputwidthEqualTo(Long value) {
            addCriterion("INPUTWIDTH =", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthNotEqualTo(Long value) {
            addCriterion("INPUTWIDTH <>", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthGreaterThan(Long value) {
            addCriterion("INPUTWIDTH >", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthGreaterThanOrEqualTo(Long value) {
            addCriterion("INPUTWIDTH >=", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthLessThan(Long value) {
            addCriterion("INPUTWIDTH <", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthLessThanOrEqualTo(Long value) {
            addCriterion("INPUTWIDTH <=", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthIn(List<Long> values) {
            addCriterion("INPUTWIDTH in", values, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthNotIn(List<Long> values) {
            addCriterion("INPUTWIDTH not in", values, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthBetween(Long value1, Long value2) {
            addCriterion("INPUTWIDTH between", value1, value2, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthNotBetween(Long value1, Long value2) {
            addCriterion("INPUTWIDTH not between", value1, value2, "inputwidth");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SECTION
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
     * This class corresponds to the database table SECTION
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