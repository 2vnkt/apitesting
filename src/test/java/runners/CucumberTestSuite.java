package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "steps", features = "src/test/resources/features")
//@CucumberOptions(glue = "steps", features = "src/test/resources/features", tags = "@smoke") 
public class CucumberTestSuite {
}
