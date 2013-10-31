package tw.edu.ym.csis.maindb.model;

import java.util.Date;

public class DatapointDatarecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTDATARECORD.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTDATARECORD.DATAPOINTID
     *
     * @mbggenerated
     */
    private Long datapointid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTDATARECORD.DATARECORDID
     *
     * @mbggenerated
     */
    private Long datarecordid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTDATARECORD.VALUE
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTDATARECORD.CREATORID
     *
     * @mbggenerated
     */
    private String creatorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTDATARECORD.CREATEDDATE
     *
     * @mbggenerated
     */
    private Date createddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTDATARECORD.LASTUPDID
     *
     * @mbggenerated
     */
    private String lastupdid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTDATARECORD.LASTUPDDATE
     *
     * @mbggenerated
     */
    private Date lastupddate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTDATARECORD.ID
     *
     * @return the value of DATAPOINTDATARECORD.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTDATARECORD.ID
     *
     * @param id the value for DATAPOINTDATARECORD.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTDATARECORD.DATAPOINTID
     *
     * @return the value of DATAPOINTDATARECORD.DATAPOINTID
     *
     * @mbggenerated
     */
    public Long getDatapointid() {
        return datapointid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTDATARECORD.DATAPOINTID
     *
     * @param datapointid the value for DATAPOINTDATARECORD.DATAPOINTID
     *
     * @mbggenerated
     */
    public void setDatapointid(Long datapointid) {
        this.datapointid = datapointid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTDATARECORD.DATARECORDID
     *
     * @return the value of DATAPOINTDATARECORD.DATARECORDID
     *
     * @mbggenerated
     */
    public Long getDatarecordid() {
        return datarecordid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTDATARECORD.DATARECORDID
     *
     * @param datarecordid the value for DATAPOINTDATARECORD.DATARECORDID
     *
     * @mbggenerated
     */
    public void setDatarecordid(Long datarecordid) {
        this.datarecordid = datarecordid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTDATARECORD.VALUE
     *
     * @return the value of DATAPOINTDATARECORD.VALUE
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTDATARECORD.VALUE
     *
     * @param value the value for DATAPOINTDATARECORD.VALUE
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTDATARECORD.CREATORID
     *
     * @return the value of DATAPOINTDATARECORD.CREATORID
     *
     * @mbggenerated
     */
    public String getCreatorid() {
        return creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTDATARECORD.CREATORID
     *
     * @param creatorid the value for DATAPOINTDATARECORD.CREATORID
     *
     * @mbggenerated
     */
    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTDATARECORD.CREATEDDATE
     *
     * @return the value of DATAPOINTDATARECORD.CREATEDDATE
     *
     * @mbggenerated
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTDATARECORD.CREATEDDATE
     *
     * @param createddate the value for DATAPOINTDATARECORD.CREATEDDATE
     *
     * @mbggenerated
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTDATARECORD.LASTUPDID
     *
     * @return the value of DATAPOINTDATARECORD.LASTUPDID
     *
     * @mbggenerated
     */
    public String getLastupdid() {
        return lastupdid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTDATARECORD.LASTUPDID
     *
     * @param lastupdid the value for DATAPOINTDATARECORD.LASTUPDID
     *
     * @mbggenerated
     */
    public void setLastupdid(String lastupdid) {
        this.lastupdid = lastupdid == null ? null : lastupdid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTDATARECORD.LASTUPDDATE
     *
     * @return the value of DATAPOINTDATARECORD.LASTUPDDATE
     *
     * @mbggenerated
     */
    public Date getLastupddate() {
        return lastupddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTDATARECORD.LASTUPDDATE
     *
     * @param lastupddate the value for DATAPOINTDATARECORD.LASTUPDDATE
     *
     * @mbggenerated
     */
    public void setLastupddate(Date lastupddate) {
        this.lastupddate = lastupddate;
    }
}