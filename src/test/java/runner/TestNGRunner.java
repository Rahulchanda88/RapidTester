package runner;

import driverManagers.ScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


@CucumberOptions(
        features = {"src/test/resources/features"}
        ,glue = {"stepdefs","runner"}
        ,monochrome = true
        ,dryRun = true
        ,plugin = {"pretty"}
)

public class TestNGRunner  extends AbstractTestNGCucumberTests{
    ScenarioContext scenarioContext=new ScenarioContext();

    @BeforeTest    
    public void setup(){
        WebDriver driver;
        //fetches testng parameter from the testng.xml file for the test
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        switch (browser.toLowerCase()){
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
        }
        scenarioContext.setDriver(driver);

    }
    @AfterTest
    public void closeBrowser(){
        scenarioContext.getDriver().quit();
    }


    @DataProvider(parallel=true)
    public java.lang.Object[][] scenarios(){
        return super.scenarios();
    }

}
