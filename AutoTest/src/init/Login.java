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
		//�ж��˳���¼��
		if(new isElementPresent().isElementPresent(driver, "id", "com.fuzhong.xiaoliuaquatic:id/dialog_cancel")){
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/dialog_cancel").click();;
			System.out.println("�˳���¼��ʾ��");
		}
		//�����������
		super.driver.findElement(By.xpath("//android.widget.GridView[@resource-id='com.fuzhong.xiaoliuaquatic:id/tabGridView']/android.widget.LinearLayout[4]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")).click();

		//�����¼����------��֪��Ϊʲô��߲��ܼ��жϣ����ˣ�������appuim��������
//		AndroidDriver dr=init.initDriver();
//		 if(new isElementPresent().isElementPresent(dr,"id","com.fuzhong.xiaoliuaquatic:id/click_login_bt")){
//			 System.out.println("�жϳɹ��ˣ�������");
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/click_login_bt").click();
//		 }
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//�����û���
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/account").sendKeys(name);//18618618621
		//��������
		super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/password").sendKeys(passwd);//a123456
		//�����¼
		super.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.fuzhong.xiaoliuaquatic:id/login']")).click();
		
		//У���¼�Ƿ�ɹ�
		try{
			String myname=super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/bt_name").getText();
			assertEquals("xjh���̹ܼ�", myname);
			System.out.println("��¼�ɹ���");
		}
		catch(Exception e){
			System.out.println("��¼ʧ�ܣ�");
		}		
		}
	
//		@Test(groups={"login","out"},dependsOnMethods={"login"})
//		@Test(dependsOnMethods={"login"})
		public void loginOut(){
			//��������
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/setting_bt").click();
			
			//�˳���¼
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/log_out").click();
			
			//���ȷ��
			super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/dialog_confim").click();
			
			//У���˳��Ƿ�ɹ�
			try{
				String myname=super.driver.findElementById("com.fuzhong.xiaoliuaquatic:id/click_login_bt").getText();
				assertEquals("���¼", myname);
				System.out.println("�˳���¼�ɹ���");
			}
			catch(Exception e){
				System.out.println("�˳���¼ʧ�ܣ�");
			}	
		}
}
