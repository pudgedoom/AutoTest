package PublishGoods;

import init.Login;
import init.init;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import tools.isElementPresent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class PublishGoodsTest extends init{//�����̳�ͬһ��driver���Թ���һ��sessionʹ��
//	init a=new init();
//	AndroidDriver driver=super.initDriver();
//

	//������Ʒ

	@Test
	public void publishGoods(){

//		try{
			//��¼������ֻ��������ã�����̬�й�ϵ��
			System.out.println("��¼��ʼ");
			Login b=new Login();
			b.signIN("18618618621", "a123456");
			
			
			System.out.println("��ʼ������Ʒ������");
			//��������-������Ʒ
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/quick_releaseLayout").click();

			try {
				Thread.sleep(5000);			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//ȥ��Ӱ
			if(new isElementPresent().isElementPresent(super.driver, "id", "com.fuzhong.xiaoliuaquatic:id/addPicGridlayout")){
				super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/addPicGridlayout").click();
				System.out.println("ȥ��Ӱ�ɹ���");
			}

			//�ϴ�ͼƬ

			super.driver.findElementByClassName("android.widget.ImageView").click();
			System.out.println("�ϴ�ͼƬ");
			try {
				Thread.sleep(3000);			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			super.driver.findElementByXPath("//android.widget.RelativeLayout[@resource-id='com.fuzhong.xiaoliuaquatic:id/item_add_pic_layout_default']/android.widget.ImageView[1]").click();

			System.out.println("�����");
			//�����ѡ��
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/albumButton").click();
			try {
				Thread.sleep(3000);			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//ѡ��7����Ƭ
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[1]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[2]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[3]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[4]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[5]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[6]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[7]/android.widget.ImageView[1]").click();
			
			//�����ѡ��-ȷ��
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/tv_confirm").click();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			b.loginOut();
//		}
//		
		
		//�ȴ�ͼƬ�ϴ�
		try {
			Thread.sleep(5000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�ж�ͼƬ�Ƿ��ϴ��ɹ�
		if(new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[5]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[6]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[7]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")){
			System.out.println("�ϴ�ͼƬ�ɹ���");
		}
		
		//�����ѡ�����
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/classificationContentTextView").click();
		
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 Dimension windowSize = driver.manage().window().getSize();
		 int height=windowSize.height;
		 int width=windowSize.width;
		 System.out.println(height+"-----"+width);
		 
		TouchAction action = new TouchAction(driver);
//		WebElement el=super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/threeWheelview");
		 action.press(width,7/8*height );
		 action.moveTo(width,-1/24*height);
//		 action.tap(0,-2);
		 action.release();
//		 action.press(el, 0, -5);
		 action.perform();
		
		
//		WebElement element = super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/classificationContentTextView");
//		int i = 2;//Ҫ�������β����ҵ���ֵ���Լ�����
//		while(i>0){
//			Thread.sleep(2000);
//			int x = element.getSize().width;//Ԫ�صĿ�1080
//			int y = element.getLocation().getY();//Ԫ����ʼ��y
//			int h =element.getSize().height;//Ԫ�صĸ�
//			((Object) super.driver).swipe(x/2, y+h/10*4, x/2, y+h/10*3, 300);//���������������
//			WebDriver dr =super.initDriver();
//			dr.s
//			i--;
//		}
//		Thread.sleep(2000);
		
		//�ȴ�һ��
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ʹ��Ĭ�ϵ�һ�����࣬��ѡ���������ࣻ������������Ҫ�ƶ��ȷ���
//		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/confirmTextView").click();
//		
		//�ȴ�һ��
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����Ʒ���ƿ�ʼ");
		//���룬��Ʒ����
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/productContentEditText").sendKeys("xjh6667");//��֧������
		System.out.println("�����Ʒ���ƽ���");
		
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���������ۼ�
//		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/SpecificationsSettingTextView").click();
		super.driver.findElementByXPath("//android.widget.TextView[@resource-id='com.fuzhong.xiaoliuaquatic:id/SpecificationsSettingTextView']").click();;
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��������۷���
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/price_unit_text").click();
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�����ʹ��Ĭ�ϵ�һ����ͬ��
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/confirmTextView").click();
		
		//һ������xx��
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/weight_unit_edit").sendKeys("1");
		
		//��С������xx
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/wholesale_unit_edit").sendKeys("1");
		
		//���������Ϣ,ֻ����������������

	}

}
