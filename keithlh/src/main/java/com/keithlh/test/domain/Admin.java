package com.keithlh.test.domain;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.id
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.create_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.modify_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.department
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private String department;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.email
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.is_enabled
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Boolean isEnabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.is_locked
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Boolean isLocked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.locked_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Date lockedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.login_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Date loginDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.login_failure_count
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Integer loginFailureCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.login_ip
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private String loginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.name
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.password
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.username
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.supplier
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Long supplier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.organization
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private Long organization;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xinyunlian_admin.phone
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xinyunlian_admin
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.id
     *
     * @return the value of xinyunlian_admin.id
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.id
     *
     * @param id the value for xinyunlian_admin.id
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.create_date
     *
     * @return the value of xinyunlian_admin.create_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.create_date
     *
     * @param createDate the value for xinyunlian_admin.create_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.modify_date
     *
     * @return the value of xinyunlian_admin.modify_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.modify_date
     *
     * @param modifyDate the value for xinyunlian_admin.modify_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.department
     *
     * @return the value of xinyunlian_admin.department
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.department
     *
     * @param department the value for xinyunlian_admin.department
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.email
     *
     * @return the value of xinyunlian_admin.email
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.email
     *
     * @param email the value for xinyunlian_admin.email
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.is_enabled
     *
     * @return the value of xinyunlian_admin.is_enabled
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.is_enabled
     *
     * @param isEnabled the value for xinyunlian_admin.is_enabled
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.is_locked
     *
     * @return the value of xinyunlian_admin.is_locked
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.is_locked
     *
     * @param isLocked the value for xinyunlian_admin.is_locked
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.locked_date
     *
     * @return the value of xinyunlian_admin.locked_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Date getLockedDate() {
        return lockedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.locked_date
     *
     * @param lockedDate the value for xinyunlian_admin.locked_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.login_date
     *
     * @return the value of xinyunlian_admin.login_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.login_date
     *
     * @param loginDate the value for xinyunlian_admin.login_date
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.login_failure_count
     *
     * @return the value of xinyunlian_admin.login_failure_count
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.login_failure_count
     *
     * @param loginFailureCount the value for xinyunlian_admin.login_failure_count
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.login_ip
     *
     * @return the value of xinyunlian_admin.login_ip
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.login_ip
     *
     * @param loginIp the value for xinyunlian_admin.login_ip
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.name
     *
     * @return the value of xinyunlian_admin.name
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.name
     *
     * @param name the value for xinyunlian_admin.name
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.password
     *
     * @return the value of xinyunlian_admin.password
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.password
     *
     * @param password the value for xinyunlian_admin.password
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.username
     *
     * @return the value of xinyunlian_admin.username
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.username
     *
     * @param username the value for xinyunlian_admin.username
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.supplier
     *
     * @return the value of xinyunlian_admin.supplier
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Long getSupplier() {
        return supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.supplier
     *
     * @param supplier the value for xinyunlian_admin.supplier
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setSupplier(Long supplier) {
        this.supplier = supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.organization
     *
     * @return the value of xinyunlian_admin.organization
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public Long getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.organization
     *
     * @param organization the value for xinyunlian_admin.organization
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setOrganization(Long organization) {
        this.organization = organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xinyunlian_admin.phone
     *
     * @return the value of xinyunlian_admin.phone
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xinyunlian_admin.phone
     *
     * @param phone the value for xinyunlian_admin.phone
     *
     * @mbggenerated Thu Apr 16 16:00:42 CST 2015
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}