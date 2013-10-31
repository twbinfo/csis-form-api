package tw.edu.ym.csis.metadb.model;

public class DatatypeMap {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATATYPEMAP.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATATYPEMAP.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATATYPEMAP.ORACLETYPE
     *
     * @mbggenerated
     */
    private String oracletype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DATATYPEMAP.XMLTYPE
     *
     * @mbggenerated
     */
    private String xmltype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATATYPEMAP.ID
     *
     * @return the value of DATATYPEMAP.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATATYPEMAP.ID
     *
     * @param id the value for DATATYPEMAP.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATATYPEMAP.TYPE
     *
     * @return the value of DATATYPEMAP.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATATYPEMAP.TYPE
     *
     * @param type the value for DATATYPEMAP.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATATYPEMAP.ORACLETYPE
     *
     * @return the value of DATATYPEMAP.ORACLETYPE
     *
     * @mbggenerated
     */
    public String getOracletype() {
        return oracletype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATATYPEMAP.ORACLETYPE
     *
     * @param oracletype the value for DATATYPEMAP.ORACLETYPE
     *
     * @mbggenerated
     */
    public void setOracletype(String oracletype) {
        this.oracletype = oracletype == null ? null : oracletype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DATATYPEMAP.XMLTYPE
     *
     * @return the value of DATATYPEMAP.XMLTYPE
     *
     * @mbggenerated
     */
    public String getXmltype() {
        return xmltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DATATYPEMAP.XMLTYPE
     *
     * @param xmltype the value for DATATYPEMAP.XMLTYPE
     *
     * @mbggenerated
     */
    public void setXmltype(String xmltype) {
        this.xmltype = xmltype == null ? null : xmltype.trim();
    }
}