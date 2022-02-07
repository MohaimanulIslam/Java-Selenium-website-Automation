package Base;

import Core.WebConnector;
import Pages.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;

public class Base extends Page {

    @Before("@pysera")
    public void startTest()  {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.get(myProp.getProperty("weburl"));
        driver.manage().window().maximize();
    }

    @After
    public void afterTest() {
        if (driver != null) {
//            driver.quit();
        }

    }
}
