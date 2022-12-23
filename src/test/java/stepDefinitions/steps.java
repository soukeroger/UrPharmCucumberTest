package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class steps {

    WebDriver driver;


    @Given("User navigates to the UrPharm Store Business Admin website")
    public void user_navigates_to_the_ur_pharm_store_business_admin_website() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://dev-store.urpharm.com/");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("mat-input-0")).sendKeys("qatesters101@gmail.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("Implementation@3");

    }
    @When("The User clicks on the login button")
    public void the_user_clicks_on_the_login_button() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/app-root/app-authentication/div/div/app-login/div[2]/div/mat-card/form/div[4]/button")).click();
        Thread.sleep(5000);
    }

    @Then("The User the user confirms the Page title is UrPharmStore.")
    public void the_user_the_user_confirms_the_page_title_is_ur_pharm_store() {
        String title = driver.getTitle();
        System.out.println("Page Title:"+title);
        Assert.assertTrue(title.contains("UrPharmStore"));
        driver.quit();
    }


    @Given("User navigates to the UrPharmStore Supermarket Business Portal")
    public void user_navigates_to_the_ur_pharm_store_supermarket_business_portal() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://dev-store.urpharm.com/");
    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {
        driver.findElement(By.id("mat-input-0")).sendKeys("ambasaateba@gmail.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("Test123@");
    }
    @Then("User navigates to the UrPharmStore Supermaket Landing Page")
    public void user_navigates_to_the_ur_pharm_store_supermaket_landing_page() {
        String title = driver.getTitle();
        System.out.println("Page Title:"+title);
        Assert.assertTrue(title.contains("UrPharmStore"));
        driver.quit();
    }

}
