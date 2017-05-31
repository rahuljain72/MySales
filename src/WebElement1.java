import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement1 {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			//Launch the broeser
			WebDriver d=new FirefoxDriver();
		//	d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			WebDriverWait wait=new WebDriverWait(d,40);
			
			d.get("https://facebook.com");
			WebElement wb=d.findElement(By.id("email"));
			//Tonpass the vqlue to text box
			wb.sendKeys("p.udhay");
			//Thread.sleep(5000);
			wb.clear();
		//	Thread.sleep(2000); 
			wb.sendKeys("rjrahuljain136@gmail.com");
			//WebElement wb1=d.findElement(By.id("next"));
		//	wb1.click();
		//	Thread.sleep(6000);
			WebElement wb3=d.findElement(By.id("pass"));
			wb3.sendKeys("ABC");
			WebElement wb4=d.findElement(By.id("u_0_q"));
			wb4.click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Akshay Kumar sets the expectation meter high, says Taapsee Pannu"))).click();
			/*WebElement wb5=d.findElement(By.xpath("//input[contains(@id,'u_0_q')]"));
			wb5.click();*/

}}
