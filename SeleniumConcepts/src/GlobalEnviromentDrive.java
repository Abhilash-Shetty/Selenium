import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalEnviromentDrive {

	public static void main(String[] args) throws IOException {
		
		// There is Properties class which will accept or load  properties file
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\shmounik\\Selenium\\eclipse-workspaceNew\\SeleniumConcepts\\src\\Data.properties");	// we need to pass properties file path
		// to know location of any file right click on that file then click on properties then you can see location
		prop.load(fis);				// now give knowledge of location to properties class object
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("url", "http://gmail.com");		// you can change value at run time using set property
//if  you want to update the data file according to changes which you made at runtime eg:you have changed url at run time and if you want to change that in data file also means use FileOuputStream
		FileOutputStream fos = new FileOutputStream("C:\\Users\\shmounik\\Selenium\\eclipse-workspaceNew\\SeleniumConcepts\\src\\Data.properties");
		prop.store(fos, null);

	}

}
