package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigUtility {

	private static Properties prop;
	static String configFilePath =Constants.PROPERTIES_FILEPATH;

	public static Properties readProperties() {
		try {
			FileInputStream fis = new FileInputStream(configFilePath);
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prop;
	}

//	public static String getProperty(String key) {
//		return prop.getProperty(key);
//	}

	public static String getProperty(String key) {
		try {
			FileInputStream fis = new FileInputStream(configFilePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
