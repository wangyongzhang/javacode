package com.Xcc.test.service.impl;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Properties;

import org.springframework.stereotype.Service;

import com.Xcc.test.bean.JavaInfo;
import com.Xcc.test.bean.SystemInfo;
import com.Xcc.test.service.SystemService;
import com.Xcc.utils.TimeUtils;

@Service
public class SystemServiceImpl implements SystemService{

	private InetAddress localHost = null;
	
	@Override
	public SystemInfo getSystemInfo() {
		SystemInfo systemInfo = new SystemInfo();
		try {
			localHost = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//get system's properties
		Properties properties = System.getProperties();
		systemInfo.setOperatingSystem(properties.getProperty("os.name"));
		systemInfo.setOSArchitecture(properties.getProperty("os.arch"));
		systemInfo.setOSVersion(properties.getProperty("os.version"));
		systemInfo.setMachineTime(TimeUtils.date2String1(new Date()));
		systemInfo.setIP(localHost.getHostAddress());
		systemInfo.setMAC(getMac());
		systemInfo.setMachineName(localHost.getHostName());
		return systemInfo;
	}
	
	@Override
	public JavaInfo getJavaInfo() {
		JavaInfo javaInfo = new JavaInfo();
		Properties properties = System.getProperties();
		javaInfo.setClassPath(properties.getProperty("java.class.path"));
		javaInfo.setClassVersion(properties.getProperty("java.class.version"));
		javaInfo.setHome(properties.getProperty("java.home"));
		javaInfo.setLibraryPath(properties.getProperty("java.library.path"));
		javaInfo.setTempFilePath(properties.getProperty("java.io.tmpdir"));
		javaInfo.setVendor(properties.getProperty("java.vendor"));
		javaInfo.setVerdorUrl(properties.getProperty("java.vendor.url"));
		javaInfo.setVersion(properties.getProperty("java.version"));
		return javaInfo;
	}
	
	private String getMac(){
		NetworkInterface byInetAddress;
		try {
            byInetAddress = NetworkInterface.getByInetAddress(localHost);
            byte[] hardwareAddress = byInetAddress.getHardwareAddress();
            return getMacFromBytes(hardwareAddress);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return null;
	}
	
	private  String getMacFromBytes(byte[] bytes)
    {
        StringBuffer mac=new StringBuffer();
        byte currentByte;
        boolean first=false;
        for (byte b : bytes) {
            if(first)
            {
                mac.append("-");    
            }
            currentByte=(byte)((b&240)>>4);
            mac.append(Integer.toHexString(currentByte));
            currentByte=(byte)(b&15);
            mac.append(Integer.toHexString(currentByte));
            first=true;
        }
        return mac.toString().toUpperCase();
    }

	

}
