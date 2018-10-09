package tools;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Field;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;

public class MysqlJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 定义数据库的用户名  
    private final String USERNAME = ResourceBundle.getBundle("config/config").getString("mysql_username");  
    // 定义数据库的密码  
    private final String PASSWORD = ResourceBundle.getBundle("config/config").getString("mysql_passwd");  
    // 定义数据库的驱动信息  
    private final String DRIVER = ResourceBundle.getBundle("config/config").getString("mysql_driver");
    // 定义访问数据库的地址  
    private final String URL = ResourceBundle.getBundle("config/config").getString("mysql_url"); 
  
    // 定义访问数据库的连接  
    private Connection connection;  
    // 定义sql语句的执行对象  
    private PreparedStatement pstmt;  
    // 定义查询返回的结果集合  
    private ResultSet resultSet;  
  
    public MysqlJdbc() {  
        // TODO Auto-generated constructor stub  
        try {  
            Class.forName(DRIVER);  
            System.out.println("注册驱动成功！！");  
        } catch (ClassNotFoundException e) {  
            // TODO Auto-generated catch block  
            System.out.println("注册驱动失败！！");  
        }  
  
    }  
  
    // 定义获得数据库的连接  
    public Connection getConnection() {  
  
        try {  
            connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);  
  
        } catch (Exception e) {  
            // TODO: handle exception  
            System.out.println("Connection exception !");  
        }  
  
        return connection;  
  
    }  
  

  
    /** 
     * 查询返回单条记录 
     *  
     * @param sql 
     * @param params 
     * @return 
     * @throws SQLException 
     */  
    public  boolean findSimpleResult(String sql, List<Object> params)  
            throws SQLException {  
//        Map<String, Object> map = new HashMap<String, Object>();  
    	boolean flag=false;
//    	Connection connection=null;
        try {  
            connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);  
  
        } catch (Exception e) {  
            // TODO: handle exception  
            System.out.println("Connection exception !");  
        }  
        pstmt = (PreparedStatement) connection.prepareStatement(sql);
        int index = 1;  
        if (params != null && !params.isEmpty()) {  
            for (int i = 0; i < params.size()-1; i++) {  
                pstmt.setObject(index++, params.get(i));  
            }  
        }  
        resultSet = pstmt.executeQuery(); // 返回查询结果  
        if(resultSet.next()){
        	pstmt.close();
        	connection.close();
        	return flag=true;
        }else{
        	pstmt.close();
        	connection.close();
        	return flag;
        }

        
//        ResultSetMetaData metaData = (ResultSetMetaData) pstmt.getMetaData(); // 获取 结果中，一行所有列的结果  
//        int cols_len = metaData.getColumnCount(); // 获得列的总数  
  
//        while (resultSet.next()) {  
//            for (int i = 0; i < cols_len; i++) {  
//                String col_name = metaData.getColumnName(i + 1); // 获得第i列的字段名称  
//                Object col_value = resultSet.getObject(col_name);// 返回 第i列的内容值  
//                if (col_value == null) {  
//                    col_value = "";  
//                }  
//                map.put(col_name, col_value);  
//            }  
//  
//        }  
  
//        return map;  
    }  

    /** 
     * 完成对数据库标的增加删除和修改的操作 
     *  
     * @param sql 
     * @param params 
     * @return 
     * @throws SQLException 
     */  
    public boolean updateByPreparedStatement(String sql, List<Object> params)  
            throws SQLException {  
        boolean flag = false;  
        int result = -1;// 表示当用户执行增加删除和修改的操作影响的行数  
        int index = 1; // 表示 占位符 ，从1开始  
        pstmt = (PreparedStatement) connection.prepareStatement(sql);  
        if (params != null && !params.isEmpty()) {  
            for (int i = 0; i < params.size(); i++) {  
                pstmt.setObject(index++, params.get(i)); // 填充占位符  
            }  
        }  
  
        result = pstmt.executeUpdate();  
        flag = result > 0 ? true : false;  
        return flag;  
  
    }  
}
