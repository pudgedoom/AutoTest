package my;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mysql.fabric.xmlrpc.base.Data;
public class DataProviderLearn {//只能当前使用
	@DataProvider(name="user")
	public Object[][] User(){
		return new Object[][]{
			{"root","passwd"},
			{"abc","111"},
			{"goudai","fuck"}
		};
	}
//	@Test(dataProvider="user")
//	public void show(String name,String passwd){
//		System.out.println(name+"----------"+passwd);
//	}
	
	@Test(dataProvider="fam",dataProviderClass=my.Data.class)
	public void show(String name,String passwd){
		System.out.println(name+"----------"+passwd);
	}

}
