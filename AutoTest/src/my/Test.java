package my;

import java.net.MalformedURLException;
import java.net.URL;
/*测试直接调用*/
import io.appium.java_client.android.AndroidDriver;

public class Test {

	public static void main(String[] args) throws MalformedURLException {
		org.openqa.selenium.remote.DesiredCapabilities capabilities = new org.openqa.selenium.remote.DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI MLA-AL10");//关于本机能查看到
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "4.4.2");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        
        //注意服务的ip和端口
        io.appium.java_client.android.AndroidDriver driver = new io.appium.java_client.android.AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
	}

}
