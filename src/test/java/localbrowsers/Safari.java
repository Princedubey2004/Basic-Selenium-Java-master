package localbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = { "mac" })
public class Safari {
    private WebDriver driver;

    @BeforeTest
    public void safariSetup() {
        SafariOptions options = new SafariOptions();
        driver = new SafariDriver(options);
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
