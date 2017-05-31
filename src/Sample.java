import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver d=new FirefoxDriver();
		d.get("https://facebook.com");
		WebElement wb=d.findElement(By.id("month"));
		Select sel=new Select(wb);
		sel.selectByIndex(6);
		Thread.sleep(3000);
		sel.selectByValue("9");
		Thread.sleep(4000);
		sel.selectByVisibleText("Dec");		
		System.out.println(sel.isMultiple());
		List<WebElement> options =sel.getOptions();
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		for(int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equals("Jun"))
			{
				System.out.println("Element present at index"+i);
				System.out.println("June is pesent");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
