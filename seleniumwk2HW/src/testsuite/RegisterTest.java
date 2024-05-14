package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    public static String url="https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(url);
    }
    @Test
    public void registerlink(){
        driver.findElement(By.xpath("//a[@class='ico-register' and text()='Register']")).click();
        String amessage=driver.findElement(By.xpath("//div[@class='page-title']//h1[text()='Register']")).getText();
        String emessage="Register";
        Assert.assertEquals("Register message problem",amessage,emessage);
    }
    @Test
    public void registeraccount(){
        driver.findElement(By.xpath("//a[@class='ico-register' and text()='Register']")).click();
        driver.findElement(By.xpath("//input[@type='radio' and @value='M']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Shubham");
        driver.findElement(By.id("LastName")).sendKeys("Panchal");
        driver.findElement(By.id("Email")).sendKeys("shubhstudy4101@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Sssssss@410");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Sssssss@410");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        String amessage=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")).getText();
        String emessage="The specified email already exists";
        Assert.assertEquals("Registration message error",emessage,amessage);
        System.out.println();
    }
    @After
    public void tearDown(){
        closebrowser();
    }

}
