package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//����mysql��insert��������
public class CreateData {

	public static void main(String[] args) {
//		System.out.println(lpad("1111111",7,"0"));
//		System.out.println("1111"+getFixLenthString(7));
		
		Test();
	}
	 public static void Test(){
		 //rewriteBatchedStatements=trueֻ�п���������Ż�ִ�бȽϿ죬��Ҫmysql5.1����
		 	String url = "jdbc:mysql://10.108.86.39:3306/fz_aquatic?rewriteBatchedStatements=true";
		    String user = "fz_aquatic";
		    String password = "fuzhong2015";
	        Connection conn = null;
	        PreparedStatement pstm =null;
	        ResultSet rt = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            conn = DriverManager.getConnection(url, user, password); 
	            //��ߵģ��Ų��ܷ�����󣬲�ȻӰ��ʹ�ÿ��ܺ�ת����������й�ϵ
	            String sql = "INSERT INTO crm_account_member(account_key,bind_tel,account_type,auth_flag,full_name) VALUES(?,?,0,0,\"xjh\")";
	            pstm = conn.prepareStatement(sql);
	            Long startTime = System.currentTimeMillis();	    
	             //i����ִ�ж���������
	            for (int i = 1; i <= 500000; i++) {
	            	//String s = "0000000"+"1111111";  
	        		//s = s.substring(s.length()-7,s.length()); 
	        		//System.out.println(s);
	        		//String a = '1'+"10000000000"+"1";  
	        		//a = a.substring(a.length()-11,a.length()); 
	        		//System.out.println(a);
	                pstm.setString(1,"ACTzZHx8lkNs"+lpad(String.valueOf(i),7,"0"));	 
	                
	                //����λ���й�ϵ   
	                pstm.setString(2,"1111"+lpad(String.valueOf(i),7,"0"));
	               
	                pstm.addBatch();
	            }
	            pstm.executeBatch();
	            Long endTime = System.currentTimeMillis();
	            System.out.println("OK,��ʱ��" + (endTime - startTime)); 	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e);
	        }finally{
	            if(pstm!=null){
	                try {
	                    pstm.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    throw new RuntimeException(e);
	                }
	            }
	            if(conn!=null){
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    throw new RuntimeException(e);
	                }
	            }
	        }
	    }
	 //javaʵ�ֵ�lpad
	 public static  String lpad(String s, int n, String replace) {  
	        while (s.length() < n) {  
	            s = replace+s;  
	        }  
	        return s;  
	    }  
	//javaʵ�ֵ�rpad
	 public static String rpad(String s, int n, String replace) {  
	        while (s.length() < n) {  
	            s = s+replace;  
	        }  
	        return s;  
	    }  

	 
}
