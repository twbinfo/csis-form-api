package tw.edu.ym.csis.maindb.model;

public class Event {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EVENT.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EVENT.EVENT_TYPE
     *
     * @mbggenerated
     */
    private String eventType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EVENT.ID
     *
     * @return the value of EVENT.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EVENT.ID
     *
     * @param id the value for EVENT.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EVENT.EVENT_TYPE
     *
     * @return the value of EVENT.EVENT_TYPE
     *
     * @mbggenerated
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EVENT.EVENT_TYPE
     *
     * @param eventType the value for EVENT.EVENT_TYPE
     *
     * @mbggenerated
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }
}