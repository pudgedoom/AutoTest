package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class isElementPresent {
	public boolean isElementPresent(AndroidDriver driver, String position,String element)throws NoSuchElementException {
		try {
	        if(position=="id"){
	            	driver.findElementById(element);
	            }else if(position=="xpath"){
	            	driver.findElementByXPath(element);
	            }else if(position=="class"){
	            	driver.findElementByClassName(element);
	            }else if(position=="link_text"){
	            	driver.findElementByLinkText(element);
	            }else if(position=="name"){
	            	driver.findElementByName(element);
	            }else if(position=="css_selector"){
	            	driver.findElementByCssSelector(element);
	            }else if(position=="tag_name"){
	            	driver.findElementByTagName(element);
	            }else if(position=="content_desc"){
	            	driver.findElementsByAccessibilityId(element);
	            }
	        
			return true;
		} catch (Exception e) {
			return false;
		}
		
	} 
}
