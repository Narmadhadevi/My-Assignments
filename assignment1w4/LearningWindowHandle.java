package week4.assignment1w4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0z26yihdqx7sopv3l0z1xei3h124712.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> window = driver.getWindowHandles();
		List<String> win= new ArrayList<String>(window);
		driver.switchTo().window(win.get(1));
		driver.close();
		driver.switchTo().window(win.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> window2 = driver.getWindowHandles();
		List<String> win2= new ArrayList<String>(window2);
		driver.switchTo().window(win2.get(2));
		driver.close();
		driver.switchTo().window(win2.get(1));
		driver.close();
		driver.switchTo().window(win.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> window3 = driver.getWindowHandles();
		List<String> win3= new ArrayList<String>(window3);
		//System.out.println(win3.size());//4
		driver.switchTo().window(win3.get(3));
		driver.close();
		driver.switchTo().window(win3.get(2));
		driver.close();
		driver.switchTo().window(win3.get(1));
		driver.close();
		driver.switchTo().window(win3.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Thread.sleep(2000);
		Set<String> window4 = driver.getWindowHandles();
		List<String> win4= new ArrayList<String>(window4);
		System.out.println(win4.size());//3
		driver.quit();
		
		
		
		
	}

}
