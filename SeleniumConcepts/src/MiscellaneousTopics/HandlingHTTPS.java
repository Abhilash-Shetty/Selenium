package MiscellaneousTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHTTPS {

	public static void main(String[] args) {
		;
		// ssl certifications is when web page is throwing errors ( you need to click on proceed kind of buttons to go into that application)
		
		
		//Desired capabilities=
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);		// for insecure sites
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 			// for ssl certifications

		//Below is to your local browser settings 
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);  // merging chromeoptions with desired capabilities 
		System.setProperty("webdriver.chrome.driver", "C:\\\\DRIVERS\\\\chrome driver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);



	}

}
