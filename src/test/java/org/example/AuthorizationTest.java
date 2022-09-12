package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthorizationTest {
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        //����������� ���� �� �������� � ��� ���������
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //�������� ���������� ��������
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        //���� ��������������� �� ������ �����
        driver.manage().window().maximize();
        //��������� ������ �� �������� ����� �� ����� ��������
        driver.get(ConfProperties.getProperty("logging"));
    }

    @Test
    public void authorizationTest() {
        loginPage.inputEmail(ConfProperties.getProperty("email"));
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
        Assert.assertEquals("Your account", homePage.getUserName());
    }

    @AfterClass
    public static void tearDown() {
        homePage.openAccountPage();
        loginPage.clickSignOutBtn();
        driver.quit();
    }
}
