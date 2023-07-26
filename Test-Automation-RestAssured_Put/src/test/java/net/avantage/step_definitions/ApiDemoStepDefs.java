package net.avantage.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.avantage.api.ApiDemo;

public class ApiDemoStepDefs {
   ApiDemo apiDemo=new ApiDemo();

    @Given("Navigate to leagues URL")
    public void navigate_to_leagues_url() {
        apiDemo.navigateToBaseUrl();
    }

    @Given("Get leagues data")
    public void get_leagues_data() {
        apiDemo.getMethod();
    }

    @And("Get leagues data using hamcrest methods")
    public void getLeaguesDataUsingHamcrestMethods() {
        apiDemo.getMethodUsingHamcrestMatchers();
    }
}
