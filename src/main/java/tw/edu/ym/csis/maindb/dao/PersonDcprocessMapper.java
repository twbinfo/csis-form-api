package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.PersonDcprocess;
import tw.edu.ym.csis.maindb.model.PersonDcprocessExample;

public interface PersonDcprocessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSON_DCPROCESS
     *
     * @mbggenerated
     */
    int countByExample(PersonDcprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSON_DCPROCESS
     *
     * @mbggenerated
     */
    int deleteByExample(PersonDcprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSON_DCPROCESS
     *
     * @mbggenerated
     */
    int insert(PersonDcprocess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSON_DCPROCESS
     *
     * @mbggenerated
     */
    int insertSelective(PersonDcprocess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSON_DCPROCESS
     *
     * @mbggenerated
     */
    List<PersonDcprocess> selectByExample(PersonDcprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSON_DCPROCESS
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PersonDcprocess record, @Param("example") PersonDcprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSON_DCPROCESS
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PersonDcprocess record, @Param("example") PersonDcprocessExample example);
}