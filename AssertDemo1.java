package TestNGPractice;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertDemo1 {
	
    @Test
	public void validate()
	{
		String name="wipro";
		Assert.assertEquals(name, "wipro");
		
	}
    
    @Test
    public void validate2()
    {
    	Assert.assertEquals(4>5, false);
    }

}
