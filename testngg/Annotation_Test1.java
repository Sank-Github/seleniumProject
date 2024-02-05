package TestNGProgramss;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation_Test1 {
  @Test
  public void f() {
	  System.out.println("This is First Method");
	  System.out.println("Thread ID is "+ Thread.currentThread().getId());      // given for parallel testing
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method Executes before each Test Method ");     //Each is Important....
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method Executes before each Test Method ");       //Each is Important....
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class Executes before First Method ");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("After Class Executes after last Method ");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Executes before Test Method ");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Executes After all Test Methods ");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite Executes Before all Methods ");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite Executes After all Methods ");
  }
  @Test
  public void s() {
	  System.out.println("This is Second Method ");
  }
}
