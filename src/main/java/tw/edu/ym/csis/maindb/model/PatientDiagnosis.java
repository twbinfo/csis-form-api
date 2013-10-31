package tw.edu.ym.csis.maindb.model;

import java.util.Date;

public class PatientDiagnosis {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.DIAGNOSISID
     *
     * @mbggenerated
     */
    private Long diagnosisid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.ISPRIMARY
     *
     * @mbggenerated
     */
    private String isprimary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.CREATORID
     *
     * @mbggenerated
     */
    private String creatorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.CREATEDDATE
     *
     * @mbggenerated
     */
    private Date createddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.LASTUPDID
     *
     * @mbggenerated
     */
    private String lastupdid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.LASTUPDDATE
     *
     * @mbggenerated
     */
    private Date lastupddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.DIAGNOSISNOTE
     *
     * @mbggenerated
     */
    private String diagnosisnote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.SIDE_AFFECTED
     *
     * @mbggenerated
     */
    private String sideAffected;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.TRIGGERID
     *
     * @mbggenerated
     */
    private Long triggerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.TRIGGERNOTE
     *
     * @mbggenerated
     */
    private String triggernote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.PCLPATIENTID
     *
     * @mbggenerated
     */
    private Long pclpatientid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.PATIENTID
     *
     * @mbggenerated
     */
    private Long patientid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PATIENTDIAGNOSIS.CHIEF_COMPLAINT
     *
     * @mbggenerated
     */
    private byte[] chiefComplaint;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.ID
     *
     * @return the value of PATIENTDIAGNOSIS.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.ID
     *
     * @param id the value for PATIENTDIAGNOSIS.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.DIAGNOSISID
     *
     * @return the value of PATIENTDIAGNOSIS.DIAGNOSISID
     *
     * @mbggenerated
     */
    public Long getDiagnosisid() {
        return diagnosisid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.DIAGNOSISID
     *
     * @param diagnosisid the value for PATIENTDIAGNOSIS.DIAGNOSISID
     *
     * @mbggenerated
     */
    public void setDiagnosisid(Long diagnosisid) {
        this.diagnosisid = diagnosisid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.ISPRIMARY
     *
     * @return the value of PATIENTDIAGNOSIS.ISPRIMARY
     *
     * @mbggenerated
     */
    public String getIsprimary() {
        return isprimary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.ISPRIMARY
     *
     * @param isprimary the value for PATIENTDIAGNOSIS.ISPRIMARY
     *
     * @mbggenerated
     */
    public void setIsprimary(String isprimary) {
        this.isprimary = isprimary == null ? null : isprimary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.CREATORID
     *
     * @return the value of PATIENTDIAGNOSIS.CREATORID
     *
     * @mbggenerated
     */
    public String getCreatorid() {
        return creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.CREATORID
     *
     * @param creatorid the value for PATIENTDIAGNOSIS.CREATORID
     *
     * @mbggenerated
     */
    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.CREATEDDATE
     *
     * @return the value of PATIENTDIAGNOSIS.CREATEDDATE
     *
     * @mbggenerated
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.CREATEDDATE
     *
     * @param createddate the value for PATIENTDIAGNOSIS.CREATEDDATE
     *
     * @mbggenerated
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.LASTUPDID
     *
     * @return the value of PATIENTDIAGNOSIS.LASTUPDID
     *
     * @mbggenerated
     */
    public String getLastupdid() {
        return lastupdid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.LASTUPDID
     *
     * @param lastupdid the value for PATIENTDIAGNOSIS.LASTUPDID
     *
     * @mbggenerated
     */
    public void setLastupdid(String lastupdid) {
        this.lastupdid = lastupdid == null ? null : lastupdid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.LASTUPDDATE
     *
     * @return the value of PATIENTDIAGNOSIS.LASTUPDDATE
     *
     * @mbggenerated
     */
    public Date getLastupddate() {
        return lastupddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.LASTUPDDATE
     *
     * @param lastupddate the value for PATIENTDIAGNOSIS.LASTUPDDATE
     *
     * @mbggenerated
     */
    public void setLastupddate(Date lastupddate) {
        this.lastupddate = lastupddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.DIAGNOSISNOTE
     *
     * @return the value of PATIENTDIAGNOSIS.DIAGNOSISNOTE
     *
     * @mbggenerated
     */
    public String getDiagnosisnote() {
        return diagnosisnote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.DIAGNOSISNOTE
     *
     * @param diagnosisnote the value for PATIENTDIAGNOSIS.DIAGNOSISNOTE
     *
     * @mbggenerated
     */
    public void setDiagnosisnote(String diagnosisnote) {
        this.diagnosisnote = diagnosisnote == null ? null : diagnosisnote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.SIDE_AFFECTED
     *
     * @return the value of PATIENTDIAGNOSIS.SIDE_AFFECTED
     *
     * @mbggenerated
     */
    public String getSideAffected() {
        return sideAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.SIDE_AFFECTED
     *
     * @param sideAffected the value for PATIENTDIAGNOSIS.SIDE_AFFECTED
     *
     * @mbggenerated
     */
    public void setSideAffected(String sideAffected) {
        this.sideAffected = sideAffected == null ? null : sideAffected.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.TRIGGERID
     *
     * @return the value of PATIENTDIAGNOSIS.TRIGGERID
     *
     * @mbggenerated
     */
    public Long getTriggerid() {
        return triggerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.TRIGGERID
     *
     * @param triggerid the value for PATIENTDIAGNOSIS.TRIGGERID
     *
     * @mbggenerated
     */
    public void setTriggerid(Long triggerid) {
        this.triggerid = triggerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.TRIGGERNOTE
     *
     * @return the value of PATIENTDIAGNOSIS.TRIGGERNOTE
     *
     * @mbggenerated
     */
    public String getTriggernote() {
        return triggernote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.TRIGGERNOTE
     *
     * @param triggernote the value for PATIENTDIAGNOSIS.TRIGGERNOTE
     *
     * @mbggenerated
     */
    public void setTriggernote(String triggernote) {
        this.triggernote = triggernote == null ? null : triggernote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.PCLPATIENTID
     *
     * @return the value of PATIENTDIAGNOSIS.PCLPATIENTID
     *
     * @mbggenerated
     */
    public Long getPclpatientid() {
        return pclpatientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.PCLPATIENTID
     *
     * @param pclpatientid the value for PATIENTDIAGNOSIS.PCLPATIENTID
     *
     * @mbggenerated
     */
    public void setPclpatientid(Long pclpatientid) {
        this.pclpatientid = pclpatientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.PATIENTID
     *
     * @return the value of PATIENTDIAGNOSIS.PATIENTID
     *
     * @mbggenerated
     */
    public Long getPatientid() {
        return patientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.PATIENTID
     *
     * @param patientid the value for PATIENTDIAGNOSIS.PATIENTID
     *
     * @mbggenerated
     */
    public void setPatientid(Long patientid) {
        this.patientid = patientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PATIENTDIAGNOSIS.CHIEF_COMPLAINT
     *
     * @return the value of PATIENTDIAGNOSIS.CHIEF_COMPLAINT
     *
     * @mbggenerated
     */
    public byte[] getChiefComplaint() {
        return chiefComplaint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PATIENTDIAGNOSIS.CHIEF_COMPLAINT
     *
     * @param chiefComplaint the value for PATIENTDIAGNOSIS.CHIEF_COMPLAINT
     *
     * @mbggenerated
     */
    public void setChiefComplaint(byte[] chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }
}