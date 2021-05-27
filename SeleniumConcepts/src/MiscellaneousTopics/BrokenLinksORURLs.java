package MiscellaneousTopics;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksORURLs {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// if url/link is broken it will throw error status >400 ( link is nothing but url or link is tied up to URL)
		// there are some java methods which will take urls and give status code, selenium alone cannot do this
		// selenium is used to get urls
		// if status is > 400 then url is not working and link which is tied up to that url is broken
		List<WebElement> links=driver.findElementsByCssSelector("li[class=\"gf-li\"] a");
		for(WebElement i : links) {			// enhanced for loop
			String url =i.getAttribute("href");
			HttpURLConnection con =(HttpURLConnection)new URL(url).openConnection();	// URL is class and openConnection is a method  in the url class, you are creating object of url class by new operator and calling open connection method and return type for that method is HttpURLConnection, so casting url class with HttpURLConnection
			//System.out.println(con);
			con.setRequestMethod("HEAD");  // we are requesting using head
			con.connect();			// it will make a call to the url 
			int ResponseCode=con.getResponseCode();
			if(ResponseCode > 400) {
				System.out.println("following link is broken "+i.getText()+" and Status code is "+ResponseCode);
			}
		}

	}

}
