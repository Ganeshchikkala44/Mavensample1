package stepdefenitions;

import context.DriverContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.LandingPage;
import pages.PageFactoryManager;
import pages.RegistrationPage;

import java.util.List;
import java.util.Map;

public class Registerstepdef {
    private final RegistrationPage registrationPage;
    private final LandingPage landingPage;

    public Registerstepdef(DriverContext context) {

        registrationPage = PageFactoryManager.getRegistrationPage(context.driver);
        landingPage = PageFactoryManager.getLandingpage(context.driver);

    }


    @And("I am a new user registered")
    public void registerNewPage(DataTable userregdata) throws InterruptedException {
        List<Map<String, String>> data = userregdata.asMaps(String.class, String.class);
        landingPage.Closenotification();
        landingPage.loginMenuClick();

        registrationPage.switch_to_registersection();
        registrationPage.setRegUsername(data.get(0).get("username"));
        registrationPage.setRegemailTextbox(data.get(0).get("email"));
        registrationPage.setPasswordTextbox(data.get(0).get("password"));
        registrationPage.register();
        Assert.assertEquals(landingPage.getuserloggedinlabel(),"Hello "+data.get(0).get("username")+" (not "+data.get(0).get("username")+"? Log out)");

        Thread.sleep(2000);
    }

    @And("i logout from the application")
    public void iLogoutFromTheApplication() {
        landingPage.signOut();
    }


}
