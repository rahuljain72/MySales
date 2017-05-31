import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirst {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium versions\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
	WebElement wb=driver.findElement(By.name("Email"));
	wb.sendKeys("ABC");
		
		//WebElement wb2=driver.findElement(By.className("need-help"));

		WebElement wb1=driver.findElement(By.partialLinkText("Find my"));
		wb1.click();
		
		
		
		
		
	}

}
