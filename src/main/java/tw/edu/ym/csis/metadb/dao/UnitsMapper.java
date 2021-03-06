package tw.edu.ym.csis.metadb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.metadb.model.Units;
import tw.edu.ym.csis.metadb.model.UnitsExample;

public interface UnitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNITS
     *
     * @mbggenerated
     */
    int countByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNITS
     *
     * @mbggenerated
     */
    int deleteByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNITS
     *
     * @mbggenerated
     */
    int insert(Units record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNITS
     *
     * @mbggenerated
     */
    int insertSelective(Units record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNITS
     *
     * @mbggenerated
     */
    List<Units> selectByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNITS
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Units record, @Param("example") UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNITS
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Units record, @Param("example") UnitsExample example);
}