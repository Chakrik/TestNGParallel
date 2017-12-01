import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 */
public class FirstTest extends TestBase {

    @Test
    public void GOOGLE1() throws Exception {
        System.out.println("Google1 Test Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google1 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE2() throws Exception {
        System.out.println("Google2 Test Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google2 Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google2 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE3() throws Exception {
        System.out.println("Google3 Test Started! " + Thread.currentThread().getId());
        System.out.println("Google Test Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        getDriver().manage().window().maximize() ;
        System.out.println("Google Test's Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        WebElement tb = getDriver().findElement(By.id("lst-ib"));
        tb.sendKeys("Carolina");
        tb.sendKeys(Keys.ENTER);
        //getDriver().findElement(By.name("btnK")).click();
        getDriver().findElement(By.linkText("Carolina - Wikipedia")).click();
        Thread.sleep(2000);
        Assert.assertEquals(getDriver().getTitle(), "Carolina - Wikipedia");
        System.out.println("Google Test Ended! " + Thread.currentThread().getId());
        Thread.sleep(2000);
        System.out.println("Google3 Test Ended! " + Thread.currentThread().getId());
    }
    
}