package Learntestng.testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class learnannotations {
	
  @Test
  public void testannotations() {
	  System.out.println("This is testAnnotation");
  }
  
  @Test
  public void testannotations1() {
	  System.out.println("This is testAnnotation2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }
  

  /*@AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }*/

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

 /* @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }*/

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
