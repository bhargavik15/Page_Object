package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By UserName=By.id("email");
    By Password=By.id("pass");
    By ClickButton=By.xpath("//button[@type='submit']");

    LoginPage(WebDriver driver){
      this.driver=driver;
    }
    public void setUserName(String fname){
        driver.findElement(UserName).sendKeys(fname);
    }
    public void setPassword(String pwd){
        driver.findElement(Password).sendKeys(pwd);
    }
    public void Click_Button(){
        driver.findElement(ClickButton).click();
    }
}
