package MiscellaneousTopics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takingScreenShots {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		driver.manage().window().maximize();
		
		
		takescreenshot("Homepage ss"); //we are calling take ss method and send  ss file name(which name it has to take once saved) as paramater 


	}
	public static void takescreenshot(String ssName) throws IOException {  // taking ss file name as parameter then only it will stored with that name  
		
		// first we need to type cast our driver object to takesscreenshot to caputure the ss
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // takescreenshot is a Interface and getscreenshotAs is a method 
		FileUtils.copyFile(src,new File("C:\\Users\\shmounik\\Selenium\\eclipse-workspaceNew\\SeleniumConcepts\\src\\ScreenshotsFolder\\"+ssName+".jpg")); // append ss file name with folder path then the ss will be stored under that specified path with given ss file name, refer to sceenshot folder under this project 
		// to move that file we use fileutils is class which comes from org apache using copyFile method , need copy the src and paste in desired location so that we can see the screenshots
		 // we need add jar file externally
		//https://commons.apache.org/proper/commons-io/download_io.cgi    download second option of binary and add external jars through build path

		
	}

}
	