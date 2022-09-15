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

    @FindBy(xpath = "//a[@id='fb_cart']")
    private WebElement cartBtn;

    @FindBy(xpath = "//div[@id='product_68']//button")
    private WebElement addElementBtn;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement confirmBtn;

    public WebElement getConfirmBtn() {
        return confirmBtn;
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
