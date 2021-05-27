package MiscellaneousTopics;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();			// deletes all cookies
		driver.manage().deleteCookieNamed("");		// deletes any particular cookie
		driver.get("https://www.ksrtc.in");
		

	}

}
