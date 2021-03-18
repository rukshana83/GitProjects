package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\eclipse-workspace\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void launchUrl(WebDriver driver, String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void insert(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public static void btnClick(WebElement element)
	{
		element.click();
	}
	
	public static void quit(WebDriver driver)
	{
		driver.quit();
	}
	
	public static String text(WebElement element)
	{
		String text = element.getText();
		return text;
	}
	
	public static String attribute(WebElement element,String value)
	{
		String text = element.getAttribute(value);
		return text;
	}

}
