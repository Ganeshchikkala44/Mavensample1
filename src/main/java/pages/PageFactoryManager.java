package pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    private static LandingPage landingpage;
    private static RegistrationPage registrationPage;
    public static LandingPage getLandingpage(WebDriver driver) {
        return landingpage == null ? new LandingPage(driver) : landingpage;

    }
    public static  RegistrationPage getRegistrationPage(WebDriver driver){
        return registrationPage == null? new RegistrationPage(driver) : registrationPage;

    }


}
