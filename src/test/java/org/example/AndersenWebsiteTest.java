package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.VerivoxPage;

public class AndersenWebsiteTest {
    public static VerivoxPage verivoxPage;
    public static HomePage homePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпл€ра драйвера
        driver = new ChromeDriver();
        verivoxPage = new VerivoxPage(driver);
        homePage = new HomePage(driver);
        //окно разворачиваетс€ на полный экран
        driver.manage().window().maximize();
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("homepage"));
    }

    @Test
    public void findSkypeBtn() {
        Assert.assertTrue(homePage.isSkypeBtnExists());
    }

    @Test
    public void findWhatsAppBtn() {
        Assert.assertTrue(homePage.isWhatsAppBtnExists());
    }

    @Test
    public void openVerivoxProjectPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", homePage.getVerivoxBtn());
        homePage.clickVerivoxBtn();
        // подождать пока полностью прогрузитс€ страница
        Thread.sleep(500);
        Assert.assertEquals(verivoxPage.getCurrentUrl(), ConfProperties.getProperty("verivoxpage"));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
