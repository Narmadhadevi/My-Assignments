package week7.assignment1w7;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
public class AssignIncident extends IncidentBase{
	@BeforeClass
	public void setFileSheet() {
		fileName="IncidentBase";
		sheetNo=3;
	}
@Test(dataProvider="fetch")
public void assignInci(String num) {
	Shadow dom=new Shadow(driver);
	dom.setImplicitWait(30);
	dom.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
	dom.setImplicitWait(10);
	dom.findElementByXPath("//span[text()='Incidents']").click();
	WebElement frames = dom.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frames);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(num,Keys.ENTER);
	driver.findElement(By.xpath("//span[@class='section_view']")).click();
	driver.findElement(By.xpath("//div[text()='Default view']")).click();
	driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']")).sendKeys("software",Keys.ENTER);
	driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys("Assign to software");
	driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
	String verify = driver.findElement(By.xpath("//li[@class='h-card h-card_md h-card_comments']")).getText();
	System.out.println(verify);
}
}
