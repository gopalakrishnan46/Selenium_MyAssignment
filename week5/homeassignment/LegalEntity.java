package testng.week5.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LegalEntity extends ProjectSpecificMethod {
	@Test
	public void runLegalEntity() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		WebElement element8 = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		element8.click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement element1 = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions action = new Actions(driver);
		action.moveToElement(element1).click().perform();
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left_none'])[14]"));
		action.moveToElement(element2).click().perform();
		WebElement element3 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		driver.executeScript("arguments[0].click();", element3);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
		action.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		WebElement element5 = driver.findElement(By.xpath("//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']"));
		element5.click();
		Thread.sleep(3000);
		WebElement element6 =driver.findElement(By.xpath("//span[text()='Active']"));
		action.moveToElement(element6).click().perform();
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
		
		String element7= driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println("Alert message " +element7);
		
		
	}

}
