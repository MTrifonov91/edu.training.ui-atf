import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        plugin = {"pretty", "html:target/reports/cucumber-report.html"},
        features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@ProductList"
        )
public class Runner {
}
