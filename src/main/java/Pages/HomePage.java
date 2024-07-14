package Pages;

import BaseClass.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends SeleniumBase {
    public HomePage(RemoteWebDriver driver){
        this.driver=driver;
    }
    public void clicksignin(){
        String signinlocator= properties.get("HomePage.signIn.text").toString();
        WebElement Signin=driver.findElement(By.linkText(signinlocator));
        click(Signin);

    }
}
