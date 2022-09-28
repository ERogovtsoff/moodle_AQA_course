package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CheckoutPage;
import pages.HomePage;

import java.time.Duration;

public class OrdersTest {
    private static CheckoutPage checkoutPage;
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
        //создание экземпл€ра драйвера
        driver = new ChromeDriver();
        //окно разворачиваетс€ на полный экран
        driver.manage().window().maximize();
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("devHomepage"));
        checkoutPage = new CheckoutPage(driver);
        homePage = new HomePage(driver);
        //создаЄм €вное ожидание
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    @DisplayName("Checking order. Pickup")
    public void pickupOrder() {
        homePage.clickAddElementBtn();
        wait.until(ExpectedConditions.visibilityOf(homePage.getConfirmBtn()));
        homePage.clickConfirmBtn();
        homePage.clickCartBtn();
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getContactSection()));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", checkoutPage.getContactSection());
        // отключение модального окна с розыгрышем
        /*wait.until(ExpectedConditions.visibilityOf(checkoutPage.getJuFrame()));
        driver.switchTo().frame(checkoutPage.getJuFrame());
        checkoutPage.closeFrame();
        driver.switchTo().parentFrame();*/
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getNameInputField()));
        checkoutPage.clearNameInputField();
        checkoutPage.setName(ConfProperties.getProperty("name"));
        checkoutPage.clearPhoneInputField();
        checkoutPage.setPhoneNumber(ConfProperties.getProperty("phoneNumber"));
        checkoutPage.clearEmailInputField();
        checkoutPage.setEmailInputField(ConfProperties.getProperty("email"));
        checkoutPage.choosePickup();
        checkoutPage.setNearTime();
        checkoutPage.setCashRadio();
        checkoutPage.clearCommentInputField();
        checkoutPage.setComment(ConfProperties.getProperty("comment"));
        checkoutPage.agreeCheckout();
        checkoutPage.calculateOrder();
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getConfirmSection()));
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getConfirmOrder()));
        js.executeScript("arguments[0].scrollIntoView();", checkoutPage.getConfirmOrder());
        checkoutPage.confirmOrder();
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getContinueBtn()));
        checkoutPage.clickContinueBtn();
        wait.until(ExpectedConditions.invisibilityOf(checkoutPage.getContinueBtn()));
    }

    @Test
    @DisplayName("Checking order. Delivery")
    public void deliveryOrder() {
        homePage.clickAddElementBtn();
        wait.until(ExpectedConditions.visibilityOf(homePage.getConfirmBtn()));
        homePage.clickConfirmBtn();
        homePage.clickCartBtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", checkoutPage.getContactSection());
        /*wait.until(ExpectedConditions.visibilityOf(checkoutPage.getJuFrame()));
        driver.switchTo().frame(checkoutPage.getJuFrame());
        checkoutPage.closeFrame();
        driver.switchTo().parentFrame();*/
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getNameInputField()));
        checkoutPage.clearNameInputField();
        checkoutPage.setName(ConfProperties.getProperty("name"));
        checkoutPage.clearPhoneInputField();
        checkoutPage.setPhoneNumber(ConfProperties.getProperty("phoneNumber"));
        checkoutPage.clearEmailInputField();
        checkoutPage.setEmailInputField(ConfProperties.getProperty("email"));
        checkoutPage.chooseDelivery();
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getAddressInputField()));
        checkoutPage.clearAddressInputField();
        checkoutPage.setAddress(ConfProperties.getProperty("address"));
        checkoutPage.setNearTime();
        checkoutPage.setCardRadio();
        checkoutPage.clearCommentInputField();
        checkoutPage.setComment(ConfProperties.getProperty("comment"));
        checkoutPage.agreeCheckout();
        checkoutPage.calculateOrder();
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getConfirmOrder()));
        js.executeScript("arguments[0].scrollIntoView();", checkoutPage.getConfirmOrder());
        checkoutPage.confirmOrder();
        wait.until(ExpectedConditions.invisibilityOf(checkoutPage.getConfirmOrder()));
        Assertions.assertEquals("https://payment.webpay.by/", checkoutPage.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
