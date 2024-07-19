package Pages;

import BaseClass.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SettingsPage extends SeleniumBase {
    public SettingsPage(RemoteWebDriver driver){
        this.driver=driver;
    }
    public void clickdeleterepo(){
        click(driver.findElement(By.xpath(properties.getProperty("repo.deletebtn.xpath"))));
    }
    public void confirmdeleterepo(String reponame,String username){
        click(driver.findElement(By.cssSelector(properties.getProperty("repo.confirmdeletebtn.cssselector"))));
        type(driver.findElement(By.xpath(properties.getProperty("repo.inputfeild.xpath"))),username.concat("/"+reponame));

    }
}
