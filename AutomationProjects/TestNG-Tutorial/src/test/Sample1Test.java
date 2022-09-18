package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1Test {
	
	
	
	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println("This is Before class ");

	}
	

	@BeforeMethod(alwaysRun=true)
	public void Test1() {
		System.out.println("This is Before Method ");

	}
	@AfterTest
	public void Test2() {
		System.out.println("This is After Test ");

	}
	@BeforeTest
	public void Test3() {
		System.out.println("This is Before Test ");

	}
	@Test(groups= {"Smoke"})
	public void Test4() {
		System.out.println("This is Smoke Test ");

	}
	@AfterMethod(alwaysRun=false,groups= {"Smoke"})
	public void Test5() {
		System.out.println("This is Smoke Test ");

	}
	@Parameters({"bts"})
	@Test(enabled=false)
	public void Test6(String x )throws InterruptedException {
		System.out.println(x);

	}
	@Test
	public void Test7() {
		System.out.println("This is After Test ");

	}
	@Test(dependsOnMethods= {"Test7"})
	public void Test8() {
		System.out.println("This is Before Test ");

	}
	@Test(priority=2)
	public void zetroMethod() {
		System.out.println("This is Priority Method ");

	}
	@Test(dataProvider="MethodTest")
	public void DataGrab(String username,String password) {
		System.out.println("Username="+username+":"+"Password="+password);
	}
	
	@DataProvider
	public Object[][] MethodTest() {
		System.out.println("This is Data provider Method ");
		Object[][] data=new Object[3][2];
		data[0][0]="BtsV";
		data[0][1]="PasswordJk";
		
		data[1][0]="BtsJK";
		data[1][1]="PasswordV";
		
		data[2][0]="Bts7";
		data[2][1]="PasswordBTS";
		
		return data;
	}
	
	
	
	

}
