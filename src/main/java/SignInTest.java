

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BusinessLogic {

  
    

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

    	BusinessLogic BL=new BusinessLogic();
    	

        driver.get("https://www.cleartrip.com/");
        waitFor(2000);
        clickonwebelement("linkText","Your trips");
        clickonwebelement("id","SignIn");
        driver.switchTo().frame("modal_window");
        clickonwebelement("id","signInButton");

        String errors1 = driver.findElement(By.id("errors1")).getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
        driver.quit();
    }

    
    

}
