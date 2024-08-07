package frames.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassAmazon {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.amazon.in/" );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro"+ Keys.ENTER);
		
		
		String element1 = driver.findElement(By.xpath("(//span[@class ='a-declarative'])[4]")).getText();
		System.out.println("Price of OnePlus 9 Pro "+ element1);
		
		String element2 = driver.findElement(By.xpath("(//i[@class ='a-icon a-icon-star-small a-star-small-2-5 aok-align-bottom'])[1]")).getText();
		System.out.println(element2);
				
		WebElement element3 = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		element3.click();
		
		Set<String >windowhandle = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowhandle);
		driver.switchTo().window(windows.get(1));
		
		
		
		Thread.sleep(4000);
		
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		Actions action = new Actions(driver);
		action.moveToElement(element4).click().perform();
		
		driver.findElement(By.xpath("//a[@id = 'attach-close_sideSheet-link']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@id = 'nav-cart-count']")).click();
		
		String element5 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")).getText();
		System.out.println("SubTotal " + element5);
		
		driver.close();
		
			
	}

}
