package week3.assignment2w3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioBag {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();
driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
Thread.sleep(2000);
String len = driver.findElement(By.className("length")).getText();
System.out.println("No of bags available "+len);
List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
System.out.println("no.of brand name "+brand.size());
System.out.println(" List of Brands ");
for(WebElement value:brand)	{
	String text = value.getText();
	System.out.println(text);
}
List<WebElement> name= driver.findElements(By.xpath("//div[@class='nameCls']"));
int siz = name.size();
System.out.println("No.of bags "+siz);
System.out.println("List of bag name ");
for(WebElement value:name) {
	String text = value.getText();
	System.out.println(text);
}

driver.close();
	
	
	
	}

}
