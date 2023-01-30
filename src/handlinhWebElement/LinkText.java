package handlinhWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\Driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		
		
		WebElement glink=driver.findElement(By.linkText("Gmail"));
		
		boolean status=glink.isDisplayed();
	System.out.println("It is displayed:"+status);
	status= glink.isEnabled();
	System.out.println("It is enabled:"+status);
		
	String name=glink.getText();
	System.out.println("Text name is :"+name);
		
		
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	//driver.close();
	
	}

}
