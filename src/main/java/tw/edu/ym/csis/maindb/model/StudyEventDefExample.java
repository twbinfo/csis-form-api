package tw.edu.ym.csis.maindb.model;

import java.util.ArrayList;
import java.util.List;

public class StudyEventDefExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    public StudyEventDefExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
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
     * This method corresponds to the database table STUDYEVENTDEF
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
     * This method corresponds to the database table STUDYEVENTDEF
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STUDYEVENTDEF
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
     * This class corresponds to the database table STUDYEVENTDEF
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

        public Criteria andStudyplanidIsNull() {
            addCriterion("STUDYPLANID is null");
            return (Criteria) this;
        }

        public Criteria andStudyplanidIsNotNull() {
            addCriterion("STUDYPLANID is not null");
            return (Criteria) this;
        }

        public Criteria andStudyplanidEqualTo(Long value) {
            addCriterion("STUDYPLANID =", value, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidNotEqualTo(Long value) {
            addCriterion("STUDYPLANID <>", value, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidGreaterThan(Long value) {
            addCriterion("STUDYPLANID >", value, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidGreaterThanOrEqualTo(Long value) {
            addCriterion("STUDYPLANID >=", value, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidLessThan(Long value) {
            addCriterion("STUDYPLANID <", value, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidLessThanOrEqualTo(Long value) {
            addCriterion("STUDYPLANID <=", value, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidIn(List<Long> values) {
            addCriterion("STUDYPLANID in", values, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidNotIn(List<Long> values) {
            addCriterion("STUDYPLANID not in", values, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidBetween(Long value1, Long value2) {
            addCriterion("STUDYPLANID between", value1, value2, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andStudyplanidNotBetween(Long value1, Long value2) {
            addCriterion("STUDYPLANID not between", value1, value2, "studyplanid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andMaxrepeatIsNull() {
            addCriterion("MAXREPEAT is null");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatIsNotNull() {
            addCriterion("MAXREPEAT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatEqualTo(Long value) {
            addCriterion("MAXREPEAT =", value, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatNotEqualTo(Long value) {
            addCriterion("MAXREPEAT <>", value, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatGreaterThan(Long value) {
            addCriterion("MAXREPEAT >", value, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatGreaterThanOrEqualTo(Long value) {
            addCriterion("MAXREPEAT >=", value, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatLessThan(Long value) {
            addCriterion("MAXREPEAT <", value, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatLessThanOrEqualTo(Long value) {
            addCriterion("MAXREPEAT <=", value, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatIn(List<Long> values) {
            addCriterion("MAXREPEAT in", values, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatNotIn(List<Long> values) {
            addCriterion("MAXREPEAT not in", values, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatBetween(Long value1, Long value2) {
            addCriterion("MAXREPEAT between", value1, value2, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andMaxrepeatNotBetween(Long value1, Long value2) {
            addCriterion("MAXREPEAT not between", value1, value2, "maxrepeat");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeIsNull() {
            addCriterion("STUDYEVENTTYPECODE is null");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeIsNotNull() {
            addCriterion("STUDYEVENTTYPECODE is not null");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeEqualTo(String value) {
            addCriterion("STUDYEVENTTYPECODE =", value, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeNotEqualTo(String value) {
            addCriterion("STUDYEVENTTYPECODE <>", value, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeGreaterThan(String value) {
            addCriterion("STUDYEVENTTYPECODE >", value, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("STUDYEVENTTYPECODE >=", value, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeLessThan(String value) {
            addCriterion("STUDYEVENTTYPECODE <", value, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeLessThanOrEqualTo(String value) {
            addCriterion("STUDYEVENTTYPECODE <=", value, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeLike(String value) {
            addCriterion("STUDYEVENTTYPECODE like", value, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeNotLike(String value) {
            addCriterion("STUDYEVENTTYPECODE not like", value, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeIn(List<String> values) {
            addCriterion("STUDYEVENTTYPECODE in", values, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeNotIn(List<String> values) {
            addCriterion("STUDYEVENTTYPECODE not in", values, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeBetween(String value1, String value2) {
            addCriterion("STUDYEVENTTYPECODE between", value1, value2, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andStudyeventtypecodeNotBetween(String value1, String value2) {
            addCriterion("STUDYEVENTTYPECODE not between", value1, value2, "studyeventtypecode");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table STUDYEVENTDEF
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
     * This class corresponds to the database table STUDYEVENTDEF
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