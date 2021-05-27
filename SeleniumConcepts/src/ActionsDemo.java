import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);  			// creating obj for actions class and sending obj driver as parameter, so, now driver object will get capabilities of action class and actions class object a will have powerful  capabilities of handling webpages interactions
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform(); 
		// to enter caps we will use shift ( it will click on element then enter letters in cap and double click so text gets selected
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform(); 		// move or mouse over to the element,simply right move to the element and click build and perform,build() will build the action and perform() will execute that action
		// contextclick is used to right click on element
		
		// testing 
		
	}

}
/* Why do we use action class 
 * to mouseover an object with selenium
 * performing mouse and keyboard interactions with selenium
 * context 0r right click
 * double click 
 * drag and dropping an element
  */
