package stepdefenitions;

import Utils.Configloader;
import context.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.PageFactoryManager;

public class LandingpageStepdef {
    private final LandingPage landingpage;

    public LandingpageStepdef(DriverContext context) {
        landingpage = PageFactoryManager.getLandingpage(context.driver);
    }

    @Given("I am on the automation-zone shopping page")
    public void load() {
        //landingpage.loadAplication("https://automationzone.in/");
        //String url= Propertyutils.Propertyloader("src\test\java\resources\prod_config.properties").getProperty("baseURL");
        String url = Configloader.getConfigloader().geturl();
        landingpage.loadAplication(url);

    }

    @When("I enter my username {string} and password {string}")
    public void iEnterMyUsernameAndPassword(String username, String password) throws InterruptedException {
        landingpage.Closenotification();
        landingpage.loginMenuClick();
        landingpage.enterUsername(username);
        landingpage.enterPassword(password);
        landingpage.loginClick();
    }


    @Then("the  users {string} logged in successfully")
    public void theUsersLoggedInSuccessfully(String username) {
        System.out.println(username + "logged in successfully");
    }



}




