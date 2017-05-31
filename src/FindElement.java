import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {
	
	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://flipkart.com");
		List<WebElement> list=d.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
	}

}
