package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	

	public static Properties configFile;

	static {

		try {
			String path = "/Users/nuhhacibektasoglu/git/KFFproject/prop.properties";
			FileInputStream input = new FileInputStream(path);

			configFile = new Properties();
			configFile.load(input);
		

			input.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static String getValue(String keyName) {
		return configFile.getProperty(keyName);
	}


}
