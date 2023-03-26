package StepDefinition;

import Driver.Session;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class voterslist {
    WebDriver driver;
    @Given("Open browser and go to egov")
    public void OpenBrowserAndGoToEgov(){
        driver = Session.getDriver();
        driver.get("https://www.e-gov.az/en");
    }

    @When("Press All services1")
    public void PressAllServices1(){
        WebElement allservices1 = driver.findElement(By.xpath("//a[@href='/en/services']"));
        allservices1.click();
    }
    @And("Press on CentralElection")
    public void PressOnCentralElection(){
        WebElement CentralElection = driver.findElement(By.id("230"));
        CentralElection.click();
    }
    @And("Press on Inclusion of data for voters list")
    public void PressOnInclusionOfDataForVotersList() throws InterruptedException {
        Thread.sleep(1000);
        WebElement PressOnInclusionOfDataForVotersList = driver.findElement(By.id("2726"));
        PressOnInclusionOfDataForVotersList.click();
    }
    @And("Select city region")
    public void SelectCityRegion() throws InterruptedException {
        Thread.sleep(6000);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        WebElement cityRegion = driver.findElement(By.id("ctl00_HolderBody_CmbRayonlar_I"));
        cityRegion.click();

        Thread.sleep(500);
        WebElement abseron = driver.findElement(By.id("ctl00_HolderBody_CmbRayonlar_DDD_L_LBI0T0"));
        abseron.click();
    }
    @And("Select village")
    public void Village() throws InterruptedException {
        Thread.sleep(500);
        WebElement village = driver.findElement(By.id("ctl00_HolderBody_CmbPrKuce_I"));
        village.click();

        Thread.sleep(500);
        WebElement yanvarkucesi = driver.findElement(By.id("ctl00_HolderBody_CmbPrKuce_DDD_L_LBI5T0"));
        yanvarkucesi.click();
    }
    @And("Select home")
    public void home() throws InterruptedException {
        Thread.sleep(500);
        WebElement home = driver.findElement(By.id("ctl00_HolderBody_CmbEvler_I"));
        home.click();

        Thread.sleep(500);
        WebElement evinreqemi = driver.findElement(By.id("ctl00_HolderBody_CmbEvler_DDD_L_LBI1T0"));
        evinreqemi.click();
    }
    @And("Fill last name input")
    public void LastName() throws InterruptedException {
        Thread.sleep(500);
        WebElement lastName = driver.findElement(By.id("ctl00_HolderBody_soyad_I"));
        lastName.sendKeys("Məmmədov");
    }
    @And("Fill name input")
    public void NameInput(){
        WebElement nameInput = driver.findElement(By.id("ctl00_HolderBody_ad_I"));
        nameInput.sendKeys("Əsgər");
    }
    @And("Fill fathers name input")
    public void FathersNameInput(){
        WebElement fathersNameInput = driver.findElement(By.id("ctl00_HolderBody_ata_I"));
        fathersNameInput.sendKeys("Tural");
    }
    @And("Select birthday")
    public void SelectBirthday() throws InterruptedException {
        WebElement selectBirthday = driver.findElement(By.id("ctl00_HolderBody_tevelllud_I"));
        selectBirthday.sendKeys("30.06.1995");
    }
    @And("Select gender")
    public void SelectGender() throws InterruptedException {
        WebElement selectGender = driver.findElement(By.id("ctl00_HolderBody_CboxCins_I"));
        selectGender.click();

        Thread.sleep(500);
        WebElement qadin = driver.findElement(By.id("ctl00_HolderBody_CboxCins_DDD_L_LBI1T1"));
        qadin.click();
    }
    @And("Fill ID number input")
    public void IdNumberInput(){
        WebElement IdNumberInput = driver.findElement(By.id("ctl00_HolderBody_vesiqe_I"));
        IdNumberInput.sendKeys("AZ1234567");
    }
    @And("Select place")
    public void SelectPlace() throws InterruptedException {
        WebElement selectPlace = driver.findElement(By.id("ctl00_HolderBody_CboxOrqan_I"));
        selectPlace.click();

        Thread.sleep(500);
        WebElement vesiqeVerenOrqan = driver.findElement(By.id("ctl00_HolderBody_CboxOrqan_DDD_L_LBI0T0"));
        vesiqeVerenOrqan.click();
    }
    @And("Select ID card date")
    public void SelectIDCardDate() throws InterruptedException {
        Thread.sleep(500);
        WebElement cardDate = driver.findElement(By.id("ctl00_HolderBody_vertarix_I"));
        cardDate.sendKeys("05.04.2019");
    }
    @And("Select the contact")
    public void SelectheContact() throws InterruptedException {
        Thread.sleep(500);
        WebElement contact = driver.findElement(By.id("ctl00_HolderBody_CmbTelKod_I"));
        contact.click();

        Thread.sleep(500);
        WebElement azercell =driver.findElement(By.id("ctl00_HolderBody_CmbTelKod_DDD_L_LBI0T0"));
        azercell.click();
    }
    @And("Fill the number input")
    public void NumberInput() throws InterruptedException {
        Thread.sleep(500);
        WebElement NumberInput = driver.findElement(By.id("ctl00_HolderBody_elaqetel_I"));
        NumberInput.sendKeys("5678901");
    }
    @And("Fill the email input")
    public void EmailInput(){
        WebElement emailInput = driver.findElement(By.id("ctl00_HolderBody_email_I"));
        emailInput.sendKeys("dshbvhbsvh@gmail.com");
    }
    @And("Select reason")
    public void SelectReason() throws InterruptedException {
        WebElement selectReason = driver.findElement(By.id("ctl00_HolderBody_CboxSebeb_I"));
        selectReason.click();

        Thread.sleep(500);
        WebElement melumatYoxdur = driver.findElement(By.id("ctl00_HolderBody_CboxSebeb_DDD_L_LBI0T1"));
        melumatYoxdur.click();
    }
    @And("Fill note input")
    public void noteInput() throws InterruptedException {
        Thread.sleep(500);
        WebElement NoteInput = driver.findElement(By.id("ctl00_HolderBody_qeyd_I"));
        NoteInput.sendKeys("vsgvsbvsdbvabs  dbsiaubuv sd vyuv");
    }
    @And("Fill the recapture")
    public void Recapture() throws InterruptedException {
        Thread.sleep(10000);
    }
    @And("Click the send button")
    public void SendButton(){
        WebElement sendButton = driver.findElement(By.id("ctl00_HolderBody_BtnAddSiyahi_CD"));
        sendButton.click();
    }
}
