package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // bütün senaryolarda smoketest tag ine sahip olanları çalıştır
        features = {"src/test/java/FeatureFiles"}, // klasördeki
        glue = {"StepDefinitions"}

)

public class _04_TestRunnersSmoke extends AbstractTestNGCucumberTests {
}
