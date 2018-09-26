package init;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sun.jndi.toolkit.ctx.Continuation;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import tools.isElementPresent;

public class init {
	public static AndroidDriver driver=null;
//	 public static void main(String[] args){
////		 init();
//		 skip();
////		 removeApp();
//	 }

	public static  AndroidDriver initDriver(){		

		DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI MLA-AL10");//关于本机能查看到
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "4.4.2");
        capabilities.setCapability("app","F:\\XiaoLiuAquatic-v6.03-20180823155916.apk");//安装包，每次都安装
        capabilities.setCapability("noReset","True");//不会每次都重装。
        capabilities.setCapability("appPackage", "com.fuzhong.xiaoliuaquatic");
        capabilities.setCapability("unicodeKeyboard", "True");//控制中文
        capabilities.setCapability("resetKeyboard", "True");//控制中文
//        capabilities.setCapability("appActivity","com.fuzhong.xiaoliuaquatic.ui.main.MainActivity");//找开发要或是第一个activity


		try {
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;	
		
	}

	
//跳过广告
	public  void skip(){
		AndroidDriver driver=init.initDriver();
		try {
			Thread.sleep(5000);//不等待找不到元素
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4秒页
		if(new isElementPresent().isElementPresent(driver,"id","com.fuzhong.xiaoliuaquatic:id/timeTextView")){
			 driver.findElementById("com.fuzhong.xiaoliuaquatic:id/timeTextView").click();
		}

		 
		//选择买卖家,不重装不用选
		 if(new isElementPresent().isElementPresent(driver,"xpath","//android.widget.ImageView[@resource-id='com.fuzhong.xiaoliuaquatic:id/choose_sell']")){
			 driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.fuzhong.xiaoliuaquatic:id/choose_sell']")).click();
		 }
			try {
				Thread.sleep(2000);//不等待找不到元素
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(4000);//不等待找不到元素
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
		//不升级
	 if(new isElementPresent().isElementPresent(driver,"xpath","//android.widget.Button[@resource-id='com.fuzhong.xiaoliuaquatic:id/btn_no']")){
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.fuzhong.xiaoliuaquatic:id/btn_no']")).click();
	 }
	
		try {
			Thread.sleep(2000);//不等待找不到元素
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//广告1
	 if((new isElementPresent().isElementPresent(driver,"id","com.fuzhong.xiaoliuaquatic:id/delete"))){
		 driver.findElementById("com.fuzhong.xiaoliuaquatic:id/delete").click();
	 }

		 
//			//广告2，无法用工具定位，用坐标定位使用
//		 Dimension windowSize = driver.manage().window().getSize();
//		 int height=windowSize.height;
//		 int width=windowSize.width;
//		 
//		TouchAction action = new TouchAction(driver);
//		 action.press(1/2*width,3/4*height );
////		 action.moveTo(6/7*height, 1/2*width);
//		 action.release();
//		 action.perform();
		
//		 TouchActions action = new TouchActions(driver);
//		
//		 WebElement element =new WebElement();
//		 element.
//		 action.singleTap(element);
//		 action.perform();

	}
}
