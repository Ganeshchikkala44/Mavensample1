package stepdefenitions;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Test1 {
    @Given("a registered user with user id \"(.*)\" and password \"(.*)\"$")
    public void login(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @When("the user enters the credentials and click on submit button")
    public void step2() {
        System.out.println("in step2");

    }

    @Then("the system should authenticate the user {string}")
    public void step3(String username) {
        System.out.println("iam in step3"+ username);

    }

    @Given("iam registered user with user id \"(.*)\" and password \"(.*)\"$")
    public void iamRegisteredUserWithUsernameAndWithPassword(String username, String password) {
        System.out.println(username);
        System.out.println(password);

    }


    @Given("the user enters data table crades")
    public void theUserEntersDataTableCrades(DataTable usercreads) {
        List<List<String>> data = usercreads.asLists();
        System.out.println(data.get(0).get(0));
        System.out.println(data.get(0).get(1));
        System.out.println(data.get(1).get(0));
        System.out.println(data.get(1).get(1));
    }

    @Given("the user enters the creds")
    public void theUserEntersTheCreds(DataTable creds) {
        List<Map<String, String>> data = creds.asMaps(String.class, String.class);
        System.out.println(data.get(0).get("username"));
        System.out.println(data.get(0).get("password"));
        System.out.println(data.get(0).get("username"));
        System.out.println(data.get(0).get("password"));
    }

    @Given("iam using jsondata")
    public void iamUsingJsondata(String JsonData) {
        String user = JsonPath.parse(JsonData).read("$.Users[2].name");
        String age = JsonPath.parse(JsonData).read("$.Users[2].age");
        System.out.println(user);
        System.out.println(age);
    }



}



