package week7.assignment2w7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibleWait {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		String text2 = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
		System.out.println(text2);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		try {
			driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		} catch (Exception e) {
			System.out.println(e+"invisible executes");
		}
		WebElement first = driver.findElement(By.xpath("//span[text()='Click First Button']"));
		first.click();
		String text3 = first.getText();
		System.out.println(text3);
		WebElement second = driver.findElement(By.xpath("//span[text()='Click Second']"));
		wait.until(ExpectedConditions.elementToBeClickable(second));
		String text4 =second.getText();
		System.out.println(text4);
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		String text6 = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
		System.out.println(text6);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Did you notice?']")));
		String text5 = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		System.out.println(text5);
		driver.close();
	}

}
