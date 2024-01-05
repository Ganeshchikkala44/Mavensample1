package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage {
    @FindBy(css = "#mf-newsletter-popup>div+div>a")
    private WebElement closenotificationLink;
    @FindBy(css =".extras-menu>li+li+li")
    private WebElement loginMenuLink;
    @FindBy(id="username")
    private WebElement usernameTextbox;
    @FindBy(id="password")
    private WebElement passwordTextbox;
    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginButton;
  //  WebDriverWait wait = new WebDriverWait(driver, 30);
  // WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()[contains(.,'Hello')]]")));

   @FindBy(xpath="//p[text()[contains(.,'Hello')]]")

   private WebElement loggedinuserLabel;
    @FindBy(xpath ="(//a[text()='Log out'])[1]" )
    private WebElement logoutLink;

    public LandingPage(WebDriver driver) {
        super(driver);
    }


    public void Closenotification() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", closenotificationLink);

    }
    public void loadAplication(String url){
        driver.get(url);
    }
    public void loginMenuClick() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginMenuLink);
        loginMenuLink.click();
    }
    public void enterUsername(String username){
        wait.until(ExpectedConditions.elementToBeClickable(usernameTextbox)).sendKeys(username);
    }
    public void enterPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordTextbox)).sendKeys(password);

    }
    public void loginClick(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

    }
    public String getuserloggedinlabel() {

        return wait.until(ExpectedConditions.visibilityOf(loggedinuserLabel)).getText();
    }

    public void signOut(){
        wait.until(ExpectedConditions.visibilityOf(logoutLink));
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
           // ((JavascriptExecutor)driver).executeScript("argument[0.scrollIntoView(true);",logoutLink);
           // ((JavascriptExecutor)driver).executeScript("argument[0].click();",logoutLink);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",logoutLink);

    }


}



