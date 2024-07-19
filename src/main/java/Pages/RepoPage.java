package Pages;

import BaseClass.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RepoPage extends SeleniumBase {
    public RepoPage(RemoteWebDriver driver){
        this.driver=driver;
    }

    public boolean isrepocreated(String reponame){
        String reponame1= driver.findElement(By.xpath("//a[@data-analytics-event='{\"category\":\"SiteHeaderComponent\",\"action\":\"context_region_crumb\",\"label\":\"summa\",\"screen_size\":\"full\"}']")).toString();
        return reponame1.equals(reponame);
    }
    public void clicksetting(){
        WebElement settings=driver.findElement(By.cssSelector(properties.getProperty("repo.settings.cssselctor")));
        click(settings);

    }
}
