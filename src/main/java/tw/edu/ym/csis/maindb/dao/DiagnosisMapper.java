package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.Diagnosis;
import tw.edu.ym.csis.maindb.model.DiagnosisExample;

public interface DiagnosisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIAGNOSIS
     *
     * @mbggenerated
     */
    int countByExample(DiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIAGNOSIS
     *
     * @mbggenerated
     */
    int deleteByExample(DiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIAGNOSIS
     *
     * @mbggenerated
     */
    int insert(Diagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIAGNOSIS
     *
     * @mbggenerated
     */
    int insertSelective(Diagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIAGNOSIS
     *
     * @mbggenerated
     */
    List<Diagnosis> selectByExample(DiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIAGNOSIS
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIAGNOSIS
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);
}