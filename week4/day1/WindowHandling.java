package frames.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login" );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		WebElement element1 = driver.findElement(By.xpath("//img[@alt='Lookup']"));
		element1.click();
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> wnidows = new ArrayList<String>(windowhandles);
		driver.switchTo().window(wnidows.get(1));
		WebElement element2 = driver.findElement(By.xpath("(//table)[4]/tbody/tr/td[3]/div/a"));
		element2.click();
		
		driver.switchTo().window(wnidows.get(0));
		
	
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));
		element3.click();
		
		Set<String> windowhandles1 = driver.getWindowHandles();
		List<String> wnidows1 = new ArrayList<String>(windowhandles1);
		driver.switchTo().window(wnidows1.get(1));
		
		WebElement element4 = driver.findElement(By.xpath("(//table)[5]/tbody/tr/td[3]/div/a"));
		element4.click();
		
		driver.switchTo().window(wnidows.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
			
			
	}

}
