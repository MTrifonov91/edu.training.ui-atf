package steps;

import config.DriverFactory;
import config.PropertiesManager;
import config.ScreenshotConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

@Slf4j
public class ExecutionHooks {
    private final String URL = PropertiesManager.getProperty("URL");
    private WebDriver driver;

    @Before
    public void setUp(Scenario scenario) {
        log.info("Testing started on '" + scenario.getName() + "'");
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        log.info("Browser launched and maximized");
        driver.get(URL);
        log.info("Web application launched");
    }

    @AfterStep
    public void afterStep(Scenario scenario) throws IOException {
        ScreenshotConfig.takeScreenshot(driver, scenario);
    }

    @After
    public void tearDown(Scenario scenario) {
        log.info("Testing ended on '" + scenario.getName() + "'");
        DriverFactory.closeBrowser();
        DriverFactory.tearDown();
    }
}
