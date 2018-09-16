package init;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import tools.isElementPresent;


public class Login extends init{
	
//	init a=new init();

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		login();
//			
//		}
//	@Parameters({"name","passwd"})
//	@Test
	public  void signIN(String name,String passwd){

		super.skip();
		//判断退出登录框
		if(new isElementPresent().isElementPresent(driver, "id", "com.fuzhong.xiaoliuaquatic:id/dialog_cancel")){
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/dialog_cancel").click();;
			System.out.println("退出登录提示！");
		}
		//进入个人中心
		super.driver.findElement(By.xpath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/tabGridView']/android.widget.LinearLayout[4]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

		//进入登录界面------不知道为什么这边不能加判断，加了，会跳出appuim重新运行
//		AndroidDriver dr=init.initDriver();
//		 if(new isElementPresent().isElementPresent(dr,"id","com.fuzhong.xiaoliuaquatic:id/click_login_bt")){
//			 System.out.println("判断成功了，进来了");
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/click_login_bt").click();
//		 }
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//输入用户名
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/account").sendKeys(name);//18618618621
		//输入密码
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/password").sendKeys(passwd);//a123456
		//点击登录
		super.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.fuzhong.xiaoliuaquatic:id/login']")).click();
		
		//校验登录是否成功
		try{
			String myname=super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/bt_name").getText();
			assertEquals("xjh电商管家", myname);
			System.out.println("登录成功！");
		}
		catch(Exception e){
			System.out.println("登录失败！");
		}		
		}
	
//		@Test(groups={"login","out"},dependsOnMethods={"login"})
//		@Test(dependsOnMethods={"login"})
		public void loginOut(){
			//进入设置
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/setting_bt").click();
			
			//退出登录
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/log_out").click();
			
			//点击确定
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/dialog_confim").click();
			
			//校验退出是否成功
			try{
				String myname=super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/click_login_bt").getText();
				assertEquals("请登录", myname);
				System.out.println("退出登录成功！");
			}
			catch(Exception e){
				System.out.println("退出登录失败！");
			}	
		}
}
