package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PyseraTestStep extends Page {

    @Given("user click on sell box")
    public void userClickOnSellBox() throws InterruptedException {
        scrollDown();
        scrollDown();
        Thread.sleep(6000);
        getPyseraPage().setClickOnSellBox();
    }

    @When("user send {string} into sell box")
    public void userSendIntoSellBox(String amount) throws InterruptedException {
        getPyseraPage().setAmountClickOnSellBox(amount);
        Thread.sleep(10000);
    }

    @And("user send {string} into buy box")
    public void userSendIntoBuyBox(String buyamnt) throws InterruptedException {
        getPyseraPage().setClickOnBuyBox(buyamnt);
        Thread.sleep(3000);
    }

    @And("user select country from footer")
    public void userSelectCountryFromFooter() {
        scrollDownFooter();
        scrollDownFooter();
        scrollDownFooter();
        getPyseraPage().setClickOnFlag();
    }

    @And("user click on country")
    public void userClickOnCountry() {
        getPyseraPage().setClickOnCountry();
    }

    @And("user select Germany")
    public void userSelectGermany() {
        getPyseraPage().setSelectGermany();
    }

    @And("user fill {string} into BUY box")
    public void userFillIntoBUYBox(String buyAmount) throws InterruptedException {
        getPyseraPage().setClickOnBuyBox(buyAmount);
        Thread.sleep(3000);
    }

    @And("user should verify that SELL amount box is emptied")
    public void userShouldVerifyThatSELLAmountBoxIsEmptied() {
        getPyseraPage().setAmountClickOnSellBoxEmpty();
    }

    @And("user fill {string} into SELL box")
    public void userFillIntoSELLBox(String sellAmount) throws InterruptedException {
        getPyseraPage().setAmountClickOnSellBox(sellAmount);
        Thread.sleep(1000);
    }

    @Then("user should verify that BUY amount box is emptied")
    public void userShouldVerifyThatBUYAmountBoxIsEmptied() {
        getPyseraPage().setClickOnBuyBoxEmpty();
    }

    @Given("user goto footer")
    public void userGotoFooter() {
        scrollDownFooter();
        scrollDownFooter();
        scrollDownFooter();
        scrollDownFooter();
    }

    @And("user click on flag icon")
    public void userClickOnFlagIcon() {
        getPyseraPage().setClickOnFlag();
    }

    @Then("user should verify that Germany is selected")
    public void userShouldVerifyThatGermanyIsSelected() {
        getPyseraPage().setSelectGermanyCheck();
    }

    @And("user select United Kingdom")
    public void userSelectUnitedKingdom() {
        getPyseraPage().setSelectUnitedKingdom();
    }


    @And("user should verity currency change to United Kingdom")
    public void userShouldVerityCurrencyChangeToUnitedKingdom() {
        scrollDown();
        scrollDown();
        getPyseraPage().setEuroIsPresent();
    }

    @And("user should verify currency change to Germany")
    public void userShouldVerifyCurrencyChangeToGermany() {
        scrollDown();
        scrollDown();
        getPyseraPage().setUsdIsPresent();
    }

    @Then("User should verify that a text box is displayed which is representing the loss")
    public void userShouldVerifyThatATextBoxIsDisplayedWhichIsRepresentingTheLoss() {
        getPyseraPage().setMinusAmunt();
    }
}
