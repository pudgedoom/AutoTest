package my;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CommTest {
/*��װ�����ַ�����1��capabilities.setCapability("app","D:\\XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");ֱ�Ӱ�װ
 * 2���ȴ�Ӧ�ã�Ȼ���ڰ�װdriver.installApp("C:\\Users\\Administrator\\Documents\\Tencent Files\\781188610\\FileRecv\\XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI P10");//���ڱ����ܲ鿴��
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
      //����apk ��·��!!!!!!!!!!!!!!!!!!��װҪ���������---����ֱ�Ӱ�װ
		//capabilities.setCapability("app","D:\\XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
        
//        capabilities.setCapability("appPackage", "com.fuzhong.xiaoliuaquatic");
//        capabilities.setCapability("appActivity", ".com.fuzhong.xiaoliuaquatic.ui.main.MainActivity");
//        capabilities.setCapability("noSign","True");//��װʱ����apk������ǩ��
//        capabilities.setCapability("noReset", true); //����Ҫ�ٴΰ�װ
        //ע������ip�Ͷ˿�
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);        
        //�������������---��װ
		//driver.installApp("C:\\Users\\Administrator\\Documents\\Tencent Files\\781188610\\FileRecv\\XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
		//ɾ��Ӧ��
		//driver.removeApp("com.fuzhong.xiaoliuaquatic");
		//home����
		driver.closeApp();
		//����
		driver.launchApp();
	}

}
