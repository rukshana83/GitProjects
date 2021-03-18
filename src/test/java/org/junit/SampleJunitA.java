package org.junit;

import java.util.Date;
import org.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class SampleJunitA {
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		WebDriver driver = Base.launchBrowser();
		Base.launchUrl(driver, "https://www.facebook.com/");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\eclipse-workspace\\Selenium\\MavenOne\\Driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
	}
	@Before
	public void beforeDateTime() {
		Date dt = new Date();
		System.out.println(dt);
	}
	@Test
	public void assertTrue() {
		String currentUrl = driver.getCurrentUrl();
		boolean b = currentUrl.contains("facebook");
		Assert.assertTrue(b);
		System.out.println("1");
	}
	@Test
	public void assertEquals() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		//String user = txtUser.getAttribute("value");
		String user = Base.attribute(txtUser, "value");
		Assert.assertEquals("verify user", "greens", user);
		System.out.println("2");
	}
	@Ignore
	@Test
	public void test() {
		System.out.println("Ignore");
	}
	@After
	public void afterDateTime() {
		Date dt = new Date();
		System.out.println(dt);
	}
	@AfterClass
	public static void quit() {
		//driver.quit();
	}

}
