package Learntestng.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Leaftapstest extends Baseclass {
  @Test
  public void test1() {
	  System.out.println("test1");
	  
  }
 @BeforeClass
  public void beforeclass()
  {
	  System.out.println("Beforeclass");
  }
}
