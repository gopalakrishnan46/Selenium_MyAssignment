package homeassignment.week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	
	private static final boolean WebElement = false;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("searchVal")).sendKeys("bags" +Keys.ENTER);
		
		WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
		checkbox.click();
		
		
	
		Thread.sleep(3000);
		
		WebElement cate =  driver.findElement(By.xpath("//input[contains(@id, 'Men - Fashion')]"));
		driver.executeScript("arguments[0].click();", cate);
		
		WebElement element = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']"));
		System.out.println(element.getText());
		
		List<WebElement> element1 = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		
		for(int i =0; i< element1.size();i++ ) {
			
				String linktext = element1.get(i).getText();
					System.out.println(linktext);	
				}
	    List<WebElement> element2 = driver.findElements(By.xpath("//div[@class='brand']/following::span[@class ='price  ']"));
	    
	    for (int j = 0; j < element2.size(); j++) {
	    	
	    	String pricetext = element2.get(j).getText();
	    	System.out.println(pricetext);
			
		}
		driver.close();
		

	}

}

