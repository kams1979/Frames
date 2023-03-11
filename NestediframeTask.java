package Frame;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediframeTask {
	
	static WebDriver driver;
	
	private static void screen5(String b) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Kavin\\eclipse-workspace\\org.frame\\kams\\"+b+".png");
	    FileUtils.copyFile(screenshotAs, f);
      
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
	    driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(element);
		WebElement element1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		element1.sendKeys("Java");
		driver.switchTo().defaultContent();
		WebElement element2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		element2.click();
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(findElement);
		WebElement findElement2 = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 250px;width: 400px'])[1]"));
		driver.switchTo().frame(findElement2);
		WebElement element5 = driver.findElement(By.xpath("(//input[@type='text'])"));
        Thread.sleep(2000);
        element5.sendKeys("Selenium");
        screen5("Automation Testing");
		
		
		
		
	}

}
