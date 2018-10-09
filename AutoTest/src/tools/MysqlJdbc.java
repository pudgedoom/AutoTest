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
	// �������ݿ���û���  
    private final String USERNAME = ResourceBundle.getBundle("config/config").getString("mysql_username");  
    // �������ݿ������  
    private final String PASSWORD = ResourceBundle.getBundle("config/config").getString("mysql_passwd");  
    // �������ݿ��������Ϣ  
    private final String DRIVER = ResourceBundle.getBundle("config/config").getString("mysql_driver");
    // ����������ݿ�ĵ�ַ  
    private final String URL = ResourceBundle.getBundle("config/config").getString("mysql_url"); 
  
    // ����������ݿ������  
    private Connection connection;  
    // ����sql����ִ�ж���  
    private PreparedStatement pstmt;  
    // �����ѯ���صĽ������  
    private ResultSet resultSet;  
  
    public MysqlJdbc() {  
        // TODO Auto-generated constructor stub  
        try {  
            Class.forName(DRIVER);  
            System.out.println("ע�������ɹ�����");  
        } catch (ClassNotFoundException e) {  
            // TODO Auto-generated catch block  
            System.out.println("ע������ʧ�ܣ���");  
        }  
  
    }  
  
    // ���������ݿ������  
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
     * ��ѯ���ص�����¼ 
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
        resultSet = pstmt.executeQuery(); // ���ز�ѯ���  
        if(resultSet.next()){
        	pstmt.close();
        	connection.close();
        	return flag=true;
        }else{
        	pstmt.close();
        	connection.close();
        	return flag;
        }

        
//        ResultSetMetaData metaData = (ResultSetMetaData) pstmt.getMetaData(); // ��ȡ ����У�һ�������еĽ��  
//        int cols_len = metaData.getColumnCount(); // ����е�����  
  
//        while (resultSet.next()) {  
//            for (int i = 0; i < cols_len; i++) {  
//                String col_name = metaData.getColumnName(i + 1); // ��õ�i�е��ֶ�����  
//                Object col_value = resultSet.getObject(col_name);// ���� ��i�е�����ֵ  
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
     * ��ɶ����ݿ�������ɾ�����޸ĵĲ��� 
     *  
     * @param sql 
     * @param params 
     * @return 
     * @throws SQLException 
     */  
    public boolean updateByPreparedStatement(String sql, List<Object> params)  
            throws SQLException {  
        boolean flag = false;  
        int result = -1;// ��ʾ���û�ִ������ɾ�����޸ĵĲ���Ӱ�������  
        int index = 1; // ��ʾ ռλ�� ����1��ʼ  
        pstmt = (PreparedStatement) connection.prepareStatement(sql);  
        if (params != null && !params.isEmpty()) {  
            for (int i = 0; i < params.size(); i++) {  
                pstmt.setObject(index++, params.get(i)); // ���ռλ��  
            }  
        }  
  
        result = pstmt.executeUpdate();  
        flag = result > 0 ? true : false;  
        return flag;  
  
    }  
}
