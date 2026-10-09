package mavenExecutionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC003_ExecutionTest2 {
	@Test
	
	public void tc003_ExecutionTest2() throws InterruptedException
{
		Reporter.log("..............................hi from maven...............",true);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.quit();
}

}
