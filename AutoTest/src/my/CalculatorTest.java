package my;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {
//使用的jdk1.8编译的文件
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI P10");//关于本机能查看到
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        
        //注意服务的ip和端口
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        //通过id定位
//        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
//        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
//        driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
//        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        
        //通过xpath定位
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