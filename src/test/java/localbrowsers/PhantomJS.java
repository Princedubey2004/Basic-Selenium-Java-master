package localbrowsers;

import org.testng.annotations.Test;

// PhantomJS is no longer supported in Selenium 3.141.59 - test disabled
@Test(groups = { "disabled" })
public class PhantomJS {
    @Test(enabled = false)
    public void test() {
        // PhantomJS driver removed from Selenium 3.x - skipped
    }
}
