package week7.assignment1w7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class DeleteIncident extends IncidentBase{
	@BeforeClass
	public void setFileSheet() {
		fileName="IncidentBase";
		sheetNo=1;
	}
@Test(dataProvider="fetch")
public void deleteInci(String num) throws InterruptedException {
	Shadow dom=new Shadow(driver);
	dom.setImplicitWait(30);
	dom.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
	dom.setImplicitWait(10);
	dom.findElementByXPath("//span[text()='Incidents']").click();
	WebElement frames = dom.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frames);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(num,Keys.ENTER);
	driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr/td[3]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
	driver.findElement(By.xpath("//button[@id='ok_button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(num,Keys.ENTER);
	String delete = driver.findElement(By.xpath("//div[@class='list2_empty-state-list']")).getText();
	System.out.println(delete);	
}
}
