package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.VerivoxPage;

public class AndersenWebsiteTest {
    public static VerivoxPage verivoxPage;
    public static HomePage homePage;
    public static WebDriver driver;

    @BeforeAll
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
    @DisplayName("Displaying Skype button")
    public void findSkypeBtn() {
        Assertions.assertTrue(homePage.isSkypeBtnExists());
    }

    @Test
    @DisplayName("Displaying WhatsApp button")
    public void findWhatsAppBtn() {
        Assertions.assertTrue(homePage.isWhatsAppBtnExists());
    }

    @Test
    @DisplayName("Opening Verivox project page")
    public void openVerivoxProjectPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", homePage.getVerivoxBtn());
        homePage.clickVerivoxBtn();
        // подождать пока полностью прогрузитс€ страница
        Thread.sleep(500);
        Assertions.assertEquals(verivoxPage.getCurrentUrl(), ConfProperties.getProperty("verivoxpage"));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
