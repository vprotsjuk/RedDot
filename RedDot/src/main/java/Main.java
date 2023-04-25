

import org.openqa.selenium.By;

public class Main {

    public static void main(String[] args) {
        HomePage homePage = new HomePage();

        homePage.open("http://amatuscrew.ru/test01/");
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).getText());
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).getAttribute(""));
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).getCssValue(""));
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).getLocation());
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).getTagName());
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).getClass());
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).getRect());
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).isDisplayed());
        System.out.println(homePage.getDriver().findElement(By.xpath(homePage.text)).isEnabled());
//        homePage.getDriver().findElement(By.xpath(homePage.text)).clear();



        homePage.getDriver().close();



    }

}