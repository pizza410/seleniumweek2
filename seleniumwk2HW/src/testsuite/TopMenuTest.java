package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    public static String url="https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(url);
    }
    @Test
    public void navigatecompage(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        String acmessage=driver.findElement(By.xpath("//div[@class='master-column-wrapper']/div[3]/div/div[1]/h1")).getText();
        String ecmessage="Computers";
        Assert.assertEquals("Computer tab message error",ecmessage,acmessage);
    }
    @Test
    public void elecpage(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
        String aemessage=driver.findElement(By.xpath("//div[@id='main']/div/div[3]/div/div[1]/h1")).getText();
        String eemessgae="Electronics";
        Assert.assertEquals("Electronics tab message erroer",aemessage,eemessgae);

    }
    @Test
    public void apparelpage(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")).click();
       String amessage= driver.findElement(By.xpath("//div[@class='page category-page']//h1[text()='Apparel']")).getText();
        String emessage="Apparel";
        Assert.assertEquals("Apperal tab message erroer",amessage,emessage);
    }
    @Test
    public void digitaldownloadpage(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a")).click();
        String amessage=driver.findElement(By.xpath("//div[@class='page category-page']//h1[text()='Digital downloads']")).getText();
        String emessage="Digital downloads";
        Assert.assertEquals("Digital download page tab message erroer",amessage,emessage);

    }
    @Test
    public void Bookspage(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
        String amessage=driver.findElement(By.xpath("//div[@class='page category-page']//h1[text()='Books']")).getText();
        String emessage="Books";
        Assert.assertEquals("Books page tab message",amessage,emessage);
    }
    @Test
    public void Jewelery(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();
        String amessage=driver.findElement(By.xpath("//div[@class='page category-page']//h1[text()='Jewelry']")).getText();
        String emessage="Jewelry";
        Assert.assertEquals("Jewelery page tab message",amessage,emessage);
    }
    @Test
    public void giftcards(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[7]/a")).click();
        String amessage=driver.findElement(By.xpath("//div[@class='page category-page']//h1[text()='Gift Cards']")).getText();
        String emessage="Gift Cards";
        Assert.assertEquals("Gift cards page tab message",amessage,emessage);
    }
    @After
    public void teardown(){
        closebrowser();
    }
}
