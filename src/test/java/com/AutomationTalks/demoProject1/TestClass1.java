package com.AutomationTalks.demoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver driver;
	
	@BeforeMethod
	public void lunchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suman\\eclipse-workspace\\demoProject1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void Test1() {
		driver.navigate().to("https://AutomationTalks.com");
		String Title = driver.getTitle();
		System.out.println("Title of the page is " + Title);
	}
	
	
	@Test
    public void Test2() {
		driver.navigate().to("https://AutomationTalks.com");
		String Title = driver.getTitle();
		//Assert.assertEquals("", expected);
		System.out.println("Title of the page is " + Title);
	}
	
	
	@Test
    public void Test3() {
		driver.navigate().to("https://AutomationTalks.com");
		String Title = driver.getTitle();
		//Assert.assertEquals("", expected);
		System.out.println("Title of the page is " + Title);
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
