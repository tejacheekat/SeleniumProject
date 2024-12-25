package TestNGPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumPractice.InvokeMain;
import junit.framework.Assert;

public class TitleCheck3 extends InvokeMain{
	
	@BeforeTest
	public void invoke()
	{
		openbrowser("chrome");
	}
	
	@Test
	public void validate()
	{
		//url
		driver.get("https://www.google.co.in/");
         String s=driver.getTitle();
		Assert.assertEquals(s, "Google");
		System.out.println("title is matching");
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
