package com.app.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties prop;
	public ConfigReader(){
		
		try {
			
			File src=new File("./app.Files/AppProperties.properties");
			FileInputStream fis= new FileInputStream(src);
			prop= new Properties();
			prop.load(fis);
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	//methods created for properties

	public String getbrowsername() {
	return prop.getProperty("browsername");
}
	
	public String getbrowserpath() {
		return prop.getProperty("browserpath");
	}
	
	public String getbrowser() {
		return prop.getProperty("Browser");
	}
	public String getbrowserurl() {
		return prop.getProperty("browserurl");
	}
	public String getusername() {
		return prop.getProperty("username");
	}
	
}