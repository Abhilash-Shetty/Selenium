package MiscellaneousTopics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException {
		// we use desired capabilities to tell on which browser you need to run the test and on which os it is running mainly when it is running on remote server
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL("IPaddressofHUb/wd/hub"),dc);
		driver.get("https://google.com");

	}

}
