package RealTimeExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.cssSelector("div[class='rt-tbody']"));    // if there are no of tables in the webpage we need identify table on which we need perform action the limit the scope of driver to that table
		int rowCount =table.findElements(By.cssSelector("div[class='rt-tr-group']")).size(); 	// this will give you no of rows( need to give locator which is common to all rows)
		// now we need to move to particular column in row using css ( css till row space childtagname:nth-child(3) ( child(3) is the coulmns on which we will be performing 
		// note : how to transverse to one sibling to another sibling write xpath till firstsibling/following-sibling::tagnameofnextsibling
		
		System.out.println(rowCount);
		int count =table.findElements(By.cssSelector("div[class='rt-tr-group'] div:nth-child(3)")).size();
		System.out.println(count); // no need of this we can give row count length in loop
		int sum =0;		
		for(int i=0;i<count;i++) {
			
			
			String value =table.findElements(By.className("div[class='rt-tr-group'] div:nth-child(3)")).get(i).getText();
			//System.out.println(table.findElements(By.className("div[class='rt-tr-group'] div:nth-child(3)")).get(i).getText());
			int IntegerValue =   Integer.parseInt(value); 	// typecasting string to integer
			sum=sum+IntegerValue;
			
		}
		System.out.println(sum);

	}

}

