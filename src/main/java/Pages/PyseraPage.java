package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import static Core.WebConnector.driver;
import static org.testng.AssertJUnit.assertEquals;

public class PyseraPage {

    private By clickOnSellBox = By.xpath("/html/body/main/article/section[3]/div/div[2]/div/div/div/div[2]/div[1]/form/div[1]/input");
    private By clickOnBuyBox = By.xpath("/html/body/main/article/section[3]/div/div[2]/div/div/div/div[2]/div[1]/form/div[3]/input");
    private By clickOnFlag = By.xpath("/html/body/footer/div[2]/div/div/div[2]/div/span/span[1]");
    private By clickOnCountry = By.xpath("/html/body/div[3]/div[2]/div/form/div[1]/div/div/button");
    private By selectGermany = By.xpath("/html/body/div[3]/div[2]/div/form/div[1]/div/div/ul/li[9]");
    private By selectCurrencyText = By.xpath("/html/body/main/article/section[1]/div/div/div/div/div[1]/div[1]/span");
    private By selectUnitedKingdom = By.xpath("/html/body/div[3]/div[2]/div/form/div[1]/div/div/ul/li[8]");
    private By euroIsPresent = By.xpath("/html/body/main/article/section[3]/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[1]");
    private By minusAmunt = By.xpath("/html/body/main/article/section[3]/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/span/span/span[2]");
    private By Yvalue = By.xpath("/html/body/main/article/section[3]/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/span/span/span");
    private By Xvalue = By.xpath("/html/body/main/article/section[3]/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/span/span/span[1]");

    public PyseraPage(Page page) {

    }

    public void setMinusAmunt(){

        driver.findElement(minusAmunt).isDisplayed();

        double y = Double.parseDouble(driver.findElement(Yvalue).getText());
        System.out.println(y);
        double x = Double.parseDouble(driver.findElement(Xvalue).getText());
        System.out.println(x);

        String test = driver.findElement(minusAmunt).getText();
        test = test.replace("(", " ");
        test = test.replace(")", " ");

        System.out.println(test);

        double result = Double.parseDouble(test);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(result));

        assertEquals(df.format(x-y),df.format(result));

    }

    public void setEuroIsPresent(){
        Assert.assertEquals(driver.findElement(euroIsPresent).getText(),"EUR (Euro)");
    }

    public void setUsdIsPresent(){
        Assert.assertEquals(driver.findElement(euroIsPresent).getText(),"USD (US Dollar)");
    }

    public void setClickOnSellBox(){
        driver.findElement(clickOnSellBox).clear();
    }

    public void setSelectUnitedKingdom(){
        driver.findElement(selectUnitedKingdom).click();
    }

    public void setAmountClickOnSellBox(String amount){
        driver.findElement(clickOnSellBox).sendKeys(amount);
    }

    public void setAmountClickOnSellBoxEmpty(){
        Assert.assertEquals(driver.findElement(clickOnSellBox).getText(),"");
    }

    public void setClickOnBuyBox(String buyAmount){
        driver.findElement(clickOnBuyBox).sendKeys(buyAmount);
    }

    public void setClickOnBuyBoxEmpty(String buyAmount){
        Assert.assertEquals(driver.findElement(clickOnBuyBox).getText(),"");
    }


    public void setClickOnBuyBoxEmpty(){
        Assert.assertEquals(driver.findElement(clickOnBuyBox).getText(),"");
    }

    public void setClickOnFlag(){
        driver.findElement(clickOnFlag).click();
    }

    public void setClickOnCountry(){
        driver.findElement(clickOnCountry).click();
    }

    public void setSelectGermany(){
        driver.findElement(selectGermany).click();
    }

    public void setSelectGermanyCheck(){
        Assert.assertEquals(driver.findElement(selectGermany).getText(),"Germany");
    }

    public void setSelectCurrencyText(){
        driver.findElement(selectCurrencyText).getText();
        Assert.assertEquals(driver.findElement(selectCurrencyText).getText(),"Currency exchange calculator");
    }



}
