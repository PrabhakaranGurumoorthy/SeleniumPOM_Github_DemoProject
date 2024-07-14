package BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class common extends SeleniumBase{
    protected Properties prop;
    @BeforeTest
    public void setup(){
        prop=new Properties();
        try {
            prop.load(new FileInputStream("testdata.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://github.com/");
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }

}
