package mavenExecutionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import org.testng.annotations.Test;

public class TC001_ExecutionTest {
	
	@Test
	public void tc001_ExecutionTest() throws InterruptedException
	{
		Reporter.log("..............................Hi from maven.......................",true);
		
		String URL = System.getProperty("url");//https://www.google.com
		String USERNAME = System.getProperty("username");//admin
		String PASSWORD = System.getProperty("password");//admin@123
		
		Reporter.log("...................." +URL,true);
		Reporter.log("...................." +USERNAME,true);
		Reporter.log("...................." +PASSWORD,true);
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}