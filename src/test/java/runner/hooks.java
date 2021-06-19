package runner;

import driverManagers.ScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;


public class hooks {
    ScenarioContext scenarioContext;

    public hooks(ScenarioContext scenarioContext){
        this.scenarioContext=scenarioContext;
    }

}
