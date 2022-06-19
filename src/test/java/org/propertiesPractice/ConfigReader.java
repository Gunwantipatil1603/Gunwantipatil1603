package org.propertiesPractice;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	FileInputStream fis;
	Properties prop;
	public String getConfigTestData(String key)
	{
		try {
			fis = new FileInputStream("./PropertiesFiles/Config.properties");
			prop = new Properties();
			prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

}
