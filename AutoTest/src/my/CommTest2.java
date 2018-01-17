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
			//set up appium����apk·��
//			File classpathRoot=new File(System.getProperty("user.dir"));
			//File appDir=new File("D:\\", "apps");
			File app=new File("D:\\", "XiaoLiuAquatic-release-v3.4.4_1_16_CS.apk");
			//�����Զ�����ز���
			DesiredCapabilities capabilities=new DesiredCapabilities();
			//capabilities.setCapability("noReset", true); //����Ҫ�ٴΰ�װ
			//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("deviceName","HUAWEI P10");
			//����androidϵͳ�汾
			capabilities.setCapability("platformVersion","7.0");
			//if no need install don't add this 
			//����apk ��·��
			capabilities.setCapability("app",app.getAbsolutePath());

			//support Chinese֧����������
			//capabilities.setCapability("unicodeKeyboard","True");
			//�������뷨ΪϵͳĬ��
			//capabilities.setCapability("resetKeyboard","True");

			//no need sign ��װʱ����apk������ǩ�������ú��б�Ҫ�������е�apk����ǩ��֮���޷�����ʹ��
			//capabilities.setCapability("noSign","True");
			//����app����������������
			capabilities.setCapability("appPackage","com.fuzhong.xiaoliuaquatic");
//				capabilities.setCapability("appActivity","cn.jpush.android.ui.PushActivity");
			capabilities.setCapability("appActivity","com.fuzhong.xiaoliuaquatic.ui.main.MainActivity");//�ҿ���Ҫ���ǵ�һ��activity
			//��ʼ��
			AndroidDriver driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);	
	}

}
