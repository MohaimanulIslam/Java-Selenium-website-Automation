package Pages;

import Core.ConfigUtil;
import Core.WebConnector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public WebDriver driver = WebConnector.driver;

    PyseraPage pyseraPage = new PyseraPage(this);
    protected PyseraPage getPyseraPage() { return pyseraPage; }


    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
    }

    public void scrollDownFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1250)", "");
    }


}
