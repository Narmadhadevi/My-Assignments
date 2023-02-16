package week2.assignment2w2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class Button {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		Thread.sleep(2000);
		boolean button = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println(button);
		Thread.sleep(2000);
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println(location);
		driver.close();
	}

}
