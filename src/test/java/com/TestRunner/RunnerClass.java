package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base1.Base_Class1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\Cucumber_feature",
glue = "com.Step_Defination",
plugin = {"html:Reportfold//htmlReportsf1.html"},

publish = true
)
public class RunnerClass {
	
	public static WebDriver driver;
	

	
	@BeforeClass 
	public static void Set_up() {
		
	driver=	Base_Class1.browserLaunch("chrome");
		
		
	
	}
//	@AfterClass
//	public static void tear_Down() {
//		driver.close();
//		System.out.println("DONE");
//	}
	
	
		
	
	
	

	
	
	

	
}
