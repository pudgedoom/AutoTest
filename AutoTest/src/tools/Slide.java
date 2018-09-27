package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Slide {
	/**
     * �޷���λѡ�е�Ԫ�أ��ڴ�ؼ������»���
     *
     * @param position ��λ��ʽ
     * @param element    ��λ�����ֵ
     * @param caozuo �������� UP  DOWN
     * @param count ��ؼ����ܷż���СԪ��
     */
    public void swipeControl(AndroidDriver driver, String  position, String element,int count,String caozuo) {    	

        // ��ȡ�ؼ���ʼλ�õ�������
        if(position=="id"){
        	Point start =driver.findElementById(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            
            // ��ȡ�ؼ��������
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // ������ؼ���������
            int endX = x + startX;
            int endY = y + startY;

            // �����м������
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //�����ƶ�������
            int j=y/(count*2);
            
            switch (caozuo) {
            // ���ϻ���
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//��waitһ��
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // ���»���
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//��waitһ��
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="xpath"){
        	Point start =driver.findElementByXPath(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // ��ȡ�ؼ��������
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // ������ؼ���������
            int endX = x + startX;
            int endY = y + startY;

            // �����м������
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //�����ƶ�������
            int j=y/count;
            
            switch (caozuo) {
            // ���ϻ���
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//��waitһ��
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // ���»���
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//��waitһ��
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="class"){
        	Point start =driver.findElementByClassName(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // ��ȡ�ؼ��������
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // ������ؼ���������
            int endX = x + startX;
            int endY = y + startY;

            // �����м������
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //�����ƶ�������
            int j=y/count;
            
            switch (caozuo) {
            // ���ϻ���
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//��waitһ��
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // ���»���
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//��waitһ��
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="link_text"){
        	Point start =driver.findElementByLinkText(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // ��ȡ�ؼ��������
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // ������ؼ���������
            int endX = x + startX;
            int endY = y + startY;

            // �����м������
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //�����ƶ�������
            int j=y/count;
            
            switch (caozuo) {
            // ���ϻ���
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//��waitһ��
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // ���»���
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//��waitһ��
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="name"){
        	Point start =driver.findElementByName(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // ��ȡ�ؼ��������
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // ������ؼ���������
            int endX = x + startX;
            int endY = y + startY;

            // �����м������
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //�����ƶ�������
            int j=y/count;
            
            switch (caozuo) {
            // ���ϻ���
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//��waitһ��
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // ���»���
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//��waitһ��
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="css_selector"){
        	Point start =driver.findElementByCssSelector(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // ��ȡ�ؼ��������
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // ������ؼ���������
            int endX = x + startX;
            int endY = y + startY;

            // �����м������
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //�����ƶ�������
            int j=y/count;
            
            switch (caozuo) {
            // ���ϻ���
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//��waitһ��
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // ���»���
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//��waitһ��
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }else if(position=="tag_name"){
        	Point start =driver.findElementByTagName(element).getLocation();
            int startX = start.x;
            int startY = start.y;
            // ��ȡ�ؼ��������
            Dimension q = driver.findElementById(element).getSize();
            int x = q.getWidth();
            int y = q.getHeight();
            
            // ������ؼ���������
            int endX = x + startX;
            int endY = y + startY;

            // �����м������
            int centreX = (endX + startX) / 2;
            int centreY = (endY + startY) / 2;
            
            //�����ƶ�������
            int j=y/count;
            
            switch (caozuo) {
            // ���ϻ���
            case "up":
//                driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                TouchAction action = new TouchAction(driver);
                action.press(centreX,centreY);//��waitһ��
                action.moveTo(0,-j);//
       		 	action.release();
       		 	action.perform();	
                break;
            // ���»���
            case "down":
                TouchAction action2 = new TouchAction(driver);
                action2.press(centreX,centreY);//��waitһ��
                action2.moveTo(0,j);//
       		 	action2.release();
       		 	action2.perform();	
                break;
        }
        }


    }
}
