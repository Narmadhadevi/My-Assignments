package week2.assignment2w2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class SelectElement {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement ele = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select dd=new Select(ele);
	dd.selectByIndex(2);
	driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	driver.findElement(By.xpath("//li[text()='Germany']")).click();
	driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).click();
	driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	driver.findElement(By.xpath("//li[text()='English']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	driver.findElement(By.xpath("//li[text()='Two']")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	}
}
