package Learntestng.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclass {
	@BeforeMethod
	public void basemethod1()
	{
		System.out.println("basecalss method 1");
		
	}
	@BeforeMethod
	public void basemethod2()
	{
		System.out.println("basecalss method 2");
		
	}

	

}
