package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;



@RunWith(cucumber.junit.Cucumber.class)
@CucumberOptions(features = "FeatureFile/Login.feature", glue = "org/stepdenifinitions")
public class LoginRunner {

}
