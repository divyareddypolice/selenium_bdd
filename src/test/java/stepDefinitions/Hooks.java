package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webDriver.chrome.driver","D://Drivers//chromedriver.exe");
        driver= new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
