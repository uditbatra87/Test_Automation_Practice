package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestCaseTest {
 
	
	
	
  @Test
  public void testCase_001() {
		
			System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.goibibo.com");
			
			System.out.println(driver.getCurrentUrl());
			
			System.out.println(driver.getTitle());
			
			driver.quit();
  
	  
  }
}
