package tw.edu.ym.csis.maindb.model;

public class StudyEventDefForm {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYEVENTDEFFORM.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYEVENTDEFFORM.STUDYEVENTDEFID
     *
     * @mbggenerated
     */
    private Long studyeventdefid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYEVENTDEFFORM.FORMID
     *
     * @mbggenerated
     */
    private Long formid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYEVENTDEFFORM.REQUIRED_FLG
     *
     * @mbggenerated
     */
    private String requiredFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYEVENTDEFFORM.FORMORDER
     *
     * @mbggenerated
     */
    private Long formorder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STUDYEVENTDEFFORM.DEFAULTFORMVERSIONID
     *
     * @mbggenerated
     */
    private Long defaultformversionid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYEVENTDEFFORM.ID
     *
     * @return the value of STUDYEVENTDEFFORM.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYEVENTDEFFORM.ID
     *
     * @param id the value for STUDYEVENTDEFFORM.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYEVENTDEFFORM.STUDYEVENTDEFID
     *
     * @return the value of STUDYEVENTDEFFORM.STUDYEVENTDEFID
     *
     * @mbggenerated
     */
    public Long getStudyeventdefid() {
        return studyeventdefid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYEVENTDEFFORM.STUDYEVENTDEFID
     *
     * @param studyeventdefid the value for STUDYEVENTDEFFORM.STUDYEVENTDEFID
     *
     * @mbggenerated
     */
    public void setStudyeventdefid(Long studyeventdefid) {
        this.studyeventdefid = studyeventdefid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYEVENTDEFFORM.FORMID
     *
     * @return the value of STUDYEVENTDEFFORM.FORMID
     *
     * @mbggenerated
     */
    public Long getFormid() {
        return formid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYEVENTDEFFORM.FORMID
     *
     * @param formid the value for STUDYEVENTDEFFORM.FORMID
     *
     * @mbggenerated
     */
    public void setFormid(Long formid) {
        this.formid = formid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYEVENTDEFFORM.REQUIRED_FLG
     *
     * @return the value of STUDYEVENTDEFFORM.REQUIRED_FLG
     *
     * @mbggenerated
     */
    public String getRequiredFlg() {
        return requiredFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYEVENTDEFFORM.REQUIRED_FLG
     *
     * @param requiredFlg the value for STUDYEVENTDEFFORM.REQUIRED_FLG
     *
     * @mbggenerated
     */
    public void setRequiredFlg(String requiredFlg) {
        this.requiredFlg = requiredFlg == null ? null : requiredFlg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYEVENTDEFFORM.FORMORDER
     *
     * @return the value of STUDYEVENTDEFFORM.FORMORDER
     *
     * @mbggenerated
     */
    public Long getFormorder() {
        return formorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYEVENTDEFFORM.FORMORDER
     *
     * @param formorder the value for STUDYEVENTDEFFORM.FORMORDER
     *
     * @mbggenerated
     */
    public void setFormorder(Long formorder) {
        this.formorder = formorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDYEVENTDEFFORM.DEFAULTFORMVERSIONID
     *
     * @return the value of STUDYEVENTDEFFORM.DEFAULTFORMVERSIONID
     *
     * @mbggenerated
     */
    public Long getDefaultformversionid() {
        return defaultformversionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDYEVENTDEFFORM.DEFAULTFORMVERSIONID
     *
     * @param defaultformversionid the value for STUDYEVENTDEFFORM.DEFAULTFORMVERSIONID
     *
     * @mbggenerated
     */
    public void setDefaultformversionid(Long defaultformversionid) {
        this.defaultformversionid = defaultformversionid;
    }
}