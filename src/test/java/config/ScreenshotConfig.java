package config;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static config.PropertiesManager.getProperty;

public class ScreenshotConfig {

    public static void takeScreenshot(WebDriver driver, Scenario scenario) throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        byte[] srcFile = scrShot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(srcFile, "image/png", "Screenshot");
        FileUtils.writeByteArrayToFile(new File(
                getProperty("PATH.TO.SCREENSHOTS.FOLDER")
                        + new SimpleDateFormat(getProperty("DATE.FORMAT")
                        + " "
                        + getProperty("FORMAT.OF.SCREENSHOT")).format(new Date())), srcFile);
    }
}
