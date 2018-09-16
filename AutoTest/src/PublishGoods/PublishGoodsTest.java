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


public class PublishGoodsTest extends init{//用例继承同一个driver可以共用一个session使用
//	init a=new init();
//	AndroidDriver driver=super.initDriver();
//

	//发布商品

	@Test
	public void publishGoods(){

//		try{
			//登录操作，只能在这边用，跟静态有关系把
			System.out.println("登录开始");
			Login b=new Login();
			b.signIN("18618618621", "a123456");
			
			
			System.out.println("开始发布商品操作！");
			//个人中心-发布商品
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/quick_releaseLayout").click();

			try {
				Thread.sleep(5000);			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//去阴影
			if(new isElementPresent().isElementPresent(super.driver, "id", "com.fuzhong.xiaoliuaquatic:id/addPicGridlayout")){
				super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/addPicGridlayout").click();
				System.out.println("去阴影成功！");
			}

			//上传图片

			super.driver.findElementByClassName("android.widget.ImageView").click();
			System.out.println("上传图片");
			try {
				Thread.sleep(3000);			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			super.driver.findElementByXPath("//android.widget.RelativeLayout[@resource-id='com.fuzhong.xiaoliuaquatic:id/item_add_pic_layout_default']/android.widget.ImageView[1]").click();

			System.out.println("打开相册");
			//从相册选择
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/albumButton").click();
			try {
				Thread.sleep(3000);			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//选择7张照片
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[1]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[2]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[3]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[4]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[5]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[6]/android.widget.ImageView[1]").click();
			super.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/grid_view_image_select']/android.widget.FrameLayout[7]/android.widget.ImageView[1]").click();
			
			//从相册选择-确定
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/tv_confirm").click();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			b.loginOut();
//		}
//		
		
		//等待图片上传
		try {
			Thread.sleep(5000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//判断图片是否上传成功
		if(new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[5]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[6]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")&&new isElementPresent().isElementPresent(driver, "xpath", "//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/addPicGridlayout']/android.widget.LinearLayout[7]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")){
			System.out.println("上传图片成功！");
		}
		
		//点击，选择分类
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
//		int i = 2;//要滑动几次才能找到该值，自己掂量
//		while(i>0){
//			Thread.sleep(2000);
//			int x = element.getSize().width;//元素的宽1080
//			int y = element.getLocation().getY();//元素起始点y
//			int h =element.getSize().height;//元素的高
//			((Object) super.driver).swipe(x/2, y+h/10*4, x/2, y+h/10*3, 300);//根据坐标点来滑动
//			WebDriver dr =super.initDriver();
//			dr.s
//			i--;
//		}
//		Thread.sleep(2000);
		
		//等待一会
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//使用默认第一个分类，不选择其他分类；用其他分类需要移动等方法
//		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/confirmTextView").click();
//		
		//等待一会
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("输入货品名称开始");
		//输入，货品名称
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/productContentEditText").sendKeys("xjh6667");//不支持中文
		System.out.println("输入货品名称结束");
		
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//点击，规格售价
//		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/SpecificationsSettingTextView").click();
		super.driver.findElementByXPath("//android.widget.TextView[@resource-id='com.fuzhong.xiaoliuaquatic:id/SpecificationsSettingTextView']").click();;
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//点击，销售分类
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/price_unit_text").click();
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//点击，使用默认第一个；同上
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/confirmTextView").click();
		
		//一件等于xx斤
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/weight_unit_edit").sendKeys("1");
		
		//最小起批量xx
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/wholesale_unit_edit").sendKeys("1");
		
		//添加销售信息,只能用网上是坐标了

	}

}
