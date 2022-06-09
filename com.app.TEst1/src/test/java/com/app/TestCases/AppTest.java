package com.app.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.Utilities.BrowserFactory;
import com.app.Utilities.ConfigReader;


public class AppTest 
{
	BrowserFactory browser;
	ConfigReader readdata;


    @BeforeSuite
    public void setupsuite() {
    	browser =new BrowserFactory();
    	readdata=new ConfigReader();
    }
    
    @BeforeTest
    public void launchBrowser() {
    	browser.getBrowser(readdata.getbrowser(), readdata.getbrowserurl());
    }
	
	
    @Test
    
    public void shouldAnswerWithTrue()
    {
    	
    }
    @AfterTest
    
    public void closebrowser() {
    	
    	//Dr.close();
    }
}
