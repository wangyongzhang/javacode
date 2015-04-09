package com.Xcc.test.bean;

import java.io.Serializable;

public class SystemInfo implements Serializable{
	
	private static final long serialVersionUID = 5828306197565571555L;
	
	private String machineName;
	private String IP;
	private String MAC;
	private String machineTime;
	private String operatingSystem;
	private String OSArchitecture;
	private String OSVersion;
	
	public String getMachineName() {
		return machineName;
	}
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getMAC() {
		return MAC;
	}
	public void setMAC(String mAC) {
		MAC = mAC;
	}
	public String getMachineTime() {
		return machineTime;
	}
	public void setMachineTime(String machineTime) {
		this.machineTime = machineTime;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getOSArchitecture() {
		return OSArchitecture;
	}
	public void setOSArchitecture(String oSArchitecture) {
		OSArchitecture = oSArchitecture;
	}
	public String getOSVersion() {
		return OSVersion;
	}
	public void setOSVersion(String oSVersion) {
		OSVersion = oSVersion;
	}
}
