package Pages;

import BaseClass.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Createrepo extends SeleniumBase {
    public Createrepo(RemoteWebDriver driver){
        this.driver=driver;
    }
    public void enterrepodetails(String reponame,String description){
       type(driver.findElement(By.id(properties.getProperty("repo.name.id"))),reponame);
        type(driver.findElement(By.id(properties.getProperty("repo.description.id"))),description);
    }
    public boolean getselectedrepotype(){
        return driver.findElement(By.xpath(properties.getProperty("repo.publicinput.xpath"))).isSelected();
    }
    public void clickrepo(){
        click(driver.findElement(By.xpath(properties.getProperty("repo.createbtn.xpath"))));
    }
}
