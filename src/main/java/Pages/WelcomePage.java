package Pages;

import BaseClass.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WelcomePage extends SeleniumBase {
    public WelcomePage(RemoteWebDriver driver){
        this.driver=driver;
    }
    public void clicknewrepo(){
       WebElement newrepo= driver.findElement(By.xpath(properties.getProperty("WelcomePage.newrepo.xpath")));
       click(newrepo);
    }
    public String getdeletemessage(){
      return driver.findElement(By.xpath(properties.getProperty("welcomepage.message.xpath"))).getText();
    }
}
