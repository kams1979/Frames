package Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouse_demo {
	
	 static WebDriver driver;
	
	
	private static  void mouse() {
            driver=new ChromeDriver();
            driver.get("http://www.greenstechnologys.com/");
	}
	public static void main(String[] args) {
		mouse();
		
	}

}
