package my;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CommTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI P10");//关于本机能查看到
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        
      //设置apk 的路径!!!!!!!!!!!!!!!!!!安装要用这个参数
		capabilities.setCapability("app","D:\\XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
        
        capabilities.setCapability("appPackage", "com.fuzhong.xiaoliuaquatic");
        capabilities.setCapability("appActivity", ".com.fuzhong.xiaoliuaquatic.ui.main.MainActivity");
//        capabilities.setCapability("noSign","True");//安装时不对apk进行重签名
//        capabilities.setCapability("noReset", true); //不需要再次安装
        //注意服务的ip和端口
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        
        //这个参数没用
		//driver.installApp("C:\\Users\\Administrator\\Documents\\Tencent Files\\781188610\\FileRecv\\XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
	}

}
