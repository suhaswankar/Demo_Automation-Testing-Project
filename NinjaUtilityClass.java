package libraryfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class NinjaUtilityClass {
	
	
	public static String readpropertyfile(String key) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\SSK\\eclipse-workspace\\tutorialninja\\PropertyFile.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		String value = prop.getProperty(key);
		return value;
	}
	
	
	public static void screenshot(WebDriver driver, String name) throws IOException {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SSK\\eclipse-workspace\\tutorialninja\\screenshot"+name+".jpg");
		FileHandler.copy(scr, dest);
	
	}

}
