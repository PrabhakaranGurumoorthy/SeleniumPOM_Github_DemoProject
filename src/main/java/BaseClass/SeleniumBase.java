package BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SeleniumBase {
    protected RemoteWebDriver driver=null;
    protected static WebDriverWait wait=null;
    protected Properties properties = null;

    public SeleniumBase(){
        properties=new Properties();
        try {
            properties.load(new FileInputStream("locators.properties"));
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String gettittle(){
        return driver.getTitle();
    }

    public void click(WebElement ele){
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();
    }

    public void type(WebElement ele,String data){
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.clear();
        ele.sendKeys(data);
    }
}
