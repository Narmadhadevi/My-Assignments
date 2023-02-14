package week2.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Narmadha");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("narma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer");
		driver.findElement(By.name("description")).sendKeys("Happy Coding");
		driver.findElement(By.className("inputBox")).sendKeys("narma.06@gmail.com");
WebElement open= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select opt=new Select(open);
opt.selectByVisibleText("Alaska");
driver.findElement(By.className("smallSubmit")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_description")).clear();
driver.findElement(By.name("submitButton")).click();
System.out.println(driver.getTitle());
		driver.close();
	}

}
