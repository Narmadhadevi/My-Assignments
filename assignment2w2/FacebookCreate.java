package week2.assignment2w2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreate {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Narmadha");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("naddy061197@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("narma@06");
		WebElement dd1 = driver.findElement(By.name("birthday_day"));
		Select d1=new Select(dd1);
		d1.selectByIndex(5);
		WebElement dd2 = driver.findElement(By.id("month"));
		Select d2=new Select(dd2);
		d2.selectByValue("4");
		WebElement dd3 = driver.findElement(By.id("year"));
		Select d3=new Select(dd3);
		d3.selectByVisibleText("2015");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.close();
	}

}
