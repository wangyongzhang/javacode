package com.Xcc.test.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public abstract class BaseBean implements Serializable {
	private static final long serialVersionUID = -2462510018255864550L;

    private Boolean           success          = Boolean.TRUE;

    private String            token;

    @DateTimeFormat(iso = ISO.DATE_TIME)
    private Date              systemTime;

    //存放bean参数不合法的error code(不返回前端，统一在切面中处理)
    private List<String>      errorCodeList    = new ArrayList<String>();

    public abstract void validate();

    @JsonProperty("systemTime")
    public Date getSystemTime() {
        return systemTime;
    }

    @JsonIgnore
    public void setSystemTime(Date systemTime) {
        this.systemTime = systemTime;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @JsonIgnore
    public List<String> getErrorCodeList() {
        return errorCodeList;
    }

    @JsonIgnore
    public void setErrorCodeList(List<String> errorCodeList) {
        this.errorCodeList = errorCodeList;
    }
	
	
}
