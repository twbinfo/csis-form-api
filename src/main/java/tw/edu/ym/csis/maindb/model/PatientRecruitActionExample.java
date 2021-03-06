package tw.edu.ym.csis.maindb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatientRecruitActionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    public PatientRecruitActionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
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
     * This method corresponds to the database table PATIENTRECRUITACTION
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
     * This method corresponds to the database table PATIENTRECRUITACTION
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTRECRUITACTION
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
     * This class corresponds to the database table PATIENTRECRUITACTION
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEventidIsNull() {
            addCriterion("EVENTID is null");
            return (Criteria) this;
        }

        public Criteria andEventidIsNotNull() {
            addCriterion("EVENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEventidEqualTo(Long value) {
            addCriterion("EVENTID =", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotEqualTo(Long value) {
            addCriterion("EVENTID <>", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThan(Long value) {
            addCriterion("EVENTID >", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThanOrEqualTo(Long value) {
            addCriterion("EVENTID >=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThan(Long value) {
            addCriterion("EVENTID <", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThanOrEqualTo(Long value) {
            addCriterion("EVENTID <=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidIn(List<Long> values) {
            addCriterion("EVENTID in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotIn(List<Long> values) {
            addCriterion("EVENTID not in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidBetween(Long value1, Long value2) {
            addCriterion("EVENTID between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotBetween(Long value1, Long value2) {
            addCriterion("EVENTID not between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidIsNull() {
            addCriterion("RECRUITSTEPID is null");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidIsNotNull() {
            addCriterion("RECRUITSTEPID is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidEqualTo(Long value) {
            addCriterion("RECRUITSTEPID =", value, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidNotEqualTo(Long value) {
            addCriterion("RECRUITSTEPID <>", value, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidGreaterThan(Long value) {
            addCriterion("RECRUITSTEPID >", value, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidGreaterThanOrEqualTo(Long value) {
            addCriterion("RECRUITSTEPID >=", value, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidLessThan(Long value) {
            addCriterion("RECRUITSTEPID <", value, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidLessThanOrEqualTo(Long value) {
            addCriterion("RECRUITSTEPID <=", value, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidIn(List<Long> values) {
            addCriterion("RECRUITSTEPID in", values, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidNotIn(List<Long> values) {
            addCriterion("RECRUITSTEPID not in", values, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidBetween(Long value1, Long value2) {
            addCriterion("RECRUITSTEPID between", value1, value2, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitstepidNotBetween(Long value1, Long value2) {
            addCriterion("RECRUITSTEPID not between", value1, value2, "recruitstepid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidIsNull() {
            addCriterion("RECRUITPATIENTID is null");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidIsNotNull() {
            addCriterion("RECRUITPATIENTID is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidEqualTo(Long value) {
            addCriterion("RECRUITPATIENTID =", value, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidNotEqualTo(Long value) {
            addCriterion("RECRUITPATIENTID <>", value, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidGreaterThan(Long value) {
            addCriterion("RECRUITPATIENTID >", value, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidGreaterThanOrEqualTo(Long value) {
            addCriterion("RECRUITPATIENTID >=", value, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidLessThan(Long value) {
            addCriterion("RECRUITPATIENTID <", value, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidLessThanOrEqualTo(Long value) {
            addCriterion("RECRUITPATIENTID <=", value, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidIn(List<Long> values) {
            addCriterion("RECRUITPATIENTID in", values, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidNotIn(List<Long> values) {
            addCriterion("RECRUITPATIENTID not in", values, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidBetween(Long value1, Long value2) {
            addCriterion("RECRUITPATIENTID between", value1, value2, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andRecruitpatientidNotBetween(Long value1, Long value2) {
            addCriterion("RECRUITPATIENTID not between", value1, value2, "recruitpatientid");
            return (Criteria) this;
        }

        public Criteria andActionDtIsNull() {
            addCriterion("ACTION_DT is null");
            return (Criteria) this;
        }

        public Criteria andActionDtIsNotNull() {
            addCriterion("ACTION_DT is not null");
            return (Criteria) this;
        }

        public Criteria andActionDtEqualTo(Date value) {
            addCriterionForJDBCDate("ACTION_DT =", value, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTION_DT <>", value, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTION_DT >", value, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTION_DT >=", value, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtLessThan(Date value) {
            addCriterionForJDBCDate("ACTION_DT <", value, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTION_DT <=", value, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtIn(List<Date> values) {
            addCriterionForJDBCDate("ACTION_DT in", values, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTION_DT not in", values, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTION_DT between", value1, value2, "actionDt");
            return (Criteria) this;
        }

        public Criteria andActionDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTION_DT not between", value1, value2, "actionDt");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgIsNull() {
            addCriterion("FUTUREACTION_FLG is null");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgIsNotNull() {
            addCriterion("FUTUREACTION_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgEqualTo(String value) {
            addCriterion("FUTUREACTION_FLG =", value, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgNotEqualTo(String value) {
            addCriterion("FUTUREACTION_FLG <>", value, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgGreaterThan(String value) {
            addCriterion("FUTUREACTION_FLG >", value, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgGreaterThanOrEqualTo(String value) {
            addCriterion("FUTUREACTION_FLG >=", value, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgLessThan(String value) {
            addCriterion("FUTUREACTION_FLG <", value, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgLessThanOrEqualTo(String value) {
            addCriterion("FUTUREACTION_FLG <=", value, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgLike(String value) {
            addCriterion("FUTUREACTION_FLG like", value, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgNotLike(String value) {
            addCriterion("FUTUREACTION_FLG not like", value, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgIn(List<String> values) {
            addCriterion("FUTUREACTION_FLG in", values, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgNotIn(List<String> values) {
            addCriterion("FUTUREACTION_FLG not in", values, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgBetween(String value1, String value2) {
            addCriterion("FUTUREACTION_FLG between", value1, value2, "futureactionFlg");
            return (Criteria) this;
        }

        public Criteria andFutureactionFlgNotBetween(String value1, String value2) {
            addCriterion("FUTUREACTION_FLG not between", value1, value2, "futureactionFlg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PATIENTRECRUITACTION
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
     * This class corresponds to the database table PATIENTRECRUITACTION
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