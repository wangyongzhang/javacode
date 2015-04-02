package com.Xcc.test.bean;

import java.io.Serializable;

public class JavaInfo implements Serializable{

	private static final long serialVersionUID = 2831894014419563840L;
	
	private String version;
	private String vendor;
	private String verdorUrl;
	private String home;
	private String classVersion;
	private String classPath;
	private String libraryPath;
	private String tempFilePath;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getVerdorUrl() {
		return verdorUrl;
	}
	public void setVerdorUrl(String verdorUrl) {
		this.verdorUrl = verdorUrl;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getClassVersion() {
		return classVersion;
	}
	public void setClassVersion(String classVersion) {
		this.classVersion = classVersion;
	}
	public String getClassPath() {
		return classPath;
	}
	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}
	public String getLibraryPath() {
		return libraryPath;
	}
	public void setLibraryPath(String libraryPath) {
		this.libraryPath = libraryPath;
	}
	public String getTempFilePath() {
		return tempFilePath;
	}
	public void setTempFilePath(String tempFilePath) {
		this.tempFilePath = tempFilePath;
	}
}
