package TestNGProgramss;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic_TestNG1 {
  @Test (priority = 3 , groups = "Sanity")
  public void a() {
	  Reporter.log("This is My First testNG Prog.",true);
	  System.out.println("Helllo.. Welcome to the World of TestNG");
	  System.out.println("Thread ID is "+ Thread.currentThread().getId());  // given for parallel testing
  }
  @Test(priority = 2 , groups = "Regression")
  public void b() {
	  System.out.println("This is B Method");
  }
  @Test(priority = 1 , groups = "Sanity")
  public void c() {
	  System.out.println("This is C Method");
  }
  @Test(priority = 4 , groups = "Regression")
  public void d() {
	  System.out.println("This is D Method");
  }
  
}
