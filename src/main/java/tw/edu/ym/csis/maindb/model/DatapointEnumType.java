package tw.edu.ym.csis.maindb.model;

public class DatapointEnumType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTENUMTYPE.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTENUMTYPE.VALUE
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTENUMTYPE.DISPLAYORDER
     *
     * @mbggenerated
     */
    private Long displayorder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTENUMTYPE.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATAPOINTENUMTYPE.DATAPOINTID
     *
     * @mbggenerated
     */
    private Long datapointid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTENUMTYPE.ID
     *
     * @return the value of DATAPOINTENUMTYPE.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTENUMTYPE.ID
     *
     * @param id the value for DATAPOINTENUMTYPE.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTENUMTYPE.VALUE
     *
     * @return the value of DATAPOINTENUMTYPE.VALUE
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTENUMTYPE.VALUE
     *
     * @param value the value for DATAPOINTENUMTYPE.VALUE
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTENUMTYPE.DISPLAYORDER
     *
     * @return the value of DATAPOINTENUMTYPE.DISPLAYORDER
     *
     * @mbggenerated
     */
    public Long getDisplayorder() {
        return displayorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTENUMTYPE.DISPLAYORDER
     *
     * @param displayorder the value for DATAPOINTENUMTYPE.DISPLAYORDER
     *
     * @mbggenerated
     */
    public void setDisplayorder(Long displayorder) {
        this.displayorder = displayorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTENUMTYPE.DESCRIPTION
     *
     * @return the value of DATAPOINTENUMTYPE.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTENUMTYPE.DESCRIPTION
     *
     * @param description the value for DATAPOINTENUMTYPE.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATAPOINTENUMTYPE.DATAPOINTID
     *
     * @return the value of DATAPOINTENUMTYPE.DATAPOINTID
     *
     * @mbggenerated
     */
    public Long getDatapointid() {
        return datapointid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATAPOINTENUMTYPE.DATAPOINTID
     *
     * @param datapointid the value for DATAPOINTENUMTYPE.DATAPOINTID
     *
     * @mbggenerated
     */
    public void setDatapointid(Long datapointid) {
        this.datapointid = datapointid;
    }
}