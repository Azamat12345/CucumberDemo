package RunnerPackage;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@CucumberOptions(features = {"features"}, glue = {"StepDefinitionPackage"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	public static WebDriver driver;
	
	@BeforeTest
		public void setUp(){
		WebDriverManager.chromedriver().setup();
		//Use WebDriver manager to specify which webDriver to use
			driver = new ChromeDriver();
			System.out.println("Test running");
	}
	
	@AfterTest
		public void tearDown(){
			driver.quit();
	}
}
