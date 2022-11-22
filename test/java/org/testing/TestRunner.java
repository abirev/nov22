package org.testing;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="H:\\LearningSpace\\Cucumber\\src\\test\\resources\\Features",glue="org.testing")
public class TestRunner {
	

}
