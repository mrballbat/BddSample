package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Properties;

public class PropertiesLoader {
	
	public static Properties loadProperties(String path) throws Exception {
		
		Properties prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(path);
			prop.load(file);
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prop;
	}
	
	

}
