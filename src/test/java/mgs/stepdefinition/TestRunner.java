package mgs.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Feature",
glue= "mgs.stepdefinition",
plugin= {"html:target","json:target/reports.json"},
dryRun= false,
monochrome = true,
tags="@Negative")


public class TestRunner {

}
