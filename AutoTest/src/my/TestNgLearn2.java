package my;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNgLearn2 {
	@BeforeClass
    public void beforeClass() {
        System.out.println("this is before class2");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class2");
    }

}
