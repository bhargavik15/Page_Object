package page_object_model;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    @Test
    public void verifyFbLoginPage(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        LoginPage loginPage=new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        loginPage.setUserName("Honey");
        loginPage.setPassword("123456789");
        loginPage.Click_Button();
        if(driver.getPageSource().contains("Facebook helps you connect and share with the people in your life.")){
            System.out.println("Fb login page executed");
        }
        else
        {
            System.out.println("Fb login page is not displayed");
        }



    }
    @BeforeTest
    public void close(){
        driver.close();
    }
}
