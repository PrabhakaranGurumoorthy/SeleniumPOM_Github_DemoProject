package Pages;

import BaseClass.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends SeleniumBase {
    public LoginPage(RemoteWebDriver driver){
        this.driver=driver;
    }
    public void login(String username,String password){
        type(driver.findElement(By.xpath(properties.getProperty("LoginPage.username.xpath"))),username);
        type(driver.findElement(By.xpath(properties.getProperty("LoginPage.password.xpath"))),password);
        click(driver.findElement(By.cssSelector(properties.getProperty("LoginPage.button.cssselector"))));
    }

}
