package Pages;

import BaseClass.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Createrepo extends SeleniumBase {
    public Createrepo(RemoteWebDriver driver){
        this.driver=driver;
    }
    public void enterrepodetails(String reponame,String description){
       type(driver.findElement(By.xpath(properties.getProperty("repo.name.xpath"))),reponame);
        type(driver.findElement(By.xpath(properties.getProperty("repo.description.xpath"))),description);
    }
//    public boolean getselectedrepotype(){
//        return driver.findElement(By.xpath(properties.getProperty("repo.publicinput.xpath"))).isSelected();
//    }
    public void clickrepo(){
        click(driver.findElement(By.xpath(properties.getProperty("repo.createbtn.xpath"))));
    }
}
