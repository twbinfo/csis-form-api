package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.ReeportDps;
import tw.edu.ym.csis.maindb.model.ReeportDpsExample;

public interface ReeportDpsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT_DPS
     *
     * @mbggenerated
     */
    int countByExample(ReeportDpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT_DPS
     *
     * @mbggenerated
     */
    int deleteByExample(ReeportDpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT_DPS
     *
     * @mbggenerated
     */
    int insert(ReeportDps record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT_DPS
     *
     * @mbggenerated
     */
    int insertSelective(ReeportDps record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT_DPS
     *
     * @mbggenerated
     */
    List<ReeportDps> selectByExample(ReeportDpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT_DPS
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ReeportDps record, @Param("example") ReeportDpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT_DPS
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ReeportDps record, @Param("example") ReeportDpsExample example);
}