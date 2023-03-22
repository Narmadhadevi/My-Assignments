package week7.assignment1w7;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
public class UpdateIncident extends IncidentBase{
	@BeforeClass
	public void setFileSheet() {
		fileName="IncidentBase";
		sheetNo=2;
	}

@Test(dataProvider="fetch")
public void updateInci(String num) {
	Shadow dom=new Shadow(driver);
	dom.setImplicitWait(30);
	dom.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
	dom.setImplicitWait(10);
	dom.findElementByXPath("//span[text()='Incidents']").click();
	WebElement frames = dom.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frames);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(num,Keys.ENTER);
	driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr/td[3]/a")).click();
	WebElement priority = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
	Select dd=new Select(priority);
	dd.selectByVisibleText("1 - High");
	WebElement state = driver.findElement(By.xpath("//select[@id='incident.state']"));
	Select options =new Select(state);
	options.selectByVisibleText("In Progress");
	driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
	driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr/td[3]/a")).click();
	String prior= driver.findElement(By.xpath("//select[@id='incident.urgency']/option")).getText();
	System.out.println(prior);
	String stat = driver.findElement(By.xpath("//select[@id='incident.state']/option[2]")).getText();
	System.out.println(stat);
	
}
}
