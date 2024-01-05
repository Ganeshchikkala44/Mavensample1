package SampleTest1;

import Factory.Driverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= Driverfactory.initializeDriver("edge");
        driver.get("https://automationzone.in/");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#mf-newsletter-popup>div+div>a>i")).click();
        LandingPage landingPage=new LandingPage(driver);
        landingPage.Closenotification();
        landingPage.loginMenuClick();
        landingPage.enterUsername("Test12user");
        landingPage.enterPassword("paswor@123#$");
        landingPage.loginClick();
        driver.quit();

    }
}
