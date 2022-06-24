import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest extends BaseTest {


    @Test
    public void openPage() {
        driver.get("https://www.olx.ba/");
        WebElement ka = driver.findElement(By.id("km"));
        Assertions.assertTrue(ka.isDisplayed());
        ka.click();


        WebElement umetnost = driver.findElement(By.cssSelector("#kd > ul > li:nth-child(10) > a"));
        Assertions.assertTrue(umetnost.isDisplayed());
        umetnost.click();


        WebElement artikl = driver.findElement(By.cssSelector("#art_43868608 > div.naslov > a > p > i"));

        Assertions.assertTrue(artikl.isDisplayed());
        artikl.click();

        WebElement izabranArtikl = driver.findElement(By.id("naslovartikla"));
        Assertions.assertTrue(izabranArtikl.isDisplayed());

    }
}

