package Frame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(element);
		WebElement element1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		element1.sendKeys("Java");
		
	}
      	
	
	
	
	

}
