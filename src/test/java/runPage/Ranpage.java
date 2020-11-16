package runPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import ulilPage.BasePage;

@CucumberOptions(features = {"C:\\Users\\user\\eclipse-workspace\\semademo\\src\\test\\resources\\cucumber\\framework.feature"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "stefDef",
tags= {"@Sanity"})

public class Ranpage extends AbstractTestNGCucumberTests {
	BasePage test = new BasePage();
	
	@BeforeTest
	public void SetUp() {
		test.Initial();
	}
		@AfterTest
		public void tearDown() {
			test.driver.quit();
		}
	}

