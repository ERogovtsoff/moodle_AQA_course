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
        //����������� ���� �� �������� � ��� ���������
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //�������� ���������� ��������
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        //���� ��������������� �� ������ �����
        driver.manage().window().maximize();
        //�������� �� ���������� ����� = 10 ���.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //��������� ������ �� �������� ����� �� ����� ��������
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
