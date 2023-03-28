package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-project\\Cucumber_Feb_5PM\\PropertieFile\\config.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String geturl() {
		String urllink = p.getProperty("url");
		return urllink;

	}

	public void getUser() {

	}

}
