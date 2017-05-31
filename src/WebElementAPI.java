import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementAPI {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");}
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the broeser
		WebDriver d=new FirefoxDriver();
	//	d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(d,40);

		d.get("https://gmail.com");
		WebElement wb=d.findElement(By.id("Email"));
		//Tonpass the vqlue to text box
		wb.sendKeys("p.udhay");
		//Thread.sleep(5000);
		wb.clear();
	//	Thread.sleep(2000); 
		wb.sendKeys("rjrahuljain136");
		WebElement wb1=d.findElement(By.id("next"));
		wb1.click();
	//	Thread.sleep(6000);
		WebElement wb3=d.findElement(By.id("Passwd"));
		wb3.sendKeys("ABCD");
	//	Thread.sleep(6000);
		WebElement wb4=d.findElement(By.id("signIn"));
		wb4.click();
	//	Thread.sleep(30000);
		WebElement wb5=d.findElement(By.xpath("//div[contains(@id,'gbwa')]/following-sibling::div[2]/div/a/span"));
	//	Thread.sleep(10000);
		wb5.click();
		WebElement wb7=d.findElement(By.xpath("//a[text()='Sign out']"));
		wb7.click();
		
	//	d.findElement(By.id("Password")).sendKeys("abcde");
		String expErr="Sorry, Google doesn't recognize";
		Thread.sleep(2000);
		WebElement wb2=d.findElement(By.xpath("(//span[contains(text(),'recognize')])"));
		String actErr=wb2.getText();
		System.out.println(expErr);
		System.out.println(actErr);
		if(actErr.equals(expErr))
		{
			System.out.println("test i amatching");
		}
		else
		{
			System.out.println("text is not matching");
		}
		String att=wb.getAttribute("PlaceHolder");
		System.out.println(att);
		String CssValue=wb1.getCssValue("Color");
		System.out.println(CssValue);
		System.out.println(wb.getTagName());
		System.out.println(wb.getLocation());
		System.out.println(wb1.isDisplayed());
		System.out.println(wb1.isEnabled());
			
		
	}

}
