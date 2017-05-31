import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCode {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium versions\\geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium versions\\chromedriver.exe");
		
		@SuppressWarnings("unused")
		WebDriver driver1=new FirefoxDriver();
		
		//WebDriver driver=new ChromeDriver();
		
	}

}
