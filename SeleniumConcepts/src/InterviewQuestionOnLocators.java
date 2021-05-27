import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestionOnLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http:google.com");
		// parent-child xpath using tagnames
		driver.findElement(By.xpath("//div[@class=\"SDkEP\"]/div[2]")).sendKeys("mounika");
		
		//how to transverse to one sibling to another sibling write xpath till firstsibling/following-sibling::tagnameofnextsibling
		driver.findElement(By.xpath("//div[@id=\"fakebox-text\"]/following-sibling::input[1]")).clear();
		
		// we can transverse back from child to parent this can only happen in xpath cannot be done in css: write xpath for child/parent::tag name of parent
		driver.findElement(By.xpath("//div[@class=\"SDkEP\"]/parent::ul")).sendKeys("mounika");
		
		// xpath using text
		driver.findElement(By.xpath("//div[text()='SDkEP']"));
		
		
		// writing css
		// xpath = //tagname[@att=""]	css=tagname[att=""] 
		//  xpath = //*[@att=""]	css=[att=""]
		// if you know the iD how to write css----#id   eg:#exampleCheck1
		// for classname if there is space in class replace dot with space css with classname = .classname  eg: .form-control.ng-untouched.ng-pristine.ng-invalid
		
		

	}

}
