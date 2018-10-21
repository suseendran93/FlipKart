package org.pom.fun.FunStuff;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.pom.app.Base;
import org.pom.app.YouTubeHomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YouTubeHomePageTest extends Base {

	public YouTubeHomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static YouTubeHomePage youTube;

	@BeforeMethod
	public void initializeBrowser() throws IOException, InterruptedException {
		initialize(prop.getProperty("url"));
	}

	@Test

	public void searchTest() throws IOException, InterruptedException {
		youTube = new YouTubeHomePage();
		WebElement search = search(youTube.getSearch(), prop.getProperty("content"));
		btnClick(youTube.getButton());
		Thread.sleep(3000);
		System.out.println(search.getText());
		Assert.assertEquals(search.getText(), "Optimistic Nihilism");
	}

	@Test
	public void displayLinkTest() throws InterruptedException, IOException {
		youTube = new YouTubeHomePage();
		search(youTube.getSearch(), prop.getProperty("content"));
		btnClick(youTube.getButton());
		Thread.sleep(3000);
		List<WebElement> links = youTube.getLinks();
		for (WebElement x : links) {
			System.out.println(x.getAttribute("title"));
		}
	}

	@Test(dependsOnMethods = { "displayLinkTest" })
	// @Test
	public void clickLinkTest() throws InterruptedException, IOException {
		youTube = new YouTubeHomePage();
		search(youTube.getSearch(), prop.getProperty("content"));
		btnClick(youTube.getButton());
		Thread.sleep(3000);
		clickLink(youTube.getLinks(), 0);
		System.out.println("Link clicked");
	}

	@AfterMethod
	public void quit() {
		tearDown(driver);
	}
}
