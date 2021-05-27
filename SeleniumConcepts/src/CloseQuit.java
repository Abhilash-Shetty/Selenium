import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();// creating object referring to  interface to call methods in interface 
		driver.get("https://www.google.com/"); 
		//driver.findElement(By.xpath("(//a[contains(text(),'Gmail')])[1]")).click();
		//driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[1]")).click();
		driver.close(); 	//Close the current window, quitting the browser if it's the last window currently open
    	//driver.quit();		// Quits this driver, closing every associated window (this will close all browsers windows which are opened by selenium script
	}

}
