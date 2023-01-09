package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebDriver d =driver.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.google.com/");
		
		Thread.sleep(2000);

	}

}
