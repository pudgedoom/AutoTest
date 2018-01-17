package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//连接mysql，insert百万数据
public class CreateData {

	public static void main(String[] args) {
//		System.out.println(lpad("1111111",7,"0"));
//		System.out.println("1111"+getFixLenthString(7));
		
		Test();
	}
	 public static void Test(){
		 //rewriteBatchedStatements=true只有开启这个，才回执行比较快，需要mysql5.1以上
		 	String url = "jdbc:mysql://10.108.86.39:3306/fz_aquatic?rewriteBatchedStatements=true";
		    String user = "fz_aquatic";
		    String password = "fuzhong2015";
	        Connection conn = null;
	        PreparedStatement pstm =null;
	        ResultSet rt = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            conn = DriverManager.getConnection(url, user, password); 
	            //这边的？号不能放在最后，不然影响使用可能和转义或者引号有关系
	            String sql = "INSERT INTO crm_account_member(account_key,bind_tel,account_type,auth_flag,full_name) VALUES(?,?,0,0,\"xjh\")";
	            pstm = conn.prepareStatement(sql);
	            Long startTime = System.currentTimeMillis();	    
	             //i代表执行多少数据量
	            for (int i = 1; i <= 500000; i++) {
	            	//String s = "0000000"+"1111111";  
	        		//s = s.substring(s.length()-7,s.length()); 
	        		//System.out.println(s);
	        		//String a = '1'+"10000000000"+"1";  
	        		//a = a.substring(a.length()-11,a.length()); 
	        		//System.out.println(a);
	                pstm.setString(1,"ACTzZHx8lkNs"+lpad(String.valueOf(i),7,"0"));	 
	                
	                //？号位置有关系   
	                pstm.setString(2,"1111"+lpad(String.valueOf(i),7,"0"));
	               
	                pstm.addBatch();
	            }
	            pstm.executeBatch();
	            Long endTime = System.currentTimeMillis();
	            System.out.println("OK,用时：" + (endTime - startTime)); 	            
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
	 //java实现的lpad
	 public static  String lpad(String s, int n, String replace) {  
	        while (s.length() < n) {  
	            s = replace+s;  
	        }  
	        return s;  
	    }  
	//java实现的rpad
	 public static String rpad(String s, int n, String replace) {  
	        while (s.length() < n) {  
	            s = s+replace;  
	        }  
	        return s;  
	    }  

	 
}
