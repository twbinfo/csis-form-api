package tw.edu.ym.csis.metadb.model;

public class Units {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNITS.UNIT
     *
     * @mbggenerated
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNITS.ABBREVIATION
     *
     * @mbggenerated
     */
    private String abbreviation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNITS.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNITS.UNIT
     *
     * @return the value of UNITS.UNIT
     *
     * @mbggenerated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNITS.UNIT
     *
     * @param unit the value for UNITS.UNIT
     *
     * @mbggenerated
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNITS.ABBREVIATION
     *
     * @return the value of UNITS.ABBREVIATION
     *
     * @mbggenerated
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNITS.ABBREVIATION
     *
     * @param abbreviation the value for UNITS.ABBREVIATION
     *
     * @mbggenerated
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNITS.ID
     *
     * @return the value of UNITS.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNITS.ID
     *
     * @param id the value for UNITS.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }
}