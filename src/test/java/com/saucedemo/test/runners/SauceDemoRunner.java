package com.saucedemo.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/test_saucedemo.feature",
        glue = "com.saucedemo.test.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class SauceDemoRunner {
}
