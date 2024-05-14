package testsuitsp3;

import Basetest3.Basetest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends Basetest {
    String url="http://the-internet.herokuapp.com/login";
    @Before
    public void setup(){
        openbrowser(url);
    }
    @Test
    public void validcredentials(){
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        String amessage=driver.findElement(By.xpath("//div[@class='example']/h2[text()=' Secure Area']")).getText();
        String emessage="Secure Area";
        Assert.assertEquals("Login text problem",amessage,emessage);
    }
    @Test
    public void usernameErrorMessage(){
        driver.findElement(By.name("username")).sendKeys("tomsmith1");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        String amessage=driver.findElement(By.xpath("//*[contains(text(),'Your username is invalid!')]")).getText();
        String emessage="Your username is invalid!\n" + "×";
      /*  System.out.println(amessage);*/
        Assert.assertEquals("Invalid username message",emessage,amessage);
    }
    @Test
    public void PassworderrorMessage(){
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        String s=driver.findElement(By.xpath(" //div[contains(text(),'Your password is invalid!')]")).getText();
       String emessage="Your password is invalid!\n" + "×";
       Assert.assertEquals("passwird message error",emessage,s);
    }
    @After
    public void tearDown(){
        closebrowser();
    }
}
