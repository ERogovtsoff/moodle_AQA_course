package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='https://join.skype.com/aM8R4P4dNJdy']")
    private WebElement skypeBtn;

    @FindBy(xpath = "//a[@href='https://chat.whatsapp.com/HEVIsiSlYBmG34VtaPcgmu']")
    private WebElement whatsAppBtn;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/footer/section/div/section/div/a[text()='Verivox']")
    private WebElement verivoxBtn;

    public boolean isSkypeBtnExists() {
        return skypeBtn.isEnabled();
    }

    public boolean isWhatsAppBtnExists() {
        return whatsAppBtn.isEnabled();
    }

    public void clickVerivoxBtn() {
        verivoxBtn.click();
    }

    public WebElement getVerivoxBtn() {
        return verivoxBtn;
    }
}
