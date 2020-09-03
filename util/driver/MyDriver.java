package com.tata.certificacion.despegar.util.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
	static WebDriver driver;

	public static MyDriver web() {
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		driver = new ChromeDriver();
		return new MyDriver();
	}
	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}
	

}
