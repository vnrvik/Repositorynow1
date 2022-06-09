package com.app.Utilities;


	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class BrowserFactory {
		
	public static WebDriver Driver;
	public static ConfigReader Reader;
		
	public static WebDriver getBrowser(String browsername, String appurl)
	{{
		
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./app.Drivers/chromedriver.exe");//using properties file and configreader
			Driver=new ChromeDriver();
		}
			if (browsername.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "./app.Drivers/geckodriver.exe");
				Driver=new FirefoxDriver();
			}
				if (browsername.equals("edge")) {
					System.setProperty("webdriver.edge.driver", "./app.Drivers/msedgedriver.exe");
					Driver=new EdgeDriver();
		}
		Driver.navigate().to(appurl);
		Driver.manage().window().maximize();
		
	}
	
	return Driver;
	
}}
