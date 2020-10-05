package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Login.feature"
		,glue = "com/stepDefinitions"
		,dryRun = true
		,monochrome = true
		,tags = "@smoke"
		)
public class Runner {

}
