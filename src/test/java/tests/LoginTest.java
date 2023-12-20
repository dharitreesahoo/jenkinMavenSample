package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	@Test
	public void test1(){
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar Mohapa\\workspace\\Test1\\chromedriver.exe");
		driver.get("https://www.guru99.com/");
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='primary-menu']//span[text()='Big Data']")));
		driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Big Data']")).click();
		
		
	}

}
