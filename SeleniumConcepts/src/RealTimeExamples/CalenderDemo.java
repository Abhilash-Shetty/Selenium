package RealTimeExamples;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElementById("travel_date").click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) // for selecting month as may, while loop will run till it reaches may
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click(); // clicking on arrow button to change the month
		}
		 //to go and click on specific date given
	List<WebElement> dates=driver.findElementsByClassName("day");
	int count = driver.findElementsByClassName("day").size();
	for(int i=0;i<count;i++) {
		String text = dates.get(i).getText();
		if(text.equalsIgnoreCase("23")) {
			dates.get(i).click();
			break;
		}
	}

	}

}
