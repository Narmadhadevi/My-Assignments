package week2.assignment2w2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDelete {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Create Lead")).click();
//		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Narmadha");
//		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("narma");
//		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
//		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9597219926");
//		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9597219926");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'x-form-field')])[30]")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.close();	
	}

}
