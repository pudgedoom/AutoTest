package my;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider(name="fam")
	public static Object[][] User(){//必须用静态方法
		return new Object[][]{
			{"root","fuck1"},
			{"abc","fuck2"},
			{"goudai","fuck3"}
		};
	}
}
