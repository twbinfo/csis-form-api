package tw.edu.ym.csis.maindb.model;

import java.util.Date;

public class Visit {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISIT.VISITDATE
     *
     * @mbggenerated
     */
    private Date visitdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISIT.FUTUREVISIT_FLG
     *
     * @mbggenerated
     */
    private String futurevisitFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISIT.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISIT.PCLPATIENTID
     *
     * @mbggenerated
     */
    private Long pclpatientid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISIT.EVENTID
     *
     * @mbggenerated
     */
    private Long eventid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VISIT.STUDYEVENTDEFID
     *
     * @mbggenerated
     */
    private Long studyeventdefid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VISIT.VISITDATE
     *
     * @return the value of VISIT.VISITDATE
     *
     * @mbggenerated
     */
    public Date getVisitdate() {
        return visitdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VISIT.VISITDATE
     *
     * @param visitdate the value for VISIT.VISITDATE
     *
     * @mbggenerated
     */
    public void setVisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VISIT.FUTUREVISIT_FLG
     *
     * @return the value of VISIT.FUTUREVISIT_FLG
     *
     * @mbggenerated
     */
    public String getFuturevisitFlg() {
        return futurevisitFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VISIT.FUTUREVISIT_FLG
     *
     * @param futurevisitFlg the value for VISIT.FUTUREVISIT_FLG
     *
     * @mbggenerated
     */
    public void setFuturevisitFlg(String futurevisitFlg) {
        this.futurevisitFlg = futurevisitFlg == null ? null : futurevisitFlg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VISIT.ID
     *
     * @return the value of VISIT.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VISIT.ID
     *
     * @param id the value for VISIT.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VISIT.PCLPATIENTID
     *
     * @return the value of VISIT.PCLPATIENTID
     *
     * @mbggenerated
     */
    public Long getPclpatientid() {
        return pclpatientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VISIT.PCLPATIENTID
     *
     * @param pclpatientid the value for VISIT.PCLPATIENTID
     *
     * @mbggenerated
     */
    public void setPclpatientid(Long pclpatientid) {
        this.pclpatientid = pclpatientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VISIT.EVENTID
     *
     * @return the value of VISIT.EVENTID
     *
     * @mbggenerated
     */
    public Long getEventid() {
        return eventid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VISIT.EVENTID
     *
     * @param eventid the value for VISIT.EVENTID
     *
     * @mbggenerated
     */
    public void setEventid(Long eventid) {
        this.eventid = eventid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VISIT.STUDYEVENTDEFID
     *
     * @return the value of VISIT.STUDYEVENTDEFID
     *
     * @mbggenerated
     */
    public Long getStudyeventdefid() {
        return studyeventdefid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VISIT.STUDYEVENTDEFID
     *
     * @param studyeventdefid the value for VISIT.STUDYEVENTDEFID
     *
     * @mbggenerated
     */
    public void setStudyeventdefid(Long studyeventdefid) {
        this.studyeventdefid = studyeventdefid;
    }
}