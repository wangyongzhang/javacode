package com.keithlh.test.dao;

import com.keithlh.test.domain.Admin;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinyunlian_admin
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinyunlian_admin
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    int insert(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinyunlian_admin
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    int insertSelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinyunlian_admin
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    Admin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinyunlian_admin
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinyunlian_admin
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    int updateByPrimaryKey(Admin record);
}