package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Actions {
	
	public static void captureScreenshot(WebDriver driver) throws IOException {
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String filepath = format.format(date)+".png";
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File scrshot=screenshot.getScreenshotAs(OutputType.FILE);
		
		File directory = new File("/Users/macbookpro/Downloads/Screenshot");
		directory.mkdirs();
		File file = new File(directory,filepath);
		file.createNewFile();
		FileUtils.copyFile(scrshot, file);

	}

	

	

}
