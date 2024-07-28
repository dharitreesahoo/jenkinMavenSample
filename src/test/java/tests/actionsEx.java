package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsEx {
	@Test
	public void test1(){
	WebDriverManager.chromedriver().create();
	WebDriver driver = new ChromeDriver();
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("window.scrollBy(0,2000)", "");
	
	//clcik usiing javascript executor
		//changed main to check git
		Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
		
	}


}
