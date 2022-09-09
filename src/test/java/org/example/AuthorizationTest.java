package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AuthorizationTest {
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпл€ра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        //окно разворачиваетс€ на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void authorizationTest() {
        loginPage.inputEmail(ConfProperties.getProperty("email"));
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
        Assert.assertEquals("Your account", homePage.getUserName());
    }

    @Test
    public void emptyPasswordFieldAuthorization() {
        loginPage.inputEmail(ConfProperties.getProperty("email"));
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.isEmptyPasswordHint());
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
