import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCode {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium versions\\geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium versions\\chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//WebDriver driver=new ChromeDriver();
		
	}

}
