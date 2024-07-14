package Pages;

import BaseClass.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SettingsPage extends SeleniumBase {
    public SettingsPage(RemoteWebDriver driver){
        this.driver=driver;
    }
    public void clickdeleterepo(String reponame, String username){
        click(driver.findElement(By.id(properties.getProperty("repo.deletebtn.id"))));
    }
    public void confirmdeleterepo(String reponame,String username){
        click(driver.findElement(By.id(properties.getProperty("repo.confirmdeletebtn.id"))));
        type(driver.findElement(By.xpath(properties.getProperty("repo.inputfeild.xpath"))),username.concat("/"+reponame));

    }
}
