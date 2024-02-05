package TestNGProgramss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assert1 {                                          //Hard Asserts or Default Assert
 public WebDriver driver;
	    @Test
		@Parameters ("Browser")
		public void zerodha(String Browser) {
			if(Browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\New_Automation\\Binary22\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://kite.zerodha.com/");
				String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
				String actualTitle = driver.getTitle();
				Assert.assertEquals(expectedTitle,actualTitle );            //As hard assert did not go to this level beacuse it is failed  
				System.out.println(actualTitle);                         // at line no.21 so it will not crosscheck further.....
				
		
			} else if (Browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\New_Automation\\Binary22\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.facebook.com/");
				String expectedTitle = "Facebook – log in or sign up";
				String actualTitle = driver.getTitle(); 
				Assert.assertNotEquals(expectedTitle,actualTitle );            
				System.out.println(actualTitle);
			
			}	
      }
}
