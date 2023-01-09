package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		boolean a =driver.findElement(By.tagName("img")).isDisplayed();
		boolean b =driver.findElement(By.tagName("img")).isEnabled();
		boolean c =driver.findElement(By.tagName("img")).isSelected();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	

	}

}
