package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    public static String url="https://demo.nopcommerce.com/";
    @Before
    public void setup(){
      openBrowser(url);
  }
  @Test
    public void loginpage(){
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        String receivedtext=driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        String expectedtext="Welcome, Please Sign In!";
      Assert.assertEquals("Something is wrong",expectedtext,receivedtext);
  }
  @Test
    public void validlogin(){
        //User should be able to login with valid credentials
      driver.findElement(By.xpath("//a[@class='ico-login']")).click();
      driver.findElement(By.xpath("//input[@class='email']")).sendKeys("panchalshubh98@gmail.com");
      driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Sssssss@410");
      driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']")).click();
      String logintext=driver.findElement(By.xpath("//div[@class='topic-block-title' or text()='Welcome to our store']")).getText();
      String expctedlogintext="Welcome to our store";
      Assert.assertEquals("Something wrong is welcome text",expctedlogintext,logintext);
  }
  @Test
  public void invalidlogin(){
        //user should not be able to login with invalid credentials
      driver.findElement(By.xpath("//a[@class='ico-login']")).click();
      driver.findElement(By.xpath("//input[@class='email']")).sendKeys("panchalshubh410@gmail.com");
      driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Sssssss@410");
      driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']")).click();
      String aerrormessage=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
      String eerrormessage="Login was unsuccessful. Please correct the errors and try again.\n" +
              "No customer account found";
      Assert.assertEquals("Problem in invalid error message",eerrormessage,aerrormessage);
  }
  @After
  public void tearDown(){
        closebrowser();
  }
}
