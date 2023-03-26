package StepDefinition;

import Driver.Session;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class egov {
    WebDriver driver;
    @Given("Open browser and go to e-gov.az")
    public void OpenBrowser () throws InterruptedException {
        driver = Session.getDriver();
        driver.get("https://www.e-gov.az/en");
    }

    @When("Press on Allservices")
    public void PressOnAllservices(){
        WebElement allservices = driver.findElement(By.xpath("//a[@href='/en/services']"));
        allservices.click();
    }

    @And("Press on CentralElectionCommission")
    public void PressOnCentralElectionCommission(){
        WebElement CentralElectionCommission = driver.findElement(By.id("230"));
        CentralElectionCommission.click();
    }

    @And("Press on OnlineApplication")
    public void PressOnOnlineApplication () throws InterruptedException {
        Thread.sleep(1000);
        WebElement OnlineApplication = driver.findElement(By.id("2728"));
        OnlineApplication.click();
    }

    @And("Fill fullname input")
    public void fillFullnameInput() throws InterruptedException {
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        Thread.sleep(6000);
        WebElement fullnameInput = driver.findElement(By.xpath("//input[@id='ctl00_HolderBody_txtFullName_I']"));
        fullnameInput.click();
        fullnameInput.sendKeys("gulnar quliyeva");
    }

    @And("Fill country input")
    public void fillCountryInput() {
        WebElement countryInput = driver.findElement(By.id("ctl00_HolderBody_txtCountry_I"));
        countryInput.sendKeys("Azərbaycan");
    }

    @And("Fill city input")
    public void fillCityInput() {
        WebElement cityInput = driver.findElement(By.id("ctl00_HolderBody_txtCity_I"));
        cityInput.sendKeys("Baku");
    }

    @And("Fill adress input")
    public void fillAdressInput() {
        WebElement adressInput = driver.findElement(By.id("ctl00_HolderBody_txtAdres_I"));
        adressInput.sendKeys("Polad Həşimov küçəsi");
    }

    @And("Select contact")
    public void selectContact() throws InterruptedException {
        WebElement contact = driver.findElement(By.id("ctl00_HolderBody_CmbTelKod_I"));
        contact.click();

        Thread.sleep(1000);
        WebElement azercell = driver.findElement(By.id("ctl00_HolderBody_CmbTelKod_DDD_L_LBI0T0"));
        azercell.click();
    }

    @And("Fill number input")
    public void fillNumberInput() {
        WebElement number = driver.findElement(By.id("ctl00_HolderBody_txtContact_I"));
        number.sendKeys("5556677");

    }

    @And("Fill email input")
    public void fillEmailInput() {
        WebElement email = driver.findElement(By.id("ctl00_HolderBody_txtMail_I"));
        email.sendKeys("guuul@gmail.com");
    }

    @And("Select typeOfApplication")
    public void selectTypeOfApplication() throws InterruptedException {
        Thread.sleep(500);
        WebElement typeOfApplication = driver.findElement(By.id("ctl00_HolderBody_CmbApplyType_I"));
        typeOfApplication.click();

        WebElement offer = driver.findElement(By.id("ctl00_HolderBody_CmbApplyType_DDD_L_LBI1T0"));
        offer.click();

    }

    @And("Fill textOfTheApplication input")
    public void fillTextOfTheApplicationInput() {
        WebElement textOfTheApplication = driver.findElement(By.id("ctl00_HolderBody_txtText_I"));
        textOfTheApplication.sendKeys("abndfkjnbdnbnblnbg  blngbjldrnbl");

    }

    @And("Fill recapture")
    public void FillRecapture() throws InterruptedException {
        Thread.sleep(10000);
    }

    @Then("Press send button")
    public void pressSendButton(){
        WebElement send = driver.findElement(By.id("ctl00_HolderBody_BtnSend_B"));
        send.click();
    }
}
