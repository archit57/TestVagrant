import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.SkipException;



public class BusinessLogic {
	public static boolean isBrowserOpened=false;
	public static WebDriver driver =null;
	
	public BusinessLogic()
	{   setDriverPath();
		driver=new ChromeDriver();
	}
	
	public void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
	
	public void setDriverPath() {
        

        	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
       
        
       
    }
	
	public void clickonwebelement(String locatortype,String locatorvalue)
	{
		
		if(locatortype.equalsIgnoreCase("linkText"))
		{
			 driver.findElement(By.linkText(locatorvalue)).click();
		}

		else if (locatortype.equalsIgnoreCase("id")) {
			 driver.findElement(By.id(locatorvalue)).click();
		
		}
		
		else if (locatortype.equalsIgnoreCase("className")) {
			 driver.findElement(By.className(locatorvalue)).click();
		
		}
		else if (locatortype.equalsIgnoreCase("xpath")) {
			 driver.findElement(By.xpath(locatorvalue)).click();
		
		}
		else if (locatortype.equalsIgnoreCase("name")) {
			 driver.findElement(By.name(locatorvalue)).click();
		
		}
		else
		{
			Assert.fail();
		}
	}

	}
