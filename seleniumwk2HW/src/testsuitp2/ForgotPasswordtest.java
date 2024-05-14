package testsuitp2;

import Basetestp2.Basetest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordtest extends Basetest {
    String url="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup(){
        openbrowser(url);
    }
    @Test
    public void forgetpassword(){
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        String amessage=driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText();
        String emessage="Reset Password";
        Assert.assertEquals("reset password message",emessage,amessage);
    }
    @After
    public void teardown(){
        closebrowser();
    }
}
