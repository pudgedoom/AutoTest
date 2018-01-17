package my;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CommTest2 {

	public static void main(String[] args) throws MalformedURLException {	
			//set up appium设置apk路径
//			File classpathRoot=new File(System.getProperty("user.dir"));
			//File appDir=new File("D:\\", "apps");
			File app=new File("D:\\", "XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
			//设置自动化相关参数
			DesiredCapabilities capabilities=new DesiredCapabilities();
			//capabilities.setCapability("noReset", true); //不需要再次安装
			//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("deviceName","HUAWEI P10");
			//设置android系统版本
			capabilities.setCapability("platformVersion","7.0");
			//if no need install don't add this 
			//设置apk 的路径
			capabilities.setCapability("app",app.getAbsolutePath());

			//support Chinese支持中文输入
			//capabilities.setCapability("unicodeKeyboard","True");
			//重置输入法为系统默认
			//capabilities.setCapability("resetKeyboard","True");

			//no need sign 安装时不对apk进行重签名，设置很有必要，否则有的apk在重签名之后无法正常使用
			//capabilities.setCapability("noSign","True");
			//设置app的主包名和主类名
			capabilities.setCapability("appPackage","com.fuzhong.xiaoliuaquatic");
//				capabilities.setCapability("appActivity","cn.jpush.android.ui.PushActivity");
			capabilities.setCapability("appActivity","com.fuzhong.xiaoliuaquatic.ui.main.MainActivity");//找开发要或是第一个activity
			//初始化
			AndroidDriver driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);	
	}

}
