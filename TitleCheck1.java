package TestNGPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumPractice.Invoke;
import junit.framework.Assert;

public class TitleCheck1 extends Invoke{
	@BeforeTest
	
	public void Invo()
	{
		openBrowser("chrome");
	}
	
	@Test
	public void validateTitle()
	{
		//url
		driver.get("https://www.google.co.in/");
		
		String s=driver.getTitle();
		//System.out.println(s);
		Assert.assertEquals(s, "Google");
		System.out.println("title is matching");
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	

}
