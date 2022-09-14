package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
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
        //����������� ���� �� �������� � ��� ���������
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //�������� ���������� ��������
        driver = new ChromeDriver();
        verivoxPage = new VerivoxPage(driver);
        homePage = new HomePage(driver);
        //���� ��������������� �� ������ �����
        driver.manage().window().maximize();
        //��������� ������ �� �������� ����� �� ����� ��������
        driver.get(ConfProperties.getProperty("homepage"));
    }

    @Test
    public void findSkypeBtn() {
        Assertions.assertTrue(homePage.isSkypeBtnExists());
    }

    @Test
    public void findWhatsAppBtn() {
        Assertions.assertTrue(homePage.isWhatsAppBtnExists());
    }

    @Test
    public void openVerivoxProjectPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", homePage.getVerivoxBtn());
        homePage.clickVerivoxBtn();
        // ��������� ���� ��������� ����������� ��������
        Thread.sleep(500);
        Assertions.assertEquals(verivoxPage.getCurrentUrl(), ConfProperties.getProperty("verivoxpage"));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
