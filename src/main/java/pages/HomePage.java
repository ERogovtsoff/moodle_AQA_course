package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
}
