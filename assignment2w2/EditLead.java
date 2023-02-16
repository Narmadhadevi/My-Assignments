package week2.assignment2w2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Narmadha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("   Selenium");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement dd = driver.findElement(By.id("viewLead_companyName_sp"));
		String text = dd.getText();
		System.out.println("   " + text);
		driver.close();
	}

}
