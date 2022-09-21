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

    @FindBy(xpath = "//div[@id='custom-customer']")
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

    @FindBy(xpath = "//label[@id='near-time']")
    private WebElement nearRadio;

    @FindBy(xpath = "//label[@id='select-date-time']")
    private WebElement selectDateRadio;

    @FindBy(xpath = "//input[@id='input-agree']")
    private WebElement agreeCheckbox;

    @FindBy(xpath = "//textarea[@name='comment']")
    private WebElement commentInputField;

    @FindBy(xpath = "//input[@id='button-custom-order']")
    private WebElement calculateOrder;

    // //div[@id='custom-customer']/div[@class='buttons']/div[@class='pull-right']/input[@id='button-confirm']
    @FindBy(xpath = "//input[@id='button-confirm']")
    private WebElement confirmOrder;

    @FindBy(xpath = "//input[@name='address_1']")
    private WebElement addressInputField;

    @FindBy(xpath = "//iframe[@id='ju_iframe_850758']")
    private WebElement juFrame;

    @FindBy(xpath = "//em")
    private WebElement closeFrameBtn;

    @FindBy(xpath = "//input[@value='cheque']")
    private WebElement cashRadio;

    @FindBy(xpath = "//input[@value='webpay_card']")
    private WebElement cardRadio;

    @FindBy(xpath = "//div[@class='pull-left']")
    private WebElement continueBtn;

    @FindBy(xpath = "//div[@id='custom-confirm']")
    private WebElement confirmSection;

    public WebElement getContinueBtn() {
        return continueBtn;
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void setCashRadio() {
        cashRadio.click();
    }

    public void setCardRadio() {
        cardRadio.click();
    }

    public void setNearTime() {
        nearRadio.click();
    }

    public WebElement getNameInputField() {
        return nameInputField;
    }

    public void closeFrame() {
        closeFrameBtn.click();
    }

    public WebElement getJuFrame() {
        return juFrame;
    }

    public WebElement getAddressInputField() {
        return addressInputField;
    }

    public WebElement getConfirmOrder() {
        return confirmOrder;
    }

    public WebElement getContactSection() {
        return contactSection;
    }

    public WebElement getConfirmSection() {
        return confirmSection;
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
