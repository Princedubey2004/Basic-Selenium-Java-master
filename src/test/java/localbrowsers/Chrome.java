package localbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = { "mac", "windows" })
public class Chrome {
    private WebDriver driver;

    @BeforeTest
    public void chromeSetup() {
        ChromeOptions options = new ChromeOptions();
        // Selenium 4 auto-manages ChromeDriver via Selenium Manager
        driver = new ChromeDriver(options);
    }

    @Test
    public void test() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("google"),
                "Expected Google in title but got: " + driver.getTitle());
    }

    @AfterTest
    public void testTeardown() {
        driver.quit();
    }
}
