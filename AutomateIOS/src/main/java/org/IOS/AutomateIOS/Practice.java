package org.IOS.AutomateIOS;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practice {
	
	public static void main( String[] args) throws MalformedURLException {

	
	//public void setUp() throws Exception {
	
	DesiredCapabilities capability = new DesiredCapabilities();
	capability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
	capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
	//IOS 10.2 and greater
	capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST); //XCUI framework
	capability.setCapability(MobileCapabilityType.APP, "//Users//smoorkothkayath//Desktop//UICatalog.app");
	IOSDriver<IOSElement> driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
	

	
	}
}
