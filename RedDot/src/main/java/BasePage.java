import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {

    WebDriver driver = new ChromeDriver();
    public WebDriver getDriver() {
        return driver;
    }


    public void open (String url){
        driver.get(url);
    }
    public  void  close(){
        driver.close();
    }

    public WebElement findElementByXPath(String xPath)
    {
        return driver.findElement(By.xpath(xPath));
    }


}
