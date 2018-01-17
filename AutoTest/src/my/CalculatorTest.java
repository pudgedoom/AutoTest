package my;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {
//ʹ�õ�jdk1.8������ļ�
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI P10");//���ڱ����ܲ鿴��
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        
        //ע������ip�Ͷ˿�
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        //ͨ��id��λ
//        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
//        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
//        driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
//        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        
        //ͨ��xpath��λ
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_9']")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.android.calculator2:id/op_mul']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_6']")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.android.calculator2:id/eq']")).click();
        //Thread.sleep(2000);

        String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
        System.out.println(result);

        driver.quit();
    }

}