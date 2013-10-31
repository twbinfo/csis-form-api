package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.PatientExtraID;
import tw.edu.ym.csis.maindb.model.PatientExtraIDExample;

public interface PatientExtraIDMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTEXTRAID
     *
     * @mbggenerated
     */
    int countByExample(PatientExtraIDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTEXTRAID
     *
     * @mbggenerated
     */
    int deleteByExample(PatientExtraIDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTEXTRAID
     *
     * @mbggenerated
     */
    int insert(PatientExtraID record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTEXTRAID
     *
     * @mbggenerated
     */
    int insertSelective(PatientExtraID record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTEXTRAID
     *
     * @mbggenerated
     */
    List<PatientExtraID> selectByExample(PatientExtraIDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTEXTRAID
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PatientExtraID record, @Param("example") PatientExtraIDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PATIENTEXTRAID
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PatientExtraID record, @Param("example") PatientExtraIDExample example);
}