package week7.assignment1w7;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
public class IncidentBase {
	
	public ChromeDriver driver;
	String fileName;
	int sheetNo;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
public void pre(String url,String username,String password) {
	WebDriverManager.chromiumdriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
}
	@AfterMethod
	public void post() {
	driver.close();
	}
	@DataProvider(name="fetch")
	public String[][] sendValue() throws IOException {
	return IncidentExcel.inciExcel(fileName,sheetNo);
}
}
