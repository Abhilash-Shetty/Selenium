

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		
		// drop down (static/traditional dropdowns which has select tag)
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
////		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));      // we need send that dropdown webelement xpath into select class so that all values of that dropdown is stored in that class
////		s.selectByIndex(2);				// index starts from 1
////		s.selectByValue("INR");
////		s.selectByVisibleText("USD");
//		
		
		// dynamic dropdowns we will be using click only
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value=\"BLR\"])[2]")).click();
		// instead of usimg index we will write use parent(whole box) and child relation( which element in that box)
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"BLR\"]")).click();
//		
		// dropdowns with autosuggestion
		
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(2000);
//     List<WebElement>	options =driver.findElements(By.xpath("//*[@class=\"ui-menu-item\"]"));    // be careful while writing xpath give class whose class name is common for list items
//	   for (WebElement opt :options ) {
//		   if(opt.getText().equalsIgnoreCase("india")) {
//			   opt.click();
//			   break;
//		   
//		   }
		
		
		// check box
		//driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		 //to count no of checkboxes
		driver.findElements(By.cssSelector("input[type='checkbox'])")).size();
		 
		
		
		// to select current date in calenders : there will always be a separate class highlated for that current date  use that class to select the current date
		// note : for css use .classname and #id and remove spaceses in class name and provide . in that place
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		
		
		// to see whether element is enabled or disabled 
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());	// this will not work sometimes even though it is not enabled it will show true
		// when element is changing from enabled to diabled one attribute will be changing we need to observe that element and use that element to right condition whether element is enabled or not
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));    // this will print attribute 
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){ 		 //.contains will check whether "1" is present in complete attribute
			System.out.println("element is enabled");
		
		}
		}
		
	
	// note: 1) to format or align entire code use ctrl+shift+f 2) class name should start with cap and var name should start small and use camel case 3) if you want to debug from certain point add toggel breakpoints at that line and run as debug execution will run asusual and ask for debug at that point from that point you can debug each and every step buy using step over and can use resume option to execute normally 
	
		

	

}
	
	
