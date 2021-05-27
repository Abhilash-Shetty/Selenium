import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowsIDS = driver.getWindowHandles();			// getwindowhandles method will give you all window and theirs ids, all window Id' are sitting in set data structure 
		Iterator<String> iDs= windowsIDS.iterator();
		String parentID=iDs.next();
		String childID=iDs.next();
		driver.switchTo().window(childID);
		System.out.println("title of child window is "+driver.getTitle());
		driver.switchTo().window(parentID);
		System.out.println("title of parent window is "+driver.getTitle());
		
		
		
	}

}
/*practice notes, we can use below loops aswell
 
while(iDs.hasNext()) {
			driver.switchTo().window(iDs.next());
			System.out.println("title of window is "+driver.getTitle());
			
			
			
		}
 
 or 

for (String win:windowsIDS) {
	driver.switchTo().window(win);
	System.out.println("title is "+driver.getTitle());
	
}*/
