package driverManagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebdriverActions {
    ScenarioContext scenarioContext;
    WebDriver driver;
    public WebdriverActions(ScenarioContext scenarioContext){
        this.scenarioContext=scenarioContext;
        driver=scenarioContext.driver;
    }

    public void Click(WebElement el){
        el.click();
    }
    public void setText(WebElement el,String text){
        el.sendKeys(text);
    }

}
