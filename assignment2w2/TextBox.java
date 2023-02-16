package week2.assignment2w2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='col-12']/input")).sendKeys("Narmadha");
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys(" TN");
		boolean display = driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]")).isEnabled();
		System.out.println(display);
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
		System.out.println(driver.findElement(By.xpath("(//div[@class='col-12']/input)[5]")).getAttribute("value"));
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]")).sendKeys("dd@gmail.com");
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("love to code");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']/p")).sendKeys("hi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).sendKeys("hello");
		driver.findElement(By.xpath("//span[@class='ui-float-label']/input")).click();
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("Happy coding");
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all']/span)[4]")).click();
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).sendKeys("love to code");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.close();
		
		}
		
	

	}


