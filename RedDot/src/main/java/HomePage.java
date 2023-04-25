


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

public class HomePage extends BasePage{
    final  String text = "//div[@id='message-box']";
    final  String iFrame = "//body/iframe[1]";
    final String button = "//button[@id='red-button']";

    public void open() {
        open("http://amatuscrew.ru/test01/");
    }

    public WebElement getMessageBox()
    {
        return findElementByXPath(text);
    }
}
