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
        // ��������� ���� ��������� ����������� ��������
        Thread.sleep(500);
        Assert.assertEquals(verivoxPage.getCurrentUrl(), ConfProperties.getProperty("verivoxpage"));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
