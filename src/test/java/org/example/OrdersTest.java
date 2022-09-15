package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.CheckoutPage;

import java.time.Duration;

public class OrdersTest {
    private static CheckoutPage checkoutPage;
    private static HomePage homePage;
    private static WebDriver driver;
    private static WebDriverWait wait;

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
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    @DisplayName("Checking order. Pickup")
    public void pickupOrder() {
        homePage.clickAddElementBtn();
        wait.until(ExpectedConditions.visibilityOf(homePage.getConfirmBtn()));
        homePage.clickConfirmBtn();
        homePage.clickCartBtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", checkoutPage.getContactSection());
        checkoutPage.clearNameInputField();
        checkoutPage.setName(ConfProperties.getProperty("name"));
        checkoutPage.clearPhoneInputField();
        checkoutPage.setPhoneNumber(ConfProperties.getProperty("phoneNumber"));
        checkoutPage.clearEmailInputField();
        checkoutPage.setEmailInputField(ConfProperties.getProperty("email"));
        checkoutPage.choosePickup();
        checkoutPage.agreeCheckout();
        checkoutPage.clearCommentInputField();
        checkoutPage.setComment(ConfProperties.getProperty("comment"));
        checkoutPage.calculateOrder();
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getConfirmOrder()));
        checkoutPage.confirmOrder();
    }

    @Test
    @DisplayName("Checking order. Delivery")
    public void deliveryOrder() throws InterruptedException {
        homePage.clickAddElementBtn();
        wait.until(ExpectedConditions.visibilityOf(homePage.getConfirmBtn()));
        homePage.clickConfirmBtn();
        homePage.clickCartBtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", checkoutPage.getContactSection());
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
        checkoutPage.agreeCheckout();
        checkoutPage.clearCommentInputField();
        checkoutPage.setComment(ConfProperties.getProperty("comment"));
        checkoutPage.calculateOrder();
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getConfirmOrder()));
        checkoutPage.confirmOrder();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
