package my;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CommTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI P10");//���ڱ����ܲ鿴��
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        
      //����apk ��·��!!!!!!!!!!!!!!!!!!��װҪ���������
		capabilities.setCapability("app","D:\\XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
        
        capabilities.setCapability("appPackage", "com.fuzhong.xiaoliuaquatic");
        capabilities.setCapability("appActivity", ".com.fuzhong.xiaoliuaquatic.ui.main.MainActivity");
//        capabilities.setCapability("noSign","True");//��װʱ����apk������ǩ��
//        capabilities.setCapability("noReset", true); //����Ҫ�ٴΰ�װ
        //ע������ip�Ͷ˿�
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        
        //�������û��
		//driver.installApp("C:\\Users\\Administrator\\Documents\\Tencent Files\\781188610\\FileRecv\\XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
	}

}
