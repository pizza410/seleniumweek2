package testsuitp2;

import Basetestp2.Basetest;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends Basetest {
    String url="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup(){
        openbrowser(url);
    }
    @Test
    public void validuser(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        String amessage=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        String emessage="Dashboard";
        Assert.assertEquals("Dashboard text",emessage,amessage);
    }
    @After
    public void teardown(){
        closebrowser();
    }
}
