import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstCode {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium versions\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "F:\\Selenium versions\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		String expurl="facebook.com";
		driver.get("https://www.facebook.com");
		String acturl=driver.getCurrentUrl();
		
		System.out.println(acturl);
		if(acturl.contains(expurl))
		{
			System.out.println("url is matching");
		}
		else{
			System.out.println("url is not matching");
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
