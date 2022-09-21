package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CheckoutPage;
import pages.HomePage;

import java.time.Duration;

public class HeaderTest {
    private static HomePage homePage;
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void propSetup() {
        // путь к хром драйверу
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
    }

    @BeforeEach
    public void setup() {
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("prodHomepage"));
        homePage = new HomePage(driver);
        //создаём явное ожидание
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    @DisplayName("Displaying logo desktop")
    public void displayingLogoDesk() {
        homePage.getHeaderLogo().isDisplayed();
    }

    @Test
    @DisplayName("Clickable logo desktop")
    public void clickableLogoDesk() {
        homePage.clickHeaderLogo();
        wait.until(ExpectedConditions.invisibilityOf(homePage.getHeaderLogo()));
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeaderLogo()));
        homePage.getHeaderLogo().isDisplayed();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
