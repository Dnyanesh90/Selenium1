package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		String a =driver.getTitle();
		//String b =driver.getPageSource();
		String c =driver.getCurrentUrl();
		
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		
		
		
		
	}

}
