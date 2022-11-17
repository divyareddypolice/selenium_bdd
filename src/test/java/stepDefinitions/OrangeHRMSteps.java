package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    WebDriver driver;

   /* @Given("user launch chrome browser")
    public void user_launch_chrome_browser(){
        System.setProperty("webDriver.chrome.driver","D://Drivers//chromedriver.exe");
driver= new ChromeDriver();
    }
*/
   @Given("user launch chrome browser")
   public void user_launch_chrome_browser() {
       System.setProperty("webDriver.chrome.driver","D://Drivers//chromedriver.exe");
       driver= new ChromeDriver();
       throw new io.cucumber.java.PendingException();
   }

    @When("user open orange HRM homepage")
    public void user_Open_OrangeHRM_Homepage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @Then("user verify that logo present on page")
    public void user_Verify_That_Logo_Present_On_Page(){
        boolean status= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
        Assert.assertEquals(true,status);

    }

    @And("user close the browser")
    public void user_Close_The_Browser(){
        driver.quit();
    }



}
