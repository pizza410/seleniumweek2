package Basetest3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
    public WebDriver driver;
    public void openbrowser(String url){
        driver=new ChromeDriver();
        driver.get(url);
    }
    public void closebrowser(){
        driver.quit();
    }
}
