package my;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider(name="fam")
	public static Object[][] User(){//�����þ�̬����
		return new Object[][]{
			{"root","fuck1"},
			{"abc","fuck2"},
			{"goudai","fuck3"}
		};
	}
}
