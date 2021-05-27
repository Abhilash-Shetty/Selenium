import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
// note implicit wait: we are saying globally to element to stay for specified secs before throwing exception or error, if the element is loaded before specified time execution will continue it will not wait for complete specified time
// even though we have implicit wait why we are going for explicit wait 1) suppose there is a scenario where you want to retrive data and it will take long time if you specify this long time in implicit wait and if there is actaul error(eg:searching for wrong country) this will also take this long time to throw erorr which is a disadvantage
//2) if there is a scenario where you need check whether element is present with that specified time or not say 5secs and in your implict wait you have given 10 secs for all elements than this performance bug which cannot be detected
// so to target any specific element or locator explicit wait is used 
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		// implicit wait applied globally for all elements where loading is taking place or has effect on each and every step
		// there is class webdriverwait used for explicit wait for we need create obj for that class and sends two arguments 1) driver obj it needs to know on which driver obj it should participate action 2) time how many seconds it should wait
		
		WebDriverWait w = new WebDriverWait(driver,5);
		String[]	productneeded = {"Cucumber","Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");   	
		driver.manage().window().maximize();
		addItems(driver,productneeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));  // giving condition for explicit wait for exact target
		//w.until(ExpectedConditions.
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class=\"promoBtn\"]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']"))); // giving condition for explicit wait
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		// we can achieve explicit wait in two ways one is webdriver wait and other is fluent wait the main difference between them is 
		// webdriver wait will continuously monitor DOM for whether element is present or not where as for fluent wait will be giving polling time  where at that regular interval time it will go and monitor dom or see whether is present or loaded on browser
		// both webdriver and fluent wait classess implement interface WAIT and unlike webdriver wait we need to create customized wait method based on condition for fluent wait
		
		
		
	}
	
	
	
	public static void addItems(WebDriver driver,String[]  productneeded) {
		int j = productneeded.length;
		System.out.println(j);   // output is 2
		int k =0;
		
		List<WebElement> options= driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		for(int i =0;i< options.size();i++) 
			{
				
			String[] name = options.get(i).getText().split("-");    
			String modifiedname =  name[0].trim();   
			List productneedelist = Arrays.asList(productneeded);  
			if(productneedelist.contains(modifiedname)) {
					 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();  
					
					 k++;
					 if (k==j){   
						 break;
						 
					 }
						
				}
			
			}
		
			
		
	}

}
