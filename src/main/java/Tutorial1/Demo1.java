package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("ROHINI");
		driver.findElement(By.name("lastname")).sendKeys("YEWARE");
		driver.findElement(By.name("reg_email__")).sendKeys("8079465312");
		driver.findElement(By.name("reg_passwd__")).sendKeys("7507847874");
		
		WebElement wb =driver.findElement(By.id("day"));
		WebElement wc =driver.findElement(By.id("month"));
		WebElement wd =driver.findElement(By.id("year"));
		
		Select sel1 =new Select(wb);
		Select sel2 =new Select(wc);
		Select sel3 =new Select(wd);
		
		sel1.selectByValue("4");
		sel2.selectByVisibleText("Jun");
		sel3.selectByValue("1989");
		
		WebElement a =sel1.getFirstSelectedOption();
		WebElement b =sel2.getFirstSelectedOption();
		WebElement c =sel3.getFirstSelectedOption();
		
		String x =a.getText();
		String y =b.getText();
		String z =c.getText();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]")).click();
		driver.findElement(By.name("websubmit")).click();
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		
		driver.navigate().forward();
		
	}

}
