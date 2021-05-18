import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Privat24 {




    @Test
    public void testMob(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://next.privat24.ua/mobile");

        By number = By.xpath("//input[@data-qa-node=\"phone-number\"]");
        driver.findElement(number).sendKeys("323232323");

        By sum = By.xpath("//input[@data-qa-node=\"amount\"]");
        driver.findElement(sum).sendKeys("1");

        By card = By.xpath("//input[@data-qa-node=\"numberdebitSource\"]");
        driver.findElement(card).sendKeys("4567739561253907");

        By expDate = By.xpath("//input[@data-qa-node=\"expiredebitSource\"]");
        driver.findElement(expDate).sendKeys("1221");

        By cvv = By.xpath("//input[@data-qa-node=\"cvvdebitSource\"]");
        driver.findElement(cvv).sendKeys("123");

        By submit = By.xpath("//button[@data-qa-node=\"submit\"]");
        driver.findElement(submit).click();




    }
}
