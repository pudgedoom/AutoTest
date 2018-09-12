package my;

import java.util.List;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaTest {
	@Test
	@Parameters("test1")//µ¥¸öÖµ
	public void show(List<String> test1){
		for (int i = 0; i <test1.size(); i++) {
			System.out.println(test1);
		}
		
	}
}
