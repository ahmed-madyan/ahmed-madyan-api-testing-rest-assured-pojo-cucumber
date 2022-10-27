package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                publish = true,
                features = {"src/test/java/feature"},
                glue = {"step_definition"},
                tags = ("@GETListOfUsers"),
                plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        )

public class TestRunner extends AbstractTestNGCucumberTests {
}