package stepdefs;

import driverManagers.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class TestSteps {
    ScenarioContext scenarioContext;
    WebDriver driver;
    public  TestSteps(ScenarioContext scenarioContext){
        this.scenarioContext=scenarioContext   ;
        this.driver=scenarioContext.getDriver();
    }

    @Given("test")
    public void test() {
        System.out.println("in test");
        // Write code here that turns the phrase above into concrete actions
        driver.get("google.co.in");
    }
    @Then("test2")
    public void test2() {
        System.out.println("in test2");
        // Write code here that turns the phrase above into concrete actions
        driver.get("gmail.com");
    }

}
