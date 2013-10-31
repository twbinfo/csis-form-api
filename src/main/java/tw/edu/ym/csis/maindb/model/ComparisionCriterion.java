package tw.edu.ym.csis.maindb.model;

import java.math.BigDecimal;
import java.util.Date;

public class ComparisionCriterion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.SAVEDQUERYID
     *
     * @mbggenerated
     */
    private Long savedqueryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.CSISTABCOLUMNID
     *
     * @mbggenerated
     */
    private Long csistabcolumnid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.DATAPOINTID
     *
     * @mbggenerated
     */
    private Long datapointid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.QUESTIONID
     *
     * @mbggenerated
     */
    private Long questionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.COMPOPERATORCODE
     *
     * @mbggenerated
     */
    private String compoperatorcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.CHARACTERVALUE
     *
     * @mbggenerated
     */
    private String charactervalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.NUMERICALVALUE
     *
     * @mbggenerated
     */
    private BigDecimal numericalvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.DATEVALUE
     *
     * @mbggenerated
     */
    private Date datevalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.JOINCOLUMNID
     *
     * @mbggenerated
     */
    private Long joincolumnid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.SUBQUERYID
     *
     * @mbggenerated
     */
    private Long subqueryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.COMPCRITERIONNAME
     *
     * @mbggenerated
     */
    private String compcriterionname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMPARISONCRITERION.LOGEXPRESSIONID
     *
     * @mbggenerated
     */
    private Long logexpressionid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.ID
     *
     * @return the value of COMPARISONCRITERION.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.ID
     *
     * @param id the value for COMPARISONCRITERION.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.SAVEDQUERYID
     *
     * @return the value of COMPARISONCRITERION.SAVEDQUERYID
     *
     * @mbggenerated
     */
    public Long getSavedqueryid() {
        return savedqueryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.SAVEDQUERYID
     *
     * @param savedqueryid the value for COMPARISONCRITERION.SAVEDQUERYID
     *
     * @mbggenerated
     */
    public void setSavedqueryid(Long savedqueryid) {
        this.savedqueryid = savedqueryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.CSISTABCOLUMNID
     *
     * @return the value of COMPARISONCRITERION.CSISTABCOLUMNID
     *
     * @mbggenerated
     */
    public Long getCsistabcolumnid() {
        return csistabcolumnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.CSISTABCOLUMNID
     *
     * @param csistabcolumnid the value for COMPARISONCRITERION.CSISTABCOLUMNID
     *
     * @mbggenerated
     */
    public void setCsistabcolumnid(Long csistabcolumnid) {
        this.csistabcolumnid = csistabcolumnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.DATAPOINTID
     *
     * @return the value of COMPARISONCRITERION.DATAPOINTID
     *
     * @mbggenerated
     */
    public Long getDatapointid() {
        return datapointid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.DATAPOINTID
     *
     * @param datapointid the value for COMPARISONCRITERION.DATAPOINTID
     *
     * @mbggenerated
     */
    public void setDatapointid(Long datapointid) {
        this.datapointid = datapointid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.QUESTIONID
     *
     * @return the value of COMPARISONCRITERION.QUESTIONID
     *
     * @mbggenerated
     */
    public Long getQuestionid() {
        return questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.QUESTIONID
     *
     * @param questionid the value for COMPARISONCRITERION.QUESTIONID
     *
     * @mbggenerated
     */
    public void setQuestionid(Long questionid) {
        this.questionid = questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.COMPOPERATORCODE
     *
     * @return the value of COMPARISONCRITERION.COMPOPERATORCODE
     *
     * @mbggenerated
     */
    public String getCompoperatorcode() {
        return compoperatorcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.COMPOPERATORCODE
     *
     * @param compoperatorcode the value for COMPARISONCRITERION.COMPOPERATORCODE
     *
     * @mbggenerated
     */
    public void setCompoperatorcode(String compoperatorcode) {
        this.compoperatorcode = compoperatorcode == null ? null : compoperatorcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.CHARACTERVALUE
     *
     * @return the value of COMPARISONCRITERION.CHARACTERVALUE
     *
     * @mbggenerated
     */
    public String getCharactervalue() {
        return charactervalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.CHARACTERVALUE
     *
     * @param charactervalue the value for COMPARISONCRITERION.CHARACTERVALUE
     *
     * @mbggenerated
     */
    public void setCharactervalue(String charactervalue) {
        this.charactervalue = charactervalue == null ? null : charactervalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.NUMERICALVALUE
     *
     * @return the value of COMPARISONCRITERION.NUMERICALVALUE
     *
     * @mbggenerated
     */
    public BigDecimal getNumericalvalue() {
        return numericalvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.NUMERICALVALUE
     *
     * @param numericalvalue the value for COMPARISONCRITERION.NUMERICALVALUE
     *
     * @mbggenerated
     */
    public void setNumericalvalue(BigDecimal numericalvalue) {
        this.numericalvalue = numericalvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.DATEVALUE
     *
     * @return the value of COMPARISONCRITERION.DATEVALUE
     *
     * @mbggenerated
     */
    public Date getDatevalue() {
        return datevalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.DATEVALUE
     *
     * @param datevalue the value for COMPARISONCRITERION.DATEVALUE
     *
     * @mbggenerated
     */
    public void setDatevalue(Date datevalue) {
        this.datevalue = datevalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.JOINCOLUMNID
     *
     * @return the value of COMPARISONCRITERION.JOINCOLUMNID
     *
     * @mbggenerated
     */
    public Long getJoincolumnid() {
        return joincolumnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.JOINCOLUMNID
     *
     * @param joincolumnid the value for COMPARISONCRITERION.JOINCOLUMNID
     *
     * @mbggenerated
     */
    public void setJoincolumnid(Long joincolumnid) {
        this.joincolumnid = joincolumnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.SUBQUERYID
     *
     * @return the value of COMPARISONCRITERION.SUBQUERYID
     *
     * @mbggenerated
     */
    public Long getSubqueryid() {
        return subqueryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.SUBQUERYID
     *
     * @param subqueryid the value for COMPARISONCRITERION.SUBQUERYID
     *
     * @mbggenerated
     */
    public void setSubqueryid(Long subqueryid) {
        this.subqueryid = subqueryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.COMPCRITERIONNAME
     *
     * @return the value of COMPARISONCRITERION.COMPCRITERIONNAME
     *
     * @mbggenerated
     */
    public String getCompcriterionname() {
        return compcriterionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.COMPCRITERIONNAME
     *
     * @param compcriterionname the value for COMPARISONCRITERION.COMPCRITERIONNAME
     *
     * @mbggenerated
     */
    public void setCompcriterionname(String compcriterionname) {
        this.compcriterionname = compcriterionname == null ? null : compcriterionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMPARISONCRITERION.LOGEXPRESSIONID
     *
     * @return the value of COMPARISONCRITERION.LOGEXPRESSIONID
     *
     * @mbggenerated
     */
    public Long getLogexpressionid() {
        return logexpressionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMPARISONCRITERION.LOGEXPRESSIONID
     *
     * @param logexpressionid the value for COMPARISONCRITERION.LOGEXPRESSIONID
     *
     * @mbggenerated
     */
    public void setLogexpressionid(Long logexpressionid) {
        this.logexpressionid = logexpressionid;
    }
}