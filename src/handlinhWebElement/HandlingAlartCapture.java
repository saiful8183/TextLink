package handlinhWebElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlartCapture {

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\Driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
         driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
         
         
         driver.findElement(By.name("proceed")).click();
//         
//         Alert popup=driver.switchTo().alert();
//        System.out.println(popup.getText());
//        popup.accept();
//        
        
//         
//        Alert popup= driver.switchTo().alert();
//         
//        System.out.println(popup.getText());
//        popup.accept();
//         
//         Thread.sleep(1000);
//         driver.quit();
         
         
       Alert popup= driver.switchTo().alert();
       System.out.println(popup.getText());
       popup.accept();
      // driver.quit();
   

	}

}
