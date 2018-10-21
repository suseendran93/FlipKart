package org.pom.app;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTubeHomePage extends Base {

	@FindBy(xpath = "//input[@id='search']")
	private WebElement search;
	
	@FindBy(xpath="//button[@id=\"search-icon-legacy\"]")
	private WebElement button;

	@FindBy(xpath="//a[contains(text(),'Optimistic')]")
	private List<WebElement> links;
	


	public YouTubeHomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getButton() {
		return button;
	}
	public List<WebElement> getLinks() {
		return links;
	}
}
