import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class HomePageTest {

    static HomePage homePage;

    @BeforeAll
    public static void beforeTest()
    {
        homePage = new HomePage();
        homePage.open();
    }

    @AfterAll
    public static void afterTest(){
        homePage.close();
    }

    @Test
    public void test1()
    {
        SoftAssert softAssert = new SoftAssert();
        WebElement element = homePage.getMessageBox();
        String text = element.getText();
        String id = element.getAttribute("id");
        softAssert.assertEquals("No click",text);
//        String style = element.getAttribute("style");
        String s = element.getCssValue("color");
        String color = Color.fromString(s).asRgba();
        softAssert.assertEquals(color,"rgba(0, 0, 255, 1)");
        softAssert.assertEquals("message-box", id);
        softAssert.assertAll();
        System.out.println(s);
        System.out.println(color);

        //String s = t.getCssValue("color");
        //String c = Color.fromString(s).asHex();
    }

//    @Test
//    public void getColor(){
//        SoftAssert softAssert = new SoftAssert();
//        WebElement element = homePage.getMessageBox();
//        String style = element.getAttribute("style");
//        Assertions.assertEquals( "color: blue;", style );
//    }

    @Test
    public void test2() {
        homePage.driver.switchTo().frame(0);
        WebElement button = homePage.findElementByXPath(homePage.button);
        String buttonText = button.getText();
        Assertions.assertEquals("RED",buttonText);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) homePage.driver;
        jsExecutor.executeScript("arguments[0].click();", button);
        homePage.driver.switchTo().defaultContent();
        WebElement messageBox = homePage.getMessageBox();
        String messageBoxText = messageBox.getText();
        Assertions.assertEquals("Clicked!!!",messageBoxText);
        String style = messageBox.getAttribute("style");
        Assertions.assertEquals( "color: red;", style );


    }

    @Test
    public void test3() {
        homePage.driver.switchTo().frame(0);
        WebElement button = homePage.findElementByXPath(homePage.button);
        String buttonText = button.getText();
        Assertions.assertEquals("RED", buttonText);
        Actions actions = new Actions(homePage.driver);
        actions.moveToElement(button, 21, 0).click().perform();
        homePage.driver.switchTo().defaultContent();
        WebElement messageBox = homePage.getMessageBox();
        String messageBoxText = messageBox.getText();
        Assertions.assertEquals("Clicked!!!", messageBoxText);
        String style = messageBox.getAttribute("style");
        Assertions.assertEquals("color: red;", style);
    }

















}
