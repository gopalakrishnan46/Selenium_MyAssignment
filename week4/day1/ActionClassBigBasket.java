package frames.week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.bigbasket.com/" );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("(//div[@id='headlessui-menu-items-:R9bab6:']//li)[3]"));
		action.moveToElement(element1).perform();
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		action.moveToElement(element2).click().perform();
		driver.findElement(By.xpath("(//div[@class = 'p-2.5 pt-0 flex flex-col bg-white border border-silverSurfer-200 shadow-3 rounded-2xs h-full']//li)[3]")).click();
	    Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.xpath("//input[@id='i-BBRoyal']")); 
		action.moveToElement(element3).click().perform();
		Thread.sleep(3000);
		WebElement element4 = driver.findElement(By.xpath("(//div[@class ='break-words h-10 w-full'])[3]"));
		//action.moveToElement(element4).click().perform();
		element4.click();
		
		Set<String >windowhandle = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowhandle);
		driver.switchTo().window(windows.get(1));
		
		WebElement element5 = driver.findElement(By.xpath("(//div[@class ='flex flex-col items-start justify-start w-full p-2.5'])[5]"));
		action.moveToElement(element5).click().perform();
		
		String element6 = driver.findElement(By.xpath("(//span[@class = 'Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel4-sc-l9rhbt-4 gJxZPQ cWTZQL'])[5]")).getText();
		System.out.println("Price of BB royal 5 kg rice "+  element6);
		
		WebElement element7 = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		element7.click();
		
		Thread.sleep(3000);
		String element8= driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		System.out.println("Verify item message:- " +element8);
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/img.png");
		FileUtils.copyFile(screenshotAs, desc);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	
	}
}
