import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscillineousTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		// if you want add an item product into your cart
//		List<WebElement> options= driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
//		for(int i =1;i< options.size();i++) 
//		{
//			String name = options.get(i).getText();
//			
//			if(name.contains("Cucumber")) {
//				 driver.findElements(By.xpath("//button[text()=\"ADD TO CART\"]")).get(i).click();
//				break;
//			}
//		}
		
		// if you want add more items at time then store those items into array 
		String[]	productneeded = {"Cucumber","Brocolli"};
		
		int j = productneeded.length;
		//System.out.println(j);   // output is 2
		int k =0;
		
		List<WebElement> options= driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		for(int i =0;i< options.size();i++) 
			{
				//String name = options.get(i).getText();			// this will get exact text that is Cucumber - 1 Kg but in the array which we are sending is only cucumber so we neeed to modify
					
			String[] name = options.get(i).getText().split("-");    // as we are spliting the text data type will change to string array not simple string
			String modifiedname =  name[0].trim();   // there is space too, we need to remove that to
		
			List productneedelist = Arrays.asList(productneeded);  // converting array to array list because arraylist contains less space that too converting during run time and it consists of "contains" using which we can retract the data easily
			
			if(productneedelist.contains(modifiedname)) {
					 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();  
					// we cannot simply use break here as this is adding multiple items if we use break once it first item it will break the loop
					// and we cannot run the loop for all the items if there are 100 items and in our array there is only two items we cannot run loop for 100 times so 
					 k++;
					 if (k==j){   // if there are only two items we needed if condition statisfies two times then no need of running loop for rest of the times 
						 break;
						 
					 }
						
				}
			
			}
		
			
		

	}

}
