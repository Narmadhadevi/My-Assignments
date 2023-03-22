package week7.assignment1w7;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateIncident extends IncidentBase {
	@BeforeClass
	public void setFileSheet() {
		fileName="IncidentBase";
		sheetNo=0;
	}
	@Test(dataProvider="fetch")
	public void createInci(String num,String des) throws InterruptedException {
		Shadow dom=new Shadow(driver);
		dom.setImplicitWait(30);
		dom.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		dom.setImplicitWait(10);
		dom.findElementByXPath("//span[text()='Incidents']").click();
		WebElement frames = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		driver.findElement(By.xpath("//input[@id='incident.number']")).sendKeys(num);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys(des);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(num,Keys.ENTER);
		String value =  driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println(value +" value");
		if(value.contains(num)) {
		System.out.println("created"); 
		}else {
		System.out.println("not created"); 
		}
	}
}
