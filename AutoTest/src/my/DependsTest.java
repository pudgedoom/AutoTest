package my;
import org.testng.annotations.Test;
public class DependsTest {
	@Test(dependsOnMethods = {"show1"})//��ʱû������ϵ��ʲô��
	public void show2(){
		System.out.println("this is b");
	}
	
	@Test
	public void show1(){
		System.out.println("this is a");
	}

}
