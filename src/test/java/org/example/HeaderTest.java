package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DeliveryPage;
import pages.HomePage;

import java.time.Duration;

public class HeaderTest {
    private static HomePage homePage;
    private static DeliveryPage deliveryPage;
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
        deliveryPage = new DeliveryPage(driver);
        //создаём явное ожидание
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    @DisplayName("Displaying logo desktop")
    public void displayingLogoDesk() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderLogo().isDisplayed();
    }

    @Test
    @DisplayName("Displaying Home button")
    public void displayingHomeBtn() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderHomeBtn().isDisplayed();
    }

    @Test
    @DisplayName("Displaying Menu button")
    public void displayingMenuBtn() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderMenuBtn().isDisplayed();
    }

    @Test
    @DisplayName("Displaying Discounts button")
    public void displayingDiscountsBtn() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderDiscountsBtn().isDisplayed();
    }

    @Test
    @DisplayName("Displaying Reviews button")
    public void displayingReviewsBtn() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderFeedbacksBtn().isDisplayed();
    }

    @Test
    @DisplayName("Displaying Contacts button")
    public void displayingContactsBtn() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderContactsBtn().isDisplayed();
    }

    @Test
    @DisplayName("Displaying Delivery button")
    public void displayingDeliveryBtn() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderDeliveryBtn().isDisplayed();
    }

    @Test
    @DisplayName("Redirect to Home anchor using Home button")
    public void redirectOnHomeBtn() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderHomeBtn().isDisplayed();
        homePage.clickHomeBtn();
        Assertions.assertEquals("https://strudelcava.by/#home", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Redirect to Menu anchor using Menu button")
    public void redirectOnMenuBtn() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderMenuBtn().isDisplayed();
        homePage.clickMenuBtn();
        Assertions.assertEquals("https://strudelcava.by/#menu", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Redirect to Home anchor using Discounts button")
    public void redirectOnDiscountsBtn(){
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderDiscountsBtn().isDisplayed();
        homePage.clickDiscountsBtn();
        Assertions.assertEquals("https://strudelcava.by/#home", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Redirect to Feedbacks anchor using Feedbacks button")
    public void redirectOnFeedbacksBtn(){
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderFeedbacksBtn().isDisplayed();
        homePage.clickFeedbacksBtn();
        Assertions.assertEquals("https://strudelcava.by/#gtco-feedbacks", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Redirect to Contacts anchor using Contacts button")
    public void redirectOnContactsBtn(){
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderContactsBtn().isDisplayed();
        homePage.clickContactsBtn();
        Assertions.assertEquals("https://strudelcava.by/#contacts", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Redirect to Delivery page using Delivery button")
    public void redirectOnDeliveryBtn(){
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderDeliveryBtn().isDisplayed();
        homePage.clickDeliveryBtn();
        wait.until(ExpectedConditions.visibilityOf(deliveryPage.getHeader()));
        Assertions.assertEquals("https://strudelcava.by/dostavka", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Redirect to Home page using Logo")
    public void clickableLogoDesk() {
        wait.until(ExpectedConditions.visibilityOf(homePage.getHeader()));
        homePage.getHeaderLogo().isDisplayed();
        homePage.getHeaderHomeBtn().isDisplayed();
        homePage.clickHomeBtn();
        homePage.clickHeaderLogo();
        Assertions.assertEquals("https://strudelcava.by/", driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
