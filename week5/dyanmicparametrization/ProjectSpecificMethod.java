package testng.week5.dyanmicparametrization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	
	
	public ChromeDriver driver;
	@Parameters({"username","password","url"})
	@BeforeMethod
	public void preCondition(String uname, String pwd,String url) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}
	

}
