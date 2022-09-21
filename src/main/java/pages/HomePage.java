package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='fb_cart']")
    private WebElement cartBtn;

    @FindBy(xpath = "//div[@id='product_68']//button")
    private WebElement addElementBtn;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement confirmBtn;

    @FindBy(xpath = "//nav[@id='navbar-header']//a[contains(@class, 'only-desktop')]/img[@src='catalog/view/theme/Strudel/image/logo.png']")
    private WebElement headerLogo;

    @FindBy(xpath = "//nav[@id='navbar-header']//div[contains(@class, 'links')]/li[1]")
    private WebElement headerHomeBtn;

    @FindBy(xpath = "//nav[@id='navbar-header']//div[contains(@class, 'links')]/li[2]")
    private WebElement headerMenuBtn;

    @FindBy(xpath = "//nav[@id='navbar-header']//div[contains(@class, 'links')]/li[3]")
    private WebElement headerDiscountsBtn;

    @FindBy(xpath = "//nav[@id='navbar-header']//div[contains(@class, 'links')]/li[4]")
    private WebElement headerFeedbacksBtn;

    @FindBy(xpath = "//nav[@id='navbar-header']//div[contains(@class, 'links')]/li[5]")
    private WebElement headerContactsBtn;

    @FindBy(xpath = "//nav[@id='navbar-header']//div[contains(@class, 'links')]/li[6]")
    private WebElement headerDeliveryBtn;

    @FindBy(xpath = "//nav[@id='navbar-header']")
    private WebElement header;

    public WebElement getHeaderDiscountsBtn() {
        return headerDiscountsBtn;
    }

    public WebElement getHeaderFeedbacksBtn() {
        return headerFeedbacksBtn;
    }

    public WebElement getHeaderContactsBtn() {
        return headerContactsBtn;
    }

    public WebElement getHeaderDeliveryBtn() {
        return headerDeliveryBtn;
    }

    public WebElement getHeaderMenuBtn() {
        return headerMenuBtn;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getHeaderHomeBtn() {
        return headerHomeBtn;
    }

    public WebElement getHeaderLogo() {
        return headerLogo;
    }

    public WebElement getConfirmBtn() {
        return confirmBtn;
    }

    public void clickHeaderLogo() {
        headerLogo.click();
    }

    public void clickCartBtn() {
        cartBtn.click();
    }

    public void clickAddElementBtn() {
        addElementBtn.click();
    }

    public void clickConfirmBtn() {
        confirmBtn.click();
    }

    public void clickHomeBtn() {
        headerHomeBtn.click();
    }

    public void clickMenuBtn() {
        headerMenuBtn.click();
    }

    public void clickDiscountsBtn() {
        headerDiscountsBtn.click();
    }

    public void clickFeedbacksBtn() {
        headerFeedbacksBtn.click();
    }

    public void clickContactsBtn() {
        headerContactsBtn.click();
    }

    public void clickDeliveryBtn() {
        headerDeliveryBtn.click();
    }
}
