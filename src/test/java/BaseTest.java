import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver chromeDriver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        chromeDriver.get("https://www.bookdepository.com/");
    }
    @AfterEach
    public void tearDown() {
        chromeDriver.quit();
    }
}
