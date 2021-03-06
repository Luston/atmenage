package com.at.dao;

import com.at.pojo.tUser;
import com.at.pojo.tUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Mar 19 09:34:15 CST 2018
     */
    int countByExample(tUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Mar 19 09:34:15 CST 2018
     */
    int deleteByExample(tUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Mar 19 09:34:15 CST 2018
     */
    int insert(tUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Mar 19 09:34:15 CST 2018
     */
    int insertSelective(tUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Mar 19 09:34:15 CST 2018
     */
    List<tUser> selectByExample(tUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Mar 19 09:34:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") tUser record, @Param("example") tUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Mar 19 09:34:15 CST 2018
     */
    int updateByExample(@Param("record") tUser record, @Param("example") tUserExample example);

    int checkLogin(tUser tuser);
}