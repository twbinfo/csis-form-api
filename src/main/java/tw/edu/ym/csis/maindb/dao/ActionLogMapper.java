package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.ActionLog;
import tw.edu.ym.csis.maindb.model.ActionLogExample;

public interface ActionLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIONLOG
     *
     * @mbggenerated
     */
    int countByExample(ActionLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIONLOG
     *
     * @mbggenerated
     */
    int deleteByExample(ActionLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIONLOG
     *
     * @mbggenerated
     */
    int insert(ActionLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIONLOG
     *
     * @mbggenerated
     */
    int insertSelective(ActionLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIONLOG
     *
     * @mbggenerated
     */
    List<ActionLog> selectByExample(ActionLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIONLOG
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ActionLog record, @Param("example") ActionLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACTIONLOG
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ActionLog record, @Param("example") ActionLogExample example);
}