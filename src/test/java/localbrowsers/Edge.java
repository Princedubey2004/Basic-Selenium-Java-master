package localbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Edge {
    private WebDriver driver;

    @BeforeClass
    public void edgeSetup() {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
    }

    @Test(groups = { "windows" })
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
