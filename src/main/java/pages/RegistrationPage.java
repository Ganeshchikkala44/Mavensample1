package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage  extends  BasePage {
    @FindBy(xpath = "//*[@class='martfury-login-tabs']//a[text()='Register']")
    private WebElement registerSectionLink;

    @FindBy(css="#reg_username")
    private WebElement regUsernameTextbox;
    @FindBy(css="#reg_email")
    private  WebElement regemailTextbox;

    @FindBy(css="#reg_password")
    private WebElement regPasswordTextbox;
    @FindBy(xpath="//button[@name='register']")
    private WebElement regButton;

    public RegistrationPage(WebDriver driver) {

        super(driver);
    }
    public void switch_to_registersection() {
       // wait.until(ExpectedConditions.visibilityOf(registerSectionLink)).click();
          wait.until(ExpectedConditions.elementToBeClickable(registerSectionLink)).click();
    }
    public void setRegUsername(String username){
        wait.until(ExpectedConditions.visibilityOf(regUsernameTextbox)).sendKeys(username);
    }
    public void setPasswordTextbox(String password){
        wait.until(ExpectedConditions.visibilityOf(regPasswordTextbox)).sendKeys(password);


    }

    public void setRegemailTextbox(String email){
        wait.until(ExpectedConditions.visibilityOf(regemailTextbox)).sendKeys(email);
    }

    public void register(){
        wait.until(ExpectedConditions.elementToBeClickable(regButton)).click();

    }


}
