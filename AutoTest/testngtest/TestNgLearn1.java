package testngtest;

import org.testng.annotations.*;


public class TestNgLearn1 {
	@BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }

}
