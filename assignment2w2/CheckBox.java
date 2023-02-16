package week2.assignment2w2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//span[text()='Basic']")).click(); 
		  driver.findElement(By.xpath("//span[text()='Ajax']")).click(); 
		  driver.findElement(By.xpath("//label[text()='Java']")).click(); 
		  driver.findElement(By.xpath("//label[text()='Python']")).click(); 
		  driver.findElement(By.xpath("//label[text()='Others']")).click(); 
		  boolean result = driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/input)[21]")).isEnabled();
		System.out.println(result);
		driver.close();
		 	}

}
