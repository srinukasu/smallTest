import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by anusha on 06/09/16.
 */


public class StepDefs {
    WebDriver driver = new FirefoxDriver();


    @Given("^I am on practiseselenium website$")
    public void i_am_on_practiseselenium_website() throws Throwable {
       driver.get("http://www.practiceselenium.com/welcome.html");
        driver.manage().window().maximize();
    }

    @When("^I click herbal tea$")
    public void i_click_herbal_tea() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000450914890']/span")).click();

    }

    @When("^I choose red type tea$")
    public void i_choose_red_type_tea() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000451959280']/span")).click();


    }

    @Then("^I can see the payment page$")
    public void i_can_see_the_payment_page() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assert (driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000451989411']/div/p/span/strong")).getText().contains("Pay with Credit Card or Log In"));

    }

    @When("^I enter my \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
    public void i_enter_my(String Email, String Name, String Address, String cardtype, String cardnumber, String cardholdername, String verificationcode) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(Email);
        driver.findElement(By.id("name")).sendKeys(Name);
        driver.findElement(By.id("address")).sendKeys(Address);

        //Select card = new Select(driver.findElement(By.xpath(".//*[@id='card_type']")));
        //card.selectByVisibleText("Visa");
        driver.findElement(By.id("card_type")).sendKeys(cardtype);
        driver.findElement(By.id("card_number")).sendKeys(cardnumber);
        driver.findElement(By.id("cardholder_name")).sendKeys(cardholdername);
        driver.findElement(By.id("verification_code")).sendKeys(verificationcode);





    }

}
