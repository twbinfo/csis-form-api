package tw.edu.ym.csis.maindb.model;

import java.util.Date;

public class PatientRecruitAction {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTRECRUITACTION.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTRECRUITACTION.EVENTID
     *
     * @mbggenerated
     */
    private Long eventid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTRECRUITACTION.RECRUITSTEPID
     *
     * @mbggenerated
     */
    private Long recruitstepid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTRECRUITACTION.RECRUITPATIENTID
     *
     * @mbggenerated
     */
    private Long recruitpatientid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTRECRUITACTION.ACTION_DT
     *
     * @mbggenerated
     */
    private Date actionDt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTRECRUITACTION.FUTUREACTION_FLG
     *
     * @mbggenerated
     */
    private String futureactionFlg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTRECRUITACTION.ID
     *
     * @return the value of PATIENTRECRUITACTION.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTRECRUITACTION.ID
     *
     * @param id the value for PATIENTRECRUITACTION.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTRECRUITACTION.EVENTID
     *
     * @return the value of PATIENTRECRUITACTION.EVENTID
     *
     * @mbggenerated
     */
    public Long getEventid() {
        return eventid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTRECRUITACTION.EVENTID
     *
     * @param eventid the value for PATIENTRECRUITACTION.EVENTID
     *
     * @mbggenerated
     */
    public void setEventid(Long eventid) {
        this.eventid = eventid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTRECRUITACTION.RECRUITSTEPID
     *
     * @return the value of PATIENTRECRUITACTION.RECRUITSTEPID
     *
     * @mbggenerated
     */
    public Long getRecruitstepid() {
        return recruitstepid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTRECRUITACTION.RECRUITSTEPID
     *
     * @param recruitstepid the value for PATIENTRECRUITACTION.RECRUITSTEPID
     *
     * @mbggenerated
     */
    public void setRecruitstepid(Long recruitstepid) {
        this.recruitstepid = recruitstepid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTRECRUITACTION.RECRUITPATIENTID
     *
     * @return the value of PATIENTRECRUITACTION.RECRUITPATIENTID
     *
     * @mbggenerated
     */
    public Long getRecruitpatientid() {
        return recruitpatientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTRECRUITACTION.RECRUITPATIENTID
     *
     * @param recruitpatientid the value for PATIENTRECRUITACTION.RECRUITPATIENTID
     *
     * @mbggenerated
     */
    public void setRecruitpatientid(Long recruitpatientid) {
        this.recruitpatientid = recruitpatientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTRECRUITACTION.ACTION_DT
     *
     * @return the value of PATIENTRECRUITACTION.ACTION_DT
     *
     * @mbggenerated
     */
    public Date getActionDt() {
        return actionDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTRECRUITACTION.ACTION_DT
     *
     * @param actionDt the value for PATIENTRECRUITACTION.ACTION_DT
     *
     * @mbggenerated
     */
    public void setActionDt(Date actionDt) {
        this.actionDt = actionDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTRECRUITACTION.FUTUREACTION_FLG
     *
     * @return the value of PATIENTRECRUITACTION.FUTUREACTION_FLG
     *
     * @mbggenerated
     */
    public String getFutureactionFlg() {
        return futureactionFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTRECRUITACTION.FUTUREACTION_FLG
     *
     * @param futureactionFlg the value for PATIENTRECRUITACTION.FUTUREACTION_FLG
     *
     * @mbggenerated
     */
    public void setFutureactionFlg(String futureactionFlg) {
        this.futureactionFlg = futureactionFlg == null ? null : futureactionFlg.trim();
    }
}