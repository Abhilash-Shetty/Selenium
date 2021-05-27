
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationAndXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoke .exe file first // create driver object
	System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver.exe");
	WebDriver	driver = new ChromeDriver();// creating object referring to  interface to call methods in interface 
	driver.get("https://www.google.com/"); 	// hit url on browsera
	System.out.println(driver.getCurrentUrl()); // to validate if you are landed on correct url
	System.out.println(driver.getTitle());		// to validate title of page
	System.out.println(driver.getPageSource());
	driver.get("http://yahoo.com");
	driver.navigate().back();
	driver.navigate().forward();
//	driver.close(); 	//Close the current window, quitting the browser if it's the last window currently open
//	driver.quit();		// Quits this driver, closing every associated window (this will close all browsers windows which are opened by selenium script

//	//	for locators ID, name, classname,linktext, xpath, css
//	driver.get("https://www.facebook.com/");
//	driver.findElement(By.id("email")).sendKeys("mounika");
	
//	//driver.findElement(By.name("pass")).sendKeys("maggie");
	
//	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mounika");
	
//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pass");  // difference between xpath and ccs is in css we wont use // and @ , give space or don't mention in the place of * not need of mentioning tag in css
//	// css 1)tagname#id or #id 2)tagname.classname
//	driver.findElement(By.id("loginbutton")).click();
//	driver.findElement(By.linkText("Forgotten password?")).click();
//	// selenium will not accept classname will spaces it will throw error compound class name is not permitted 
//	System.out.println("pass");
//	//driver.quit();
//	// regular expression when attribute value is changing and some part is constant and when it is very long
//	driver.get("http://rediff.com");
//	driver.findElement(By.cssSelector("a[title*='Sign in']")).click();  // regular expression for css same as normal css except * symbol
//	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
//	driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
//	driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click(); //regular expression for xpath it uses contains
	// if we need to move to particular column in row using css (write css till row space childtagname:nth-child(3) ( child(3) is the coulmns on which we will be performing 
	//eg:table.findElements(By.className("div[class='rt-tr-group'] div:nth-child(3)")
			// note : how to transverse to one sibling to another sibling write xpath till firstlsibling/following-sibling::tagnameofnextsibling
	
	
	
	

	}

}
