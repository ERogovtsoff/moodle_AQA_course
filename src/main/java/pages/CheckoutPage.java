package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div/div[@class='row']")
    private WebElement contactSection;

    @FindBy(xpath = "//input[@id='customer-input-firstname']")
    private WebElement nameInputField;

    @FindBy(xpath = "//input[@id='customer-input-telephone']")
    private WebElement phoneInputField;

    @FindBy(xpath = "//input[@id='customer-input-email']")
    private WebElement emailInputField;

    @FindBy(xpath = "//input[@value='pickup.pickup']")
    private WebElement pickupRadio;

    @FindBy(xpath = "//input[@value='yandextaxi.yandextaxi']")
    private WebElement deliveryRadio;

    @FindBy(xpath = "//input[@id='input-agree']")
    private WebElement agreeCheckbox;

    @FindBy(xpath = "//textarea[@name='comment']")
    private WebElement commentInputField;

    @FindBy(xpath = "//input[@id='button-custom-order']")
    private WebElement calculateOrder;

    @FindBy(xpath = "//input[@id='button-confirm']")
    private WebElement confirmOrder;

    @FindBy(xpath = "//input[@name='address_1']")
    private WebElement addressInputField;

    public WebElement getAddressInputField() {
        return addressInputField;
    }

    public WebElement getConfirmOrder() {
        return confirmOrder;
    }

    public WebElement getContactSection() {
        return contactSection;
    }

    public void clearNameInputField() {
        nameInputField.clear();
    }

    public void clearAddressInputField() {
        addressInputField.clear();
    }

    public void clearPhoneInputField() {
        phoneInputField.clear();
    }

    public void setName(String name) {
        nameInputField.sendKeys(name);
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneInputField.sendKeys(phoneNumber);
    }

    public void setAddress(String address) {
        addressInputField.sendKeys(address);
    }

    public void chooseDelivery() {
        deliveryRadio.click();
    }

    public void choosePickup() {
        pickupRadio.click();
    }

    public void agreeCheckout() {
        if (!agreeCheckbox.isSelected()) {
            agreeCheckbox.click();
        }
    }

    public void clearCommentInputField() {
        commentInputField.clear();
    }

    public void setComment(String comment) {
        commentInputField.sendKeys(comment);
    }

    public void calculateOrder() {
        calculateOrder.click();
    }

    public void confirmOrder() {
        confirmOrder.click();
    }

    public void clearEmailInputField() {
        emailInputField.clear();
    }

    public void setEmailInputField(String email) {
        emailInputField.sendKeys(email);
    }
}
