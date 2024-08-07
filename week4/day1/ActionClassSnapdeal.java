package frames.week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSnapdeal {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Actions action = new Actions(driver);
		WebElement element1=driver.findElement(By.xpath("(//span[@class = 'catText'])[1]"));
		action.moveToElement(element1).perform();
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
		action.moveToElement(element2).click().perform();
		String element3 = driver.findElement(By.xpath("//span[@class = 'category-name category-count']")).getText();
		System.out.println("Total number of sports shoe "+element3);
		WebElement element4 = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		element4.click();
		Thread.sleep(3000);
		WebElement elem5 = driver.findElement(By.xpath("(//ul[@class='sort-value hidden']/li)[2]"));
		driver.executeScript("arguments[0].click();", elem5);
		//action.moveToElement(element5).click().perform();
		action.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		WebElement element6 = driver.findElement(By.xpath("//div[@class='filter-price-slider ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']"));
		action.dragAndDropBy(element6, -98, 0).perform();
		Thread.sleep(3000);
		WebElement element7 = driver.findElement(By.xpath("//a[@class='price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		action.dragAndDropBy(element7, -175, 0).perform();
		Thread.sleep(3000);
		WebElement element8 = driver.findElement(By.xpath("(//div[@class='filter-inner filter-inner-height']//input)[1]"));
		driver.executeScript("arguments[0].click();", element8);
		WebElement element9 =driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		action.moveToElement(element9).perform();
		Thread.sleep(3000);
		WebElement element10 =driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
		action.moveToElement(element10).click().perform();
	    Thread.sleep(2000);
		String element11 = driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[1]")).getText();
		System.out.println("Price of the shoe:- " +element11);
		String element12 = driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[2]")).getText();
		System.out.println("Discount:- " +element12);
		Thread.sleep(3000);
		//action.moveToElement(element13).click().perform();
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/img2.png");
		FileUtils.copyFile(screenshotAs, desc);
		Thread.sleep(3000);
		WebElement element13 = driver.findElement(By.xpath("//div[@class='close close1 marR10']"));
		driver.executeScript("arguments[0].click();", element13);
		
		driver.quit();
		
		}

}
