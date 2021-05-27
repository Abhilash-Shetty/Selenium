import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String name = "Mounika";
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chrome driver\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		String  text =	driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

	}

}
