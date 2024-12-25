package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertDemo {
	
    @Test
	public void validate() throws InterruptedException
	{
		//Invoke
    	WebDriver driver=new ChromeDriver();
    	//url
    	driver.get("https://www.google.co.in/");
    	String s="Google";
    	Thread.sleep(2000);
    	Assert.assertEquals("Google", driver.getTitle());
		
	}

}
