package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Slide {
	/**
     * 无法定位选中的元素，在大控件内上下滑动
     *
     * @param position 定位方式
     * @param element    定位具体的值
     * @param caozuo 滑动方向 UP  DOWN
     * @param count 大控件中能放几个小元素
     */
    public void swipeControl(AndroidDriver driver, String  position, String element,int count,String caozuo) {    	

        // 获取控件开始位置的坐标轴
        if(position=="id"){
        	Point start =driver.findElementById(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            
            // 获取控件坐标轴差
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // 计算出控件结束坐标
            int endX = x + startX;
            int endY = y + startY;

            // 计算中间点坐标
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //计算移动的坐标
            int j=y/(count*2);
            
            switch (caozuo) {
            // 向上滑动
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//加wait一样
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // 向下滑动
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//加wait一样
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="xpath"){
        	Point start =driver.findElementByXPath(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // 获取控件坐标轴差
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // 计算出控件结束坐标
            int endX = x + startX;
            int endY = y + startY;

            // 计算中间点坐标
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //计算移动的坐标
            int j=y/count;
            
            switch (caozuo) {
            // 向上滑动
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//加wait一样
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // 向下滑动
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//加wait一样
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="class"){
        	Point start =driver.findElementByClassName(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // 获取控件坐标轴差
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // 计算出控件结束坐标
            int endX = x + startX;
            int endY = y + startY;

            // 计算中间点坐标
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //计算移动的坐标
            int j=y/count;
            
            switch (caozuo) {
            // 向上滑动
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//加wait一样
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // 向下滑动
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//加wait一样
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="link_text"){
        	Point start =driver.findElementByLinkText(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // 获取控件坐标轴差
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // 计算出控件结束坐标
            int endX = x + startX;
            int endY = y + startY;

            // 计算中间点坐标
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //计算移动的坐标
            int j=y/count;
            
            switch (caozuo) {
            // 向上滑动
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//加wait一样
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // 向下滑动
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//加wait一样
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="name"){
        	Point start =driver.findElementByName(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // 获取控件坐标轴差
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // 计算出控件结束坐标
            int endX = x + startX;
            int endY = y + startY;

            // 计算中间点坐标
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //计算移动的坐标
            int j=y/count;
            
            switch (caozuo) {
            // 向上滑动
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//加wait一样
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // 向下滑动
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//加wait一样
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="css_selector"){
        	Point start =driver.findElementByCssSelector(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // 获取控件坐标轴差
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // 计算出控件结束坐标
            int endX = x + startX;
            int endY = y + startY;

            // 计算中间点坐标
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //计算移动的坐标
            int j=y/count;
            
            switch (caozuo) {
            // 向上滑动
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//加wait一样
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // 向下滑动
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//加wait一样
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="tag_name"){
        	Point start =driver.findElementByTagName(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // 获取控件坐标轴差
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // 计算出控件结束坐标
            int endX = x + startX;
            int endY = y + startY;

            // 计算中间点坐标
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //计算移动的坐标
            int j=y/count;
            
            switch (caozuo) {
            // 向上滑动
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//加wait一样
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // 向下滑动
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//加wait一样
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }


    }
}
