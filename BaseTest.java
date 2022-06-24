import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeAll
    protected static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    protected void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    protected void TearDown() {
        driver.quit();
    }
}
