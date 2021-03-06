package tw.edu.ym.csis.maindb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tw.edu.ym.csis.maindb.model.Site;
import tw.edu.ym.csis.maindb.model.SiteExample;

public interface SiteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SITE
     *
     * @mbggenerated
     */
    int countByExample(SiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SITE
     *
     * @mbggenerated
     */
    int deleteByExample(SiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SITE
     *
     * @mbggenerated
     */
    int insert(Site record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SITE
     *
     * @mbggenerated
     */
    int insertSelective(Site record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SITE
     *
     * @mbggenerated
     */
    List<Site> selectByExample(SiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SITE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Site record, @Param("example") SiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SITE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Site record, @Param("example") SiteExample example);
}