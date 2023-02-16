package week2.assignment2w2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateVerify {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("auto@testleaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement loadA = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		String text=loadA.getText();
		loadA.click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		WebElement loadB = driver.findElement(By.id("viewLead_firstName_sp"));
		String text2 = loadB.getText();
		System.out.println("actual and duplicate "+text+text2);
		driver.close();
		
	}

}
