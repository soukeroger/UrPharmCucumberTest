package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.TestContextSetup;

import java.util.concurrent.TimeUnit;

public class BusinessCreationStepDef {
    public WebDriver driver;
    TestContextSetup testContextSetup;

    public BusinessCreationStepDef(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }


    @Given("User navigates to UrPharmStore Admin website")
    public void user_navigates_to_ur_pharm_store_admin_website() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://dev-store.urpharm.com/");
    }
    @When("user enters a valid username and password")
    public void user_enters_a_valid_username_and_password() {
        driver.findElement(By.id("mat-input-0")).sendKeys("support@urpharm.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("Implementation@4");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @And("click on the login button")
    public void click_on_the_login_button() {
        driver.findElement(By.xpath("//button[. = 'Login']")).click();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

    @And("The Admin clicks on the Create Business button")
    public void the_admin_clicks_on_the_create_business_button() throws InterruptedException{
        driver.findElement(By.xpath("//app-list-businesses/div/div[2]//span")).click();


    }
    @When("Enters all the details for the Pharmacy")
    public void enters_all_the_details_for_the_pharmacy() throws InterruptedException{
        driver.findElement(By.id("mat-input-3")).sendKeys("Ivy Limited");
        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-8")).sendKeys("PHCY");
        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-4")).sendKeys("test@test.com");
        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-9")).sendKeys("+23767734562");
        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-5")).sendKeys("BLVD De 20Mai");
        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-6")).sendKeys("Yaounde");
        Thread.sleep(1000);
        driver.findElement(By.id("mat-select-3")).click(); //country dropdown menu
        driver.findElement(By.cssSelector("#mat-option-9 > span")).click(); //Cameroon
        Thread.sleep(1000);
        driver.findElement(By.id("mat-select-1")).click(); // Province dropdown
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#mat-option-14 > span")).click(); //Littoral
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#mat-select-4 > div > div.mat-select-value.ng-tns-c122-35 > span")).click(); // Oncall Area
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#mat-option-20 > span")).click();//Douala
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#mat-select-2 > div > div.mat-select-value.ng-tns-c122-27 > span")).click(); //Payment Method
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#mat-option-5 > span")).click(); // MOMO
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#mat-select-5 > div > div.mat-select-value.ng-tns-c122-37 > span")).click(); // Billing Cycle
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#mat-option-2 > span")).click(); // Weekly
        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-7")).sendKeys("50.0343535"); //latitude
        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-11")).sendKeys("60.0224422"); // longitude


    }
    @Then("A UrPharm Businees Portal is successfully created for the New Pharmacy With MTN MOMO as their preferred method of payment")
    public void a_ur_pharm_businees_portal_is_successfully_created_for_the_new_pharmacy_with_mtn_momo_as_their_preferred_method_of_payment() {
        if(driver.getPageSource().contains("Create Business")){
            System.out.println("Text is present");
        }else{
            System.out.println("Text is absent");
        }
            driver.quit();
        }

//    @Given("User navigates to UrPharmStore Admin website to create A Bi-monthly & Orange Money Pharmacy Account")
//    public void user_navigates_to_ur_pharm_store_admin_website_to_create_a_bi_monthly_orange_money_pharmacy_account() {
//        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
//        driver = new FirefoxDriver();
//        driver.get("https://dev-store.urpharm.com/");
//    }
//
//    @When("The UrPharm Admin successfully signs in")
//    public void the_ur_pharm_admin_successfully_signs_in()throws InterruptedException {
//        driver.findElement(By.id("mat-input-0")).sendKeys("support@urpharm.com");
//        driver.findElement(By.id("mat-input-1")).sendKeys("Implementation@4");
//        driver.findElement(By.xpath("//button[. = 'Login")).click();
//        Thread.sleep(1000);
//    }
//
//    @When("Clicks on the Create Business button to create a new Pharmacy")
//    public void clicks_on_the_create_business_button_to_create_a_new_pharmacy() {
//        driver.findElement(By.xpath("//span[. = ' Create businessadd']")).click();
//
//    }
//
//    @When("Enters all the details for the Potential Pharmacy")
//    public void enters_all_the_details_for_the_potential_pharmacy() {
//        driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Anthony Limited");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]")).sendKeys("PHCY");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("test@test.com");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys("+23767734562");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("BLVD De 20Mai");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("Yaounde");
//        driver.findElement(By.xpath("//*[@id=\"mat-select-4\"]/div/div[1]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-option-11\"]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]")).click();
//        driver.findElement(By.xpath("*[@id=\"mat-option-16\"]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-select-5\"]/div/div[1]/span")).click();
//        driver.findElement(By.xpath("*[@id=\"mat-option-22\"]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-select-3\"]/div/div[1]/span")).click(); //Payment Method
//        driver.findElement(By.xpath("//*[@id=\"mat-option-5\"]/span")).click(); // Orange
//        driver.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[1]/span")).click(); // Billing Cycle
//        driver.findElement(By.xpath("//*[@id=\"mat-option-9\"]/span")).click(); // Bi-Monthly
//        driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("50.0343535"); //latitude
//        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-create-business/form/mat-dialog-content/div[2]/mat-form-field[7]/div/div[1]/div[3]")).sendKeys("60.0224422"); // longitude
//        ;
//    }
//    @Then("A UrPharm Business Portal is successfully created for the New Pharmacy With Orange Money as their preferred method of payment")
//    public void a_ur_pharm_business_portal_is_successfully_created_for_the_new_pharmacy_with_orange_money_as_their_preferred_method_of_payment() {
//        if(driver.getPageSource().contains("Save")){
//            System.out.println("Text is present");
//        }else{
//            System.out.println("Text is absent");
//        }
//        driver.quit();
//    }
//
//    @Given("User navigates to UrPharmStore Admin website A website A monthly & Bank Transfer Pharmacy Account")
//    public void user_navigates_to_ur_pharm_store_admin_website_a_website_a_monthly_bank_transfer_pharmacy_account() {
//        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
//        driver = new FirefoxDriver();
//        driver.get("https://dev-store.urpharm.com/");
//    }
//
//    @When("The Admin successfully logs in and is redirected to the Landing Page")
//    public void the_admin_successfully_logs_in_and_is_redirected_to_the_landing_page() throws InterruptedException {
//        driver.findElement(By.id("mat-input-0")).sendKeys("support@urpharm.com");
//        driver.findElement(By.id("mat-input-1")).sendKeys("Implementation@4");
//        driver.findElement(By.xpath("//button[. = 'Login")).click();
//        Thread.sleep(1000);
//    }
//
//    @When("Clicks on the Create Business button to create another Pharmacy account")
//    public void clicks_on_the_create_business_button_to_create_another_pharmacy_account() {
//        driver.findElement(By.xpath("//span[. = ' Create businessadd']")).click();
//
//    }
//
//    @When("Enters all the details for the Pharmacy for the future business")
//    public void enters_all_the_details_for_the_pharmacy_for_the_future_business()  {
//        driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Anthony Limited");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]")).sendKeys("PHCY");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("test@test.com");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys("+23767734562");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("BLVD De 20Mai");
//        driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("Yaounde");
//        driver.findElement(By.xpath("//*[@id=\"mat-select-4\"]/div/div[1]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-option-11\"]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]")).click();
//        driver.findElement(By.xpath("*[@id=\"mat-option-16\"]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-select-5\"]/div/div[1]/span")).click();
//        driver.findElement(By.xpath("*[@id=\"mat-option-22\"]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-select-3\"]/div/div[1]/span")).click(); //Payment Method
//        driver.findElement(By.xpath("//*[@id=\"mat-option-6\"]/span")).click(); // Bank Transfer
//        driver.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[1]/span")).click(); // Billing Cycle
//        driver.findElement(By.xpath("//*[@id=\"mat-option-10\"]/span")).click(); // Monthly
//        driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("50.0343535"); //latitude
//        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-create-business/form/mat-dialog-content/div[2]/mat-form-field[7]/div/div[1]/div[3]")).sendKeys("60.0224422"); // longitude
//
//    }
//    @Then("A UrPharm Business Portal is successfully created for the New Pharmacy With Bank Transfer as their preferred method of payment")
//    public void a_ur_pharm_business_portal_is_successfully_created_for_the_new_pharmacy_with_bank_transfer_as_their_preferred_method_of_payment() {
//        if(driver.getPageSource().contains("Cancel")){
//            System.out.println("Text is present");
//        }else{
//            System.out.println("Text is absent");
//        }
//        driver.quit();
//    }
}
