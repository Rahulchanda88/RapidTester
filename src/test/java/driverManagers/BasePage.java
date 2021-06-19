package driverManagers;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    public BasePage(ScenarioContext scenarioContext)
    {
        this.driver= scenarioContext.driver;
    }
}
