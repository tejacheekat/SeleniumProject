package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TitleCheck2 {
	 @Test
	public void check()
	{
		//invoke browser
		 WebDriver driver=new ChromeDriver();
		 //url
		 driver.get("https://www.google.co.in/");
		String s= driver.getTitle();
		//System.out.println(s);
		Assert.assertEquals(s, "Google");
		System.out.println("title is matching");
	}

}
