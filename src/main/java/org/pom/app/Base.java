package org.pom.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	// public static YouTubeHomePage youTube;
	public static WebDriver driver;
	public static Properties prop;

//	public Base() throws IOException {
//		// TODO Auto-generated constructor stub
//		prop = new Properties();
//		FileInputStream fi = new FileInputStream(
//				"C:\\Users\\ssndr\\eclipse-workspace\\YouTube\\src\\main\\java\\org\\pom\\app\\Data.properties");
//		prop.load(fi);
//	}

	public static void initialize(String url) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);

		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	public static WebElement search(WebElement element, String content) {
		element.sendKeys(content);
		return element;
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void tearDown(WebDriver driver) {
		driver.quit();
	}

	public static void clickLink(List<WebElement> elements, int linkToBeClicked) {
		elements.get(linkToBeClicked).click();
	}

}
