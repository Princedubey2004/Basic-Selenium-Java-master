package localbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = { "mac", "windows" })
public class Firefox {
    private WebDriver driver;

    @BeforeTest
    public void firefoxSetup() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
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
