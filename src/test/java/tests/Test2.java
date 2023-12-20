package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public void test1(){
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar Mohapa\\workspace\\Test1\\chromedriver.exe");
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window"));
		Set<String> handles = driver.getWindowHandles();
		for(String handle: handles)
		{
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
		}

		
		
	}
}
