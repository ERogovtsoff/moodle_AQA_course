package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@aria-live='assertive']")
    private WebElement emptyPasswordHint;

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
// дописать проверку, когда false, когда true
    public boolean isEmptyPasswordHint() {
        return true;
    }
}
