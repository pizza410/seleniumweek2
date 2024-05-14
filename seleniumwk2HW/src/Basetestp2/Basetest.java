package Basetestp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Basetest {
    public WebDriver driver;
    public void openbrowser(String url){
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));
    }
    public void closebrowser(){
        driver.quit();
    }
}
